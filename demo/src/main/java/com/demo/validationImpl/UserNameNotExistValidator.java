package com.demo.validationImpl;
import java.util.List;

import javax.validation.ConstraintValidator;    
import javax.validation.ConstraintValidatorContext;    

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.service.UserService;
import com.demo.validation.UserNameNotExist;
    
public class UserNameNotExistValidator implements ConstraintValidator<UserNameNotExist, String> {    
    @Autowired
    private UserService userService;
	@Override    
    public void initialize(UserNameNotExist arg0) {        
    }    
    
    @Override    
    public boolean isValid(String str, ConstraintValidatorContext constraintValidatorContext) {    
        List<String> list = userService.getAllUserName();
        for (String str1 : list) {
			if(str1.equals(str)){
				return false;
			}
		}
    	return true;
    
   } 
}