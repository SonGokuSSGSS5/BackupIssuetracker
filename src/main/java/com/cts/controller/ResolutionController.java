package com.cts.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.cts.dao.CategoryDao;
import com.cts.dao.raiseissuedao;
import com.cts.model.CategoryBean;
import com.cts.model.RaiseIssueBean;

@Controller
public class ResolutionController {

	@Autowired
	private CategoryDao cdao;
	
	@Autowired
	private raiseissuedao rdao;
	
	@GetMapping("/updateWorklogIssues")
	public String worklogUpdate(String rib,String uid,Model m) {
		
		List<RaiseIssueBean> ribi = rdao.findByCategory(rib);
		
		m.addAttribute("IssueList", ribi);
		
		return "updateWorklog";
	}
}
