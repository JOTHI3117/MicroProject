package com.cacms.dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cacms.model.Application;
import com.cacms.model.Staff;
import com.cacms.model.Transaction;

import jakarta.persistence.EntityManager;
@Repository
public class TransactionDaoImpl implements TransactionDao {
	
	@Autowired
	EntityManager em;

	@Override
	public void createTransaction(Transaction transaction) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.now();
		String curDate = date.format(formatter).toString();
		
		transaction.setTransactionDate(curDate);
		
		em.persist(transaction);
		
		
	}

	@Override
	public List<Transaction> getTransaction() {
		
		return em.createQuery("from Trancation").getResultList();
	}

}
