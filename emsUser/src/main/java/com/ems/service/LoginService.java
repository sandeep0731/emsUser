package com.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dao.LoginDaoImpl;
import com.ems.model.User;

@Service
public class LoginService {

	@Autowired
	LoginDaoImpl lgin;
	
	
	public User verifyUser(String mail,String pass){
		
		User user=(User)lgin.getPassword(mail,pass);
		
		if(user==null){
			System.out.println("User Not Found And SQL Query returned Null");
		}
		
		
		return user;
	}
	
	
}
