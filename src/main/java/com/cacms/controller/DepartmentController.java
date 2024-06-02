package com.cacms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cacms.model.Departments;
import com.cacms.model.UserReg;
import com.cacms.service.DepartmentService;

@RestController
@CrossOrigin("http://localhost:3000")
public class DepartmentController {
	
	@Autowired
	DepartmentService department;
	
	public DepartmentController(DepartmentService dept) {
		super();
		this.department = dept;	
		
	}	
	
	@PostMapping("/addDepartment")
	public String adddepartment (@RequestBody Departments dept) {		
		department.addDept(dept);
		String msg = "User Object Saved";
		return msg;
	}
	
	@GetMapping("/getDepts")
	public List<Departments> getAllDept()
	{
		return department.getAllDepertment();
		
	}
	@PutMapping("/deptUpdate")
	public String userUpadet(@RequestBody Departments dept) {
		department.updateDept(dept);
		String msg = "User Object Updated";
		return msg;
	}
	
	
	@DeleteMapping("/deptDelete/{id}")
	public ResponseEntity<String> userUpadet(@PathVariable("id") int id) {
		
		try {
			department.deleteDept(id);
			return ResponseEntity.ok("Success");
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("failed");
		}	
	}
	
	@GetMapping("/getDeptNames")
	public List<Departments> getAllDeptName()
	{
		return department.getAlldeptName();
		
	}
	
	@GetMapping("/getUgDetNames")
	public List<Departments> getPgDepartments(){
		return department.getUgdeptName();
	}
	
	@GetMapping("/getPgDetNames")
	public List<Departments> getUgDepartments(){
		return department.getPgdeptName();
	}
	@GetMapping("/getPgDeptDetails")
	public List<Departments> getPgDeptDetails(){
		return department.getAllPgDetails();
	}
	
	@GetMapping("/getUgDeptDetails")
	public List<Departments> getUgDeptDetails(){
		return department.getAllUgDetails();
	}
	
}
