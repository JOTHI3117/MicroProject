package com.cacms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cacms.dao.TransactionDao;
import com.cacms.model.Transaction;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionDao dao;

	@Override
	public List<Transaction> getTransaction() {

		return dao.getTransaction();
	}

	@Override
	public void createTransaction(Transaction transaction) {
		dao.createTransaction(transaction);

	}

}
