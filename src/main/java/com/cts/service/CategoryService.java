package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.CategoryDao;
import com.cts.model.CategoryBean;

@Service
public class CategoryService {

	
	@Autowired
	private CategoryDao cdao;
	

	public CategoryDao getCdao() {
		return cdao;
	}

	public void setCdao(CategoryDao cdao) {
		this.cdao = cdao;
	}


	public String updateCategory(CategoryBean cb) {
		
		String page="not Updated..";
		CategoryBean cat=cdao.save(cb);
		
		if(cat !=null) {
			page= "Updated Successfully";
		}
		
		return page;
	}
	
}
