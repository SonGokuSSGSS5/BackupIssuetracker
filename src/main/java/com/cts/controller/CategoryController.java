package com.cts.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.dao.CategoryDao;
import com.cts.model.CategoryBean;
import com.cts.model.UserBean;
import com.cts.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryDao catedao;
	
	@Autowired
	private CategoryService cs;

	@RequestMapping(value="/addCategory",method=RequestMethod.GET)
	public String addCategory(@ModelAttribute("category1")CategoryBean category) {
		
		return "AddCategory";
	}
	
	@PostMapping("/result")
	public String addtoDB(@Valid @ModelAttribute("category1") CategoryBean cat,BindingResult br) {
		
		if(br.hasErrors()) {
			return "AddCategory";
		}
		
		else {
			Optional<CategoryBean> op= catedao.findById(cat.getCategoryid());
			if(!op.isPresent()) {
				
				catedao.save(cat);
				return "result";
			}
			else {
				
				CategoryBean cb=op.get();
				br.addError(new FieldError("categoryid", "categoryid", cb.getCategoryid()+" Categoryid aldready exists"));
				return "AddCategory";
			}
		}
		
		
	}
	
	@RequestMapping(value="/ViewCategory",method=RequestMethod.GET)
	public String ViewCategory(Model m) {
		
		List<CategoryBean> opt= catedao.findAll();
		m.addAttribute("course", opt);
			
		return "ViewCategory";
	}
	
	@RequestMapping(value="/updateCategoryPage",method=RequestMethod.GET)
	public String updateCoursePage(@RequestParam("cid")Integer cid,Model m) {
		
		Optional<CategoryBean> opt= catedao.findById(cid);
		CategoryBean category=opt.get();
		
		m.addAttribute("category1", category);
		
		return "updateCategoryPage";
	}
	
	@PostMapping("/updateCategory")
	public String updateCourse(@Valid @ModelAttribute("category1")CategoryBean cat,BindingResult br, Model m) {
		
		if(br.hasErrors()) {
			return "updateCategoryPage";
		}
		
		String msg=cs.updateCategory(cat);
		
		m.addAttribute("message", msg);
		
		return "updateSuccess";
		
		}
		
	
}
