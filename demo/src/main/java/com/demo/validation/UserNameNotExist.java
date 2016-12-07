package com.demo.validation;
import java.lang.annotation.Documented;    
import java.lang.annotation.Retention;    
import java.lang.annotation.Target;    

import javax.validation.Constraint;    
import javax.validation.Payload;    

import com.demo.validationImpl.UserNameNotExistValidator;
    
@Constraint(validatedBy = UserNameNotExistValidator.class) //具体的实现    
@Target( { java.lang.annotation.ElementType.METHOD,    
    java.lang.annotation.ElementType.FIELD })    
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)    
@Documented    
public @interface UserNameNotExist {    
    String message() default "用户名已存在"; //提示信息,可以写死,可以填写国际化的key            
    //下面这两个属性必须添加    
    Class<?>[] groups() default {};    
    Class<? extends Payload>[] payload() default {};    
        
}    