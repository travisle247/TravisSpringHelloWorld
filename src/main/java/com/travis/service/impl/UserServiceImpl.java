package com.travis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.travis.dao.UserDao;
import com.travis.model.Login;
import com.travis.model.User;
import com.travis.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Transactional
	 public void register(User user) {
		 userDao.register(user);
	 }
	@Transactional
	  public User validateUser(Login login)
	  {
		  return userDao.validateUser(login);
	  }
}
