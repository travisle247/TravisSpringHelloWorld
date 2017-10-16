package com.travis.service;
import com.travis.model.Login;
import com.travis.model.User;

public interface UserService {
	 void register(User user);
	  User validateUser(Login login);
}
