package com.demo.projo;

public class User {

	private int userId;
	private String userName;
	private String password;
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
