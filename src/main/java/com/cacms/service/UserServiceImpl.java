package com.cacms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cacms.dao.UserDao;
import com.cacms.model.Application;

import com.cacms.model.UserReg;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired(required = true)
	UserDao dao;

	@Override
	public void addUser(UserReg user) {
		dao.addUser(user);
	}

	@Override
	public UserReg studentLogin(String email, String password) {
		UserReg user=null;
		try {
			user=dao.studentLogin(email, password);
		} catch (Exception e) {
			user=null;
			e.printStackTrace();
		}
		return user;

	}

	@Override
	public List<UserReg> getAllUsers() {

		return dao.getAllUsers();
	}

	@Override
	public boolean updateUser(UserReg user) {

		return dao.updateUser(user);
	}

	

//	@Override
//	public Documents findById(Application findById) {
//		// TODO Auto-generated method stub
//		return null;
	}

//	@Override
//	public Documents fidById(Application findById) {
//		return dao.findById(findById);
//	}


