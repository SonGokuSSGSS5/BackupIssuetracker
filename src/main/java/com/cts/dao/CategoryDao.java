package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.CategoryBean;

@Repository
public interface CategoryDao extends JpaRepository<CategoryBean, Integer>{

}
