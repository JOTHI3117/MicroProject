package com.cacms.junittesting;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.cacms.dao.DepartmentDao;
import com.cacms.model.Departments;
@SpringBootTest
class DepartmentTest {
	@Autowired
	DepartmentDao dao;	
	@Test
	void test_FindAllDepartment() {
		List<Departments> department =dao.getAllDepertment();
		assertNotNull(department);
	}	
	@Test
	void test_FindAllDeptName() {
		List<Departments> department =dao.getAlldeptName();
		assertNotNull(department);
	}	
	@Test
	void test_findUgDept() {
		List<Departments> department =dao.getAllUgDetails();
		assertNotNull(department);
	}	
	@Test
	void test_findPgDept() {
		List<Departments> department =dao.getAllUgDetails();
		assertNotNull(department);
	}	
	@Test
	void test_getAllPgDetails() {
		List<Departments> department =dao.getAllPgDetails();
		assertNotNull(department);
	}	
	@Test
	void test_getAllUgDetails() {
		List<Departments> department =dao.getAllUgDetails();
		assertNotNull(department);
	}
}
