package com.cacms.junittesting;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.cacms.dao.ApplicationDao;
import com.cacms.model.Application;
@SpringBootTest
class ApplicationTest {
	@Autowired
	ApplicationDao dao;
	@Test
	void test_FindAllApplication() {
		List<Application> application = dao.getAllApplication();
		assertNotNull(application);
	}
	@Test
	void test_FindByApplicationId() {
		Application application = dao.findById(41);
		assertNotNull(application);
	}
	@Test
	void test_FindApplicationByUserId() {
		Application application = dao.findById(41);
		assertNotNull(application);
	}
}
