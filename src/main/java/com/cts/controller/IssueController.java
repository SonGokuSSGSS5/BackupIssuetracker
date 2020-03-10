package com.cts.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.dao.CategoryDao;
import com.cts.dao.raiseissuedao;
import com.cts.model.CategoryBean;
import com.cts.model.RaiseIssueBean;
import com.cts.model.UserBean;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class IssueController {

	@Autowired
	private raiseissuedao rdao;
	
	@Autowired
	private CategoryDao cdao;
	
	@GetMapping("/RaiseIssue")
	public String RaiseIssue(@ModelAttribute("RaiseIssueBean")RaiseIssueBean raiseissue,String uid,Model m) {
		
		List<CategoryBean> cbean = cdao.findAll();
		
		List<String> clist = new ArrayList<String>();
		
		
		for(CategoryBean cb:cbean) {
			clist.add(cb.getCategory());
		}
		
		m.addAttribute("categoryList", clist);
		m.addAttribute("user", uid);
		
		return "RaiseIssue";
	}
	
	@PostMapping("/RaiseIssueSuccess")
	public String addtoDB(@Valid @ModelAttribute("RaiseIssueBean")RaiseIssueBean raiseissue,BindingResult br,Model m,HttpSession session) {
		
		if(session.getAttribute("user")!=null) {
		raiseissue.setAskedby(((UserBean)session.getAttribute("user")).getUserid());
		}
		if(br.hasErrors()) {
			
			List<CategoryBean> cbean = cdao.findAll();
			
			List<String> clist = new ArrayList<String>();
		
			for(CategoryBean cb:cbean) {
				clist.add(cb.getCategory());
			}
			
			m.addAttribute("categoryList", clist);
			
			return "RaiseIssue";
		}
		
		
		rdao.save(raiseissue);
		
		
		return "RaiseIssueSuccess";
	}
	
	@GetMapping("/ViewIssueHistory")
	public String ViewUpdateIssue(String uid,Model m,HttpSession session) {
		uid=((UserBean)session.getAttribute("user")).getUserid();	
		List<RaiseIssueBean> rib = rdao.viewIssue(uid);
		
		for(RaiseIssueBean rb: rib)
		System.out.println(rb);
		
		m.addAttribute("rib", rib);
		m.addAttribute("user", uid);
		
		return "ViewIssueHistory";
	}
	
	
	@GetMapping("/showIssuePage")
	public String showIssuePage(String cid,Model m) {
		
		m.addAttribute("name",	cid);
		
		return "showIssuePage";
	}
	
	@GetMapping("issueUpdatePage")
	public String issueUpdatePage(int id,Model m) {
		
		
		Optional<RaiseIssueBean> opt = rdao.findById(id);
		
		RaiseIssueBean rib = opt.get();
		
		m.addAttribute("id", id);
		
		System.out.println("From function  : " + id);
		
		System.out.println("From raisebean : " + rib.getId());
		
		m.addAttribute("raiseissuebean", rib);		
		
		return "issueUpdatePage";
	}
	
	@PostMapping("updateIssueStatus")
	public String updateIssueStatus(@ModelAttribute("raiseissuebean")RaiseIssueBean raiseisssuebean) {
		
		System.out.println(raiseisssuebean);
		
		 DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	       Date dateobj = new Date();
	       System.out.println(df.format(dateobj));
	       Date d1 = new Date();
		try {
			d1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(df.format(dateobj));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
		raiseisssuebean.setTimestamp(d1);
		rdao.save(raiseisssuebean);
		
		return "IssueSuccess";
	}
	
}
