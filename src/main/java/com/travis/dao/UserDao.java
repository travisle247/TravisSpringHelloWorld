package com.travis.dao;

import com.travis.model.Login;
import com.travis.model.User;

public interface UserDao {
	  void register(User user);
	  User validateUser(Login login);
}