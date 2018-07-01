package com.ems.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.ems.model.LoginRowMapper;
import com.ems.model.User;

@Repository
public class LoginDaoImpl implements LoginDao{

	
	
	private DataSource dataSource;
	 
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
	
	
	@Override
	public User getPassword(String mail,String pass) {
		// TODO Auto-generated method stub
		
		jdbcTemplate = new JdbcTemplate(dataSource);
		User user=null;
		
		try{
			
		
		user =(User)jdbcTemplate.queryForObject(SqlQuery.fetch_pass,new Object[] {mail} ,new LoginRowMapper());
		System.out.println("Password from Database is :" + user.getPassword());
		System.out.println("Password from User: "+pass);
		
			if(user.getPassword().equals(pass)){
				System.out.println("Password Matched!!!");
			}
			else {
				System.out.println("Password Not Matched!!");
				user=null;
			}
			
		}
		catch(Exception e){
			
		}
		
		return user;
	}
	
	
	
	
	
	
	
	

}
