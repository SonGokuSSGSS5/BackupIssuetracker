package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.model.AdminBean;


@Repository
public interface AdminDao extends JpaRepository<AdminBean, String>{
	
	@Query("select s from AdminBean s where s.adminid=:userid AND s.password=:password")
	public AdminBean validateAdmin(String userid,String password);
	
}
