package com.LogInRegisterMvcservice;

import org.springframework.beans.factory.annotation.Autowired;

import com.LogInRegisterMvcdao.UserDao;
import com.LogInRegisterMvcmodel.Login;
import com.LogInRegisterMvcmodel.User;


public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(User user) {
    return userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}