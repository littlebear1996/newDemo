package com.demo.dao;

public interface UserAdminDao {

	/**
	 * 通过管理员用户名获取管理员密码
	 * @param adminName
	 * @return
	 */
	public String getAdminPasswordByAdminName(String adminName);
}
