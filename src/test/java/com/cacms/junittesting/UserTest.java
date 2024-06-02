package com.cacms.junittesting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cacms.dao.UserDao;
import com.cacms.model.Application;
import com.cacms.model.UserReg;


@SpringBootTest
class UserTest {

	@Autowired
	UserDao dao;
	
	
	@Test
	 
	public void test_FindAllUsers() {
		List<UserReg> user=dao.getAllUsers();
		assertNotNull(user);
	}
	
	
	@Test
	public void test_FindById() {
		UserReg application=dao.findById(2);
		assertNotNull(application);
	}
}
