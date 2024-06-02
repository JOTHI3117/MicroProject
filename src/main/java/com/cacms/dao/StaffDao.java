package com.cacms.dao;

import java.util.List;

import com.cacms.model.Departments;
import com.cacms.model.Staff;

public interface StaffDao {
	
	public void addStaff(Staff staff);

	public Staff staffLogin(String staffName, String password);
	
	public List<Staff> getAllStaff();

	public boolean updateDept(Staff staff);
	
	public void deleteStaff(int staffId);

}
