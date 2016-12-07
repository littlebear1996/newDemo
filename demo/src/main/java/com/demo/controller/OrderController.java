package com.demo.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;





import com.demo.projo.Order;
import com.demo.service.OrderService;


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
		
		
		return "/index";
	}
//	@RequestMapping("/")
//	public ModelAndView getIndex(){
//		ModelAndView mav = new ModelAndView("index");
//		return mav;
//	}
	/**
	 * 获取所有订单
	 */
	@RequestMapping("/showOrder")
	public String getAllOrder(Map<String,Object> map){
		map.put("orderList", orderService.selectAllOrder());
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
	public String addOrder(@Valid Order order,BindingResult result) {
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
	public String updateOrder(Order order){
		if(orderService.updateOrder(order)){
			return "redirect:/showOrder";
		}else{
			return "/error";
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
