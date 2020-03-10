package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.model.UserBean;

@Repository
public interface UserDao extends JpaRepository<UserBean, String>{
	
	@Query("select s from UserBean s where s.userid=:userid AND s.password=:password")
	public UserBean validateUser(String userid,String password);
	
	
}
