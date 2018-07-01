package com.ems.model;

import java.util.Date;

/*
  create table `exms`.`expense` (
  `expense_id` INT NOT NULL auto_increment,
  `expense_name` VARCHAR(50) NOT NULL,
  `expense_desc` VARCHAR(50) NOT NULL,
  `expense_amount` DECIMAL(10,2) NOT NULL,
  `expense_category` VARCHAR(50) NOT NULL,
  `date` DATETIME NOT NULL,
  `notes` VARCHAR(200) NOT NULL,
  `user_id` INT NOT NULL,
  `created_by` VARCHAR(45) NULL,
  `created_on` DATETIME NULL,
  `changed_by` VARCHAR(45) NULL,
  `changed_on` DATETIME NULL,
  FOREIGN KEY (user_id) REFERENCES users(user_id),
  primary key(`expense_id`));

 */
public class Expense {

	int expense_id;
	String expense_name;
	String expense_desc;
	float expense_amount;
	String  expense_category;
	String exp_date;
	String notes;
	int user_id;
	String created_by;
	Date created_on;
	String changed_by;
	Date changed_on;
	
	
	
	public int getExpense_id() {
		return expense_id;
	}
	public void setExpense_id(int expense_id) {
		this.expense_id = expense_id;
	}
	
	public String getExpense_name() {
		return expense_name;
	}
	public void setExpense_name(String expense_name) {
		this.expense_name = expense_name;
	}
	
	public String getExpense_desc() {
		return expense_desc;
	}
	public void setExpense_desc(String expense_desc) {
		this.expense_desc = expense_desc;
	}
	
	public float getExpense_amount() {
		return expense_amount;
	}
	public void setExpense_amount(float expense_amount) {
		this.expense_amount = expense_amount;
	}
	
	public String getExpense_category() {
		return expense_category;
	}
	public void setExpense_category(String expense_category) {
		this.expense_category = expense_category;
	}
	
	public String getExp_date() {
		return exp_date;
	}
	public void setExp_date(String exp_date) {
		this.exp_date = exp_date;
	}
	
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	
	public String getChanged_by() {
		return changed_by;
	}
	public void setChanged_by(String changed_by) {
		this.changed_by = changed_by;
	}
	
	public Date getChanged_on() {
		return changed_on;
	}
	public void setChanged_on(Date changed_on) {
		this.changed_on = changed_on;
	}
	
	
	
}
