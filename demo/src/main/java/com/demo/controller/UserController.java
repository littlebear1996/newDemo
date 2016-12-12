package com.demo.controller;

import java.util.List;  

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.projo.User;
import com.demo.service.UserService;
import com.demo.validation.Checker;
 
@Controller  
public class UserController {  
    @Autowired  
    private UserService userService;
    /**
     * 用户登录验证控制器
     * @param userName
     * @param password
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value="/register",method={RequestMethod.POST})
    public String registerCheck(String userName,String password,HttpSession hs
    		,HttpServletRequest request){
    	//明文验证问题  注意实现密文  
    	if(password.equals(userService.getPasswordByUserName(userName))){ 
    	     hs.setAttribute("userName",userName);
    		return "redirect:/showOrder";
    	}else{
    		request.setAttribute("loginError", "用户名或密码错误");
    		return "/register";
    	}
    }
    @RequestMapping(value="/register",method={RequestMethod.GET})
    public String register(){
    	return "register";
    }
    @RequestMapping("/success")
    public String successPage(){
    	return "success";
    }
    
    /**
	 *  获取所有用户列表
	 */
	@RequestMapping("/getAllUser")
	public String getAllUser(HttpServletRequest request,Model model){
		List<User> list = userService.listAll();
		model.addAttribute("userList", list);
		return "/allUser";
	}
	/**
	 *  添加用户(数据正确时)并重定向
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/addUser",method={RequestMethod.POST})
	public String addUserCheck(@Validated(value={Checker.class}) User user,BindingResult result){
		if(result.hasErrors()){
			return "addUser";
		}else{
            userService.addUser(user);
		    return "redirect:/register";
		}
	}
	@ModelAttribute("user")  
    public User getUser(){  
        User user=new User();  
        return user;  
    }  
	@RequestMapping(value="/toAddUser",method={RequestMethod.GET})
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