package com.cts.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.model.RaiseIssueBean;

@Repository
public interface raiseissuedao extends JpaRepository<RaiseIssueBean	, Integer>{

	
	@Query("select rs from RaiseIssueBean rs where rs.askedby=:uid")
	public List<RaiseIssueBean> viewIssue(String uid);
	
	
	
	@Query("select rs from RaiseIssueBean rs where rs.category=:cat")
	public List<RaiseIssueBean> findByCategory(String cat);

	@Query("select rs from RaiseIssueBean rs where rs.category=:cat and (rs.status=:status or rs.status='Active(viewed by Mod)') ")
	public List<RaiseIssueBean> findByCategoryANDStatus(String cat,String status);
	
	
	
}
