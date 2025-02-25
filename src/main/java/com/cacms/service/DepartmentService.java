package com.cacms.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cacms.model.Departments;
import com.cacms.model.UserReg;

public interface DepartmentService {
		
	public void addDept(Departments dept);

	public List<Departments> getAllDepertment();

	public boolean updateDept(Departments dept);
	
	public void deleteDept(int id);
	public List<Departments> getAlldeptName();
	
		public List<Departments> getPgdeptName();
	
	public List<Departments> getUgdeptName();
	
	public List<Departments> getAllPgDetails();
	
	public List<Departments> getAllUgDetails();

}
