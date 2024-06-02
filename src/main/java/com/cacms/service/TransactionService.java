package com.cacms.service;

import java.util.List;

import com.cacms.model.Application;
import com.cacms.model.Staff;
import com.cacms.model.Transaction;

public interface TransactionService {
	
	public void createTransaction(Transaction transaction);

	public List<Transaction> getTransaction();

}
