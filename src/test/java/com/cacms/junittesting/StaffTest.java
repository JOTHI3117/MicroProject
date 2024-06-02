package com.cacms.junittesting;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.cacms.dao.StaffDao;
import com.cacms.model.Staff;
@SpringBootTest
class StaffTest {	
	@Autowired
	StaffDao dao;
	@Test
	void test_FindAllDepartment() {
		List<Staff> staff =dao.getAllStaff();
		assertNotNull(staff);
	}	
	@Test
	void test_ValidateAdminLogin() {
		Staff staff =dao.staffLogin("Abishek", "jothi@2000");
		assertNotNull(staff);
	}
}
