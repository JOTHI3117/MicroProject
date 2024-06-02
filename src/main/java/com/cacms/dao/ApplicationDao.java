package com.cacms.dao;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.cacms.model.Application;



public interface ApplicationDao {
	
	public void applyApplication(
			String name,
			 long mobileNumber,
			 String gender,
			 String dob,
			 String fatherName,
			 String motherName,
			 long parentsMobile,
			 String religion,
			 double sslcMark,
			 double twelthmark,
			 String degreeType,
			 String address,
			 String state,
			 long pincode,		
			 MultipartFile profileImage,
			  int userId,
			  int id) throws IOException;


	public List<Application> getAllApplication();

	public void updateApplication(Application application );
	
	public void deleteApplication(int applicationId);
	
	public Application findById(int applicationId);
	
//	public String updateStatusByApplicationId(String status) ;
	
	public Application findByUserId(int userId);
	
	
	


}
