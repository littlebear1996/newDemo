package com.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.UserAdminDao;
import com.demo.service.UserAdminService;

@Service
public class UserAdminServiceImpl implements UserAdminService {

	@Autowired
	private UserAdminDao userAdminDao; 
	@Override
	public String getAdminPasswordByAdminName(String adminName) {
		return userAdminDao.getAdminPasswordByAdminName(adminName);
	}

}
