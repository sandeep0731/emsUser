package com.ems.dao;

import java.util.HashMap;
import java.util.List;

import com.ems.model.Expense;

public interface ExpenseDao {

	
	
	public void addExpense(Expense exp);  //adding expense
	
	public void delExpense(int exp_id);  //deleting expense
	
	public void viewExpense(int exp_id);  //viewing a particular expense
	
	public void editExpense(int exp_id);  //edit an expense

	public List<Expense> viewallExpense();

	
	
	
}
