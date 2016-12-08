package com.demo.projo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.demo.validation.Group1;
import com.demo.validation.Group2;
import com.demo.validation.Group3;
import com.demo.validation.UserNameNotExist;

/**
 * 用户Bean以及用户格式验证类
 * @author jianxiong.lei
 *
 */
public class User {
	private int userId;
	@UserNameNotExist(groups=Group3.class)
	@Pattern(groups=Group2.class,regexp = "^[a-zA-z][a-zA-Z0-9_]{2,9}$", message = "3-10位的字母下划线和数字组成,不能以数字或下划线开头。")
	@NotEmpty(groups=Group1.class,message="用户名不能为空")
	private String userName;
	@NotEmpty(groups=Group1.class, message="密码不能为空")
	@Length(groups=Group2.class,min=6,max=16,message="密码长度不正确，必须在6-16位字母或数字组合")
	private String password;
	@NotEmpty(groups=Group1.class,message="邮箱不能为空")
	@Email(groups=Group2.class,message="邮箱格式不正确")
	private String userMail;	
	public User() {
	}
	public User(int userId, String userName, String password, String userMail) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.userMail = userMail;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", password=" + password + ", userMail=" + userMail + "]";
	}
}
