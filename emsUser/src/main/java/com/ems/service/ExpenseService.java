package com.ems.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dao.ExpenseDaoImpl;
import com.ems.model.Expense;

@Service
public class ExpenseService {

	@Autowired
	ExpenseDaoImpl ex;
	
	
	
	
	/**
	 * This service method is used for adding expenses into the databases
	 * @param e
	 * @throws ParseException 
	 */
	public void addExpense(Expense e) throws ParseException{
		ex.addExpense(e);
	}
	
	
	public List<Expense> getallexpenses(){
		
		return ex.viewallExpense();
	}
	
	
}
