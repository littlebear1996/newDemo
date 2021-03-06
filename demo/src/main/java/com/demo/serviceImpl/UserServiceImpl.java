package com.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.UserDao;
import com.demo.projo.User;
import com.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Override
	public User findUserById(int userId) {
		User user = userDao.findUserById(userId);
		return user;
	}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);	
	}

	@Override
	public boolean delUser(int userId) {
		return userDao.delUser(userId);	
	}

	@Override
	public boolean updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public List<User> listAll() {
		List<User> list = userDao.listAll();
		return list;
	}

	@Override
	public List<String> getAllUserName() {
		List<String> list = userDao.getAllUserName();
		return list;
	}

	@Override
	public String getPasswordByUserName(String userName) {
		 return userDao.getPasswordByUserName(userName); 
	}

}
