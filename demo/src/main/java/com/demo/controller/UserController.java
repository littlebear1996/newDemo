package com.demo.controller;

import java.util.List;  

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;  

import com.demo.projo.User;
import com.demo.service.UserService;
 
@Controller  
public class UserController {  
    @Autowired  
    private UserService userService;  
    /**
     * 项目进入的第一个页面（首页）
     * @return
     */
    @RequestMapping("/")    
    public ModelAndView getIndex(){      
        ModelAndView mav = new ModelAndView("index");    
        return mav;    
    }
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
	 *  添加用户(数据正确时)并重定向
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/addUser",method={RequestMethod.POST})
	public String addUserCheck(@Valid @ModelAttribute("user")User user,BindingResult result){
		if(result.hasErrors()){
			return "addUser";
		}else{
			
		    userService.addUser(user);
		    return "redirect:/getAllUser";
		}
	}
	@ModelAttribute("user")  
    public User getUser(){  
        User user=new User();  
        return user;  
    }  
	@RequestMapping(value="/addUser",method={RequestMethod.GET})
	public String addUser(){
		return "addUser";
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