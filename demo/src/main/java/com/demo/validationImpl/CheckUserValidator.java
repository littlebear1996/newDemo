package com.demo.validationImpl;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.dao.OrderDao;
import com.demo.validation.CheckUser;

public class CheckUserValidator implements ConstraintValidator<CheckUser,String>{

	@Autowired
	private OrderDao orderDao; 
	
	@Override
	public void initialize(CheckUser arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		List<String> userNameList = orderDao.getAllUserName();
		for (String string : userNameList) {
			if(arg0.equals(string)){
				return true;
			}
		}
		return false;		
	}

}
