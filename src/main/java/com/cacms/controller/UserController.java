package com.cacms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cacms.model.UserReg;
import com.cacms.service.UserService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class UserController {

	@Autowired
	UserService service;

	public UserController(UserService service) {
		super();
		this.service = service;
	}

	@PostMapping("/addUser")
	public String userRegister(@RequestBody UserReg user) {
		service.addUser(user);
		String msg = "User Object Saved";
		return msg;
	}

	@GetMapping("/studentLogin/{email}/{password}")
	public ResponseEntity<?>  validateLogin(@PathVariable("email") String email, @PathVariable("password") String password) {
		try {
			UserReg user=service.studentLogin(email, password);
			if(user != null) {
				return ResponseEntity.ok(user);
			}
		} catch (Exception e) {
			
		}
		
		return (ResponseEntity<?>) ResponseEntity.badRequest();
	}

	@GetMapping("/getUsers")
	public List<UserReg> getAll() {
		return service.getAllUsers();

	}
	
	@PutMapping("/userUpdate")
	public String userUpadet(@RequestBody UserReg user) {
		service.updateUser(user);
		String msg = "User Object Updated";
		return msg;
	}
}
