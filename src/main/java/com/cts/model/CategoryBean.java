package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="categorytable")
public class CategoryBean {

	@Id
	@NotNull(message = "Category Id cannot be empty")
	private Integer categoryid;
	
	@NotBlank(message = "Category cannot be empty")
	private String category;

	public Integer getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
		
	}

	public CategoryBean() {
		
	}
	
	
	
}
