package com.demo.service;

import java.util.List;

import com.demo.projo.User;

public interface UserService {

	/**
	 * 通过用户Id查找用户
	 * @param userId
	 * @return
	 */
	public User findUserById(int userId);
	/**
	 * 添加用户
	 * @param user
	 */
	public void addUser(User user);
	/**
	 * 通过用户Id删除用户
	 * @param userId
	 */
	public boolean delUser(int userId);
	/**
	 * 更新用户
	 * @param user
	 */
	public boolean updateUser(User user);
	/**
	 * 列出目前所存在的所有用户
	 * @return
	 */
	public List<User> listAll();
}
