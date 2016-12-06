package com.demo.controller;

import java.util.List;  

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  

import com.demo.projo.User;
import com.demo.service.UserService;
 
@Controller  
public class UserController {  
    @Autowired  
    private UserService userService;  
 
    /**
	 *  获取所有用户列表
	 */
	@RequestMapping("/getAllUser")
	public String getAllUser(HttpServletRequest request,Model model){
		List<User> list = userService.listAll();
		model.addAttribute("userList", list);
		request.setAttribute("userList", list);
		return "/allUser";
	}
	/**
	 *  跳转到添加用户界面
	 * @return
	 */
	@RequestMapping("/toAddUser")
	public String toAddUser(){
		return "addUser";
	}
	/**
	 *  添加用户并重定向
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping("/addUser")
	public String addUser(User user,Model model){
		userService.addUser(user);
		return "redirect:/getAllUser";
	}
	/**
	 *  编辑用户
	 * @param user
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/updateUser")
	public String updateUser(User user,HttpServletRequest request,Model model){
		if(userService.updateUser(user)){
			user = userService.findUserById(user.getUserId());
			model.addAttribute("user",user);
			request.setAttribute("user", user);
			return "redirect:getAllUser";
		}else{
			return "/error";
		}
	}
	/**
	 * 通过userId查找单个用户
	 * @param userId
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/getUser")
	public String getUser(int userId,HttpServletRequest request,Model model){
		request.setAttribute("user", userService.findUserById(userId));
		model.addAttribute("user", userService.findUserById(userId));
		return "/editUser";
	}
	@RequestMapping("/delUser")
	public String delUser(int userId,Model model){
		if(userService.delUser(userId)){
			return "redirect:getAllUser";
		}else{
			return "/error";
		}  
	}
} 