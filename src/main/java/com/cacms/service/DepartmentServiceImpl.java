package com.cacms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cacms.dao.DepartmentDao;
import com.cacms.model.Departments;
import com.cacms.model.UserReg;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentDao dao;

	@Override
	public void addDept(Departments dept) {
		dao.addDept(dept);

	}

	@Override
	public List<Departments> getAllDepertment() {
		return dao.getAllDepertment();
	}

	@Override
	public boolean updateDept(Departments dept) {

		return dao.updateDept(dept);
	}

	@Override
	public void deleteDept(int id) {
		
		dao.deleteDept(id);

	}

	@Override
	public List<Departments> getAlldeptName() {
		
		return dao.getAlldeptName();
	}

	@Override
	public List<Departments> getPgdeptName() {
		
		return dao.getPgDept();
	}

	@Override
	public List<Departments> getUgdeptName() {
		
		return dao.getUgDept();
	}

	@Override
	public List<Departments> getAllPgDetails() {
		// TODO Auto-generated method stub
		return dao.getAllPgDetails();
	}

	@Override
	public List<Departments> getAllUgDetails() {
		// TODO Auto-generated method stub
		return dao.getAllUgDetails();
	}

}
