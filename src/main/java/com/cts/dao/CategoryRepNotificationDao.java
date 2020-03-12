package com.cts.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.model.CategoryRepNotificationBean;

@Repository
public interface CategoryRepNotificationDao extends JpaRepository<CategoryRepNotificationBean, Integer> {
	
	@Query("select crnb from CategoryRepNotificationBean crnb where crnb.click=false and crnb.CategoryRep=:categoryrepid")
	public 	List<CategoryRepNotificationBean> findMessageByCategoryRepId(String categoryrepid);

}
