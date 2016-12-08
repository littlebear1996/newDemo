package com.demo.validationImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.demo.validation.CheckMony;

public class CheckMonyValidator implements
		ConstraintValidator<CheckMony, String> {

	@Override
	public void initialize(CheckMony arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		try {
			Double.parseDouble(arg0);
			return true;
			
		} catch (NumberFormatException ex){}
		return false;
	}
}