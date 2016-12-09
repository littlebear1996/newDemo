package com.demo.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;







import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.demo.projo.Order;
import com.demo.service.OrderService;
import com.demo.validation.Checker;


/**
 * 订单处理
 * @author huanhuan.jin
 *
 */
@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;
	/**
	 * 首页
	 */
	@RequestMapping("/")
	public String getIndex() {
		
		
		return "/register";
	}
//	@RequestMapping("/")
//	public ModelAndView getIndex(){
//		ModelAndView mav = new ModelAndView("index");
//		return mav;
//	}
	/**
	 * 获取某个用户的所有订单
	 */
	@RequestMapping("/showOrder")
	public String getAllOrder(String userName,HttpSession hs, Map<String,Object> map){
		if(null==userName){
		  userName = (String) hs.getAttribute("userName");
		   map.put("userName", userName);
		}
		map.put("orderList", orderService.getOrderByUserName(userName));
		return "/showOrder";
	}
	/**
	 * 跳转到添加订单页面
	 */
	@RequestMapping("/toAddOrder")
	public String toAddOrder(ModelMap model){
		model.addAttribute("order", new Order());
		return "/addOrder";
	}
	/**
	 * 添加订单并重定向到show页面
	 */
	@RequestMapping("/addOrder")
	public String addOrder(@Validated(value={Checker.class}) Order order,BindingResult result
			) {
		if (!result.hasErrors()) {  
			orderService.insertOrder(order);
			return "redirect:/showOrder";
        }  
		else {
			return "/addOrder";
		}
	}
	/**
	 * 通过orderId查找单个用户
	 */
	@RequestMapping("/getOrder")
	/*public String getOrder(int orderId,Model model){
		model.addAttribute("order", orderService.selectOrderById(orderId));
		return "/editOrder";
	}*/
	public String getOrder(int orderId,HttpServletRequest request){
		request.setAttribute("order", orderService.selectOrderById(orderId));
		return "/editOrder";
	}
	/**
	 * 修改订单
	 */
	@RequestMapping("/updateOrder")
	public String updateOrder(@Validated(value={Checker.class}) Order order,
			BindingResult result){
		if (!result.hasErrors()) {  
			orderService.updateOrder(order);
			return "redirect:/showOrder";
        }  
		else {
			return "/editOrder";
		}
	}
	/**
	 * 通过订单编号删除订单
	 * @param orderId
	 * @return
	 */
	@RequestMapping("/delOrder")
	public String delOrder(int orderId){
		if(orderService.deleteOrderById(orderId)){
			return "redirect:/showOrder";
		}else{
			return "/error";
		}  
	}
}
