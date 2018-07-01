package com.ems.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ems.model.Expense;


@Repository
public class ExpenseDaoImpl implements ExpenseDao{

	
	
	
	private DataSource dataSource;
	 
	private JdbcTemplate jdbcTemplate;
	
	java.util.Date date;
	
	public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
	
	@Override
	public void addExpense(Expense exp) {
		// Code to add an expense in the DB
		//INSERT INTO `exms`.`expense` (`expense_id`, `expense_name`, `expense_desc`, `expense_amount`, `expense_category`, `notes`, `user_id`, `created_by`) 
		//VALUES ('1', 'Grofers-Monthly', 'Grofers Monthly Grocery', '1129', 'GROCERY', 'No Notes. This is a test.', '1', 'SYS');
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			date = sdf1.parse(exp.getExp_date());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(SqlQuery.add_expense, new Object[] { exp.getExpense_name(), exp.getExpense_desc(),exp.getExpense_amount(),exp.getExpense_category(),sqlStartDate,exp.getNotes(),1,"ankit.biswas9@gmail.com" });

		
		
		
	}

	@Override
	public void delExpense(int exp_id) {
		// Code to delete an expense in the DB
		
	}

	
	/*
	 * 
	 * This method is used for admin purposes. This method is used to view all the expenses irrespective of the user. Used to access all the expenses of all the users.
	 * @see com.ems.dao.ExpenseDao#viewallExpense()
	 */
	@Override
	public List<Expense> viewallExpense() {
		// Code to view all Expense
		List<Expense> he=new ArrayList<Expense>();
		
		
	   jdbcTemplate = new JdbcTemplate(dataSource);
       List<Map<String, Object>> rows=jdbcTemplate.queryForList(SqlQuery.fetch_all_expenses);
	   
       for (Map<String, Object> row : rows) {
   		Expense ex = new Expense();
   		ex.setExpense_id((Integer)row.get("expense_id"));
   		ex.setExpense_name((String)row.get("expense_name"));
   		ex.setExpense_desc((String)row.get("expense_desc"));
   		ex.setExpense_amount((float)row.get("expense_amount"));
   		ex.setExpense_category((String)row.get("expense_category"));
   		ex.setNotes((String)row.get("notes"));
   		ex.setUser_id((Integer)row.get("user_id"));  //change the type to int in the model later
   		ex.setCreated_by((String)row.get("created_by"));
   		ex.setCreated_on((java.sql.Date)row.get("created_on"));
   		ex.setChanged_by((String)row.get("changed_by"));
   		ex.setChanged_on((java.sql.Date)row.get("changed_on"));
   		he.add(ex);
   		System.out.println("Added ---- ");
   	}
       
       return he;
	}

	@Override
	public void editExpense(int exp_id) {
		// Code to edit an expense
		
	}

	@Override
	public void viewExpense(int exp_id) {
		// TODO Auto-generated method stub
		
	}

}
