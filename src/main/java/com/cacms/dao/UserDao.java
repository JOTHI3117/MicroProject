package com.cacms.dao;

import java.util.*;
import com.cacms.model.UserReg;

public interface UserDao {

	public void addUser(UserReg user);

	public UserReg studentLogin(String email, String password);

	public List<UserReg> getAllUsers();

	public boolean updateUser(UserReg user);
	
	public UserReg findById(int userId);

}
