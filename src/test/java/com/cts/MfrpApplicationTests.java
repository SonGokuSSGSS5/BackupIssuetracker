package com.cts;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.dao.CategoryDao;
import com.cts.model.CategoryBean;
import com.cts.service.CategoryService;

@SpringBootTest
class MfrpApplicationTests {


	
	@Test
	public void testUpdateCategory() {
		
		CategoryDao dao=Mockito.mock(CategoryDao.class);
		CategoryBean cb=new CategoryBean();
		cb.setCategoryid(10);
		cb.setCategory("English");
		
		Mockito.when(dao.save(cb)).thenReturn(cb);
		
		CategoryService service=new CategoryService();
		
		service.setCdao(dao);
		
		
		String msg= service.updateCategory(cb);
		
		assertSame("Updated Successfully", msg);
		
		
		
		
		
		
	}

}
