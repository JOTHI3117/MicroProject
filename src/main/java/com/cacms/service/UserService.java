package com.cacms.service;

import java.util.List;

import org.jvnet.hk2.annotations.Service;

import com.cacms.model.Application;

import com.cacms.model.UserReg;

import jakarta.transaction.Transactional;


public interface UserService {
	
      public void addUser(UserReg user);
	
      public UserReg studentLogin(String email,String password);
      
      public List<UserReg> getAllUsers();
      
      public boolean updateUser(UserReg user);
      
     
      
     
}
