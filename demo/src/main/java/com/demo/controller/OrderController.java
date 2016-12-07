package com.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




import org.springframework.web.servlet.ModelAndView;

import com.demo.projo.Order;
import com.demo.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;
	/**
	 * 首页
	 */
	@RequestMapping("/view")
	public ModelAndView getIndex(){
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
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
	public String toAddOrder(){
		return "/addOrder";
	}
	/**
	 * 添加订单并重定向
	 */
	@RequestMapping("/addOrder")
	public String addOrder(Order order,Model model){
		orderService.insertOrder(order);;
		return "redirect:/showOrder";
	}
	/**
	 * 通过orderId查找单个用户
	 * @param orderId
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/getOrder")
	public String getOrder(int orderId,HttpServletRequest request,Model model){
		request.setAttribute("order", orderService.selectOrderById(orderId));
		model.addAttribute("order", orderService.selectOrderById(orderId));
		return "/editOrder";
	}
	/**
	 * 修改订单
	 */
	@RequestMapping("/updateOrder")
	public String updateOrder(Order order,HttpServletRequest request,Model model){
		if(orderService.updateOrder(order)){
			order = orderService.selectOrderById(order.getOrderId());
			model.addAttribute("order",order);
			request.setAttribute("order", order);
			return "redirect:showOrder";
		}else{
			return "/error";
		}
	}
	@RequestMapping("/delOrder")
	public String delOrder(int orderId,Model model){
		if(orderService.deleteOrderById(orderId)){
			return "redirect:showOrder";
		}else{
			return "/error";
		}  
	}
}
