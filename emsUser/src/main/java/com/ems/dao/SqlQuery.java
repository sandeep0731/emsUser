package com.ems.dao;

public class SqlQuery {

	public static final String add_expense = "INSERT INTO expense" + 
	                                         "(expense_name, expense_desc, expense_amount, expense_category, date ,notes, user_id, created_by)"
		                                     + "VALUES (?,?,?,?,?,?,?,?)";
	public static final String fetch_pass="SELECT * FROM exms.users where email= ?";
	
	public static final String fetch_all_expenses= "SELECT * from exms.expense";
	
}
