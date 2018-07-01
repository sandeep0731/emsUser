package com.ems.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class LoginRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		User user =new User();
		user.setPassword(rs.getString("password"));
		user.setUser_id(rs.getInt("user_id"));
		user.setF_name(rs.getString("f_name"));
		user.setL_name(rs.getString("l_name"));
		
		return user;
	}

}
