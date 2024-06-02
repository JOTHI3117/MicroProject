package com.cacms.dao;

import java.util.List;

import com.cacms.model.Application;
import com.cacms.model.Staff;
import com.cacms.model.Transaction;

public interface TransactionDao {

	public void createTransaction(Transaction transaction);

	public List<Transaction> getTransaction();

}
