package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.model.CategoryRepBean;

@Repository
public interface CategoryRepDao extends JpaRepository<CategoryRepBean, String>{
	
	@Query("select s from CategoryRepBean s where s.categoryrepid=:userid AND s.password=:password")
	public CategoryRepBean validateRep(String userid,String password);
}
