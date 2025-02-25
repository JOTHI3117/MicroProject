package com.cacms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cacms.model.Departments;
import com.cacms.model.Staff;
import com.cacms.model.UserReg;
import com.cacms.service.StaffService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class StaffDaoImpl implements StaffDao {

	@Autowired
	EntityManager em;

	@Override
	public void addStaff(Staff staff) {
		em.persist(staff);
	}

	@Override
	public List<Staff> getAllStaff() {

		return em.createQuery("from Staff").getResultList();
	}

	@Override
	public boolean updateDept(Staff staff) {
		em.merge(staff);
		return true;
	}

	@Override
	public void deleteStaff(int staffId) {
		Staff staff = em.find(Staff.class, staffId);
		em.remove(staff);
	}

	@Override
	public Staff staffLogin(String staffName, String password) {

		Query q = em.createQuery("from Staff log where log.staffName =?1 and log.password=?2");
		q.setParameter(1, staffName);
		q.setParameter(2, password);
		return (Staff) q.getSingleResult();

	}
}
