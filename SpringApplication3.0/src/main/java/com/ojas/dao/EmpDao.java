package com.ojas.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDao {
	JdbcTemplate jt;
	
	public void setDataSource() {
		jt = new JdbcTemplate();
	}
	public void displayUsers() {
		
	}
	public void updateUser() {
		try {
			jt.update("insert into Emp values('10','Bhargavi','90876543')");
		}
		catch(DataAccessException dae) {
			System.out.println("Exception"+dae.getMessage());
			
		}
	}

}
