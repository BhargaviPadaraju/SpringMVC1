package com.dao;

public class UserDaoImp implements UserdaoInt {
private JdbcTemplate jdbcTemplate;
	
	
	public UserDaoImp(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate();
	}
	
	
	public  void  UserRegistration() {
		
	}
	public void UserLogin() {
		
	}


	

}
