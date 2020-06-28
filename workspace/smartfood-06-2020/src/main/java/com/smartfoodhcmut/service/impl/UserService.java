package com.smartfoodhcmut.service.impl;

import javax.inject.Inject;

import com.smartfoodhcmut.dao.IUserDAO;
import com.smartfoodhcmut.model.UserModel;
import com.smartfoodhcmut.service.IUserService;

public class UserService implements IUserService {

	@Inject
	private IUserDAO userDAO;
	
	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {	
		return userDAO.findByUserNameAndPasswordAndStatus(userName, password, status);
	}

}
