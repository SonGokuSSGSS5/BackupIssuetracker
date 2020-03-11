package com.cts.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.model.ResolutionBean;

public interface ResolutionDao extends JpaRepository<ResolutionBean	, Integer>{

	
		@Query("select rb from ResolutionBean rb where rb.issueId=:id")
		public List<ResolutionBean> findResolutionByIssueId(int id);
}
