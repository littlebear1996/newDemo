package com.demo.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.service.UserAdminService;

@Controller
public class UserAdminController {

	@Autowired
	private UserAdminService userAdminService;
	/**
	 * 管理员登录验证器
	 * @param adminName
	 * @param adminPassword
	 * @return
	 */
	@RequestMapping(value="/adminRegister",method={RequestMethod.POST})
	public String adminRegisterCheck(@Param("adminName")String adminName,
			@Param("adminPassword")String adminPassword){
		if(adminPassword.equals(userAdminService.getAdminPasswordByAdminName(adminName))){
			return "redirect:/getAllUser";
		}
		return "adminRegister";
	}
	@RequestMapping(value="/adminRegister",method={RequestMethod.GET})
	public String adminRegister(){
		return "adminRegister";
	}
}
