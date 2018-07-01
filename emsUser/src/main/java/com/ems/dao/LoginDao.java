package com.ems.dao;

import com.ems.model.User;

public interface LoginDao {

	public User getPassword(String mail,String pass);
	
}
