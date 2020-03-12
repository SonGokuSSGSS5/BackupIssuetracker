package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.CategoryRepNotificationBean;

@Repository
public interface CategoryRepNotificationDao extends JpaRepository<CategoryRepNotificationBean, Integer> {

}
