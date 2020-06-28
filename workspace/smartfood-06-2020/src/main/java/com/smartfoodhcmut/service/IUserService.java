package com.smartfoodhcmut.service;

import com.smartfoodhcmut.model.UserModel;

public interface IUserService {
	UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
}
