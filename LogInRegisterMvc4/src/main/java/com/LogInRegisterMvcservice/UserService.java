package com.LogInRegisterMvcservice;

import com.LogInRegisterMvcmodel.Login;
import com.LogInRegisterMvcmodel.User;

public interface UserService {

  int register(User user);

  User validateUser(Login login);
}
