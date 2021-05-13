package com.LogInRegisterMvcdao;

import com.LogInRegisterMvcmodel.Login;
import com.LogInRegisterMvcmodel.User;

public interface UserDao {

  int register(User user);

  User validateUser(Login login);
}