package com.cacms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cacms.model.Staff;
import com.cacms.model.Transaction;
import com.cacms.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	TransactionService service;

	@PostMapping("/createTransaction")
	public ResponseEntity<String> createTransaction(@RequestBody Transaction transaction) {
		try {
			service.createTransaction(transaction);
			return ResponseEntity.ok("Success");
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("Failed");
		}
	}

}
