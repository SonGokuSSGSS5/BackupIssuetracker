package com.cts.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.dao.CategoryDao;
import com.cts.dao.ResolutionDao;
import com.cts.dao.UserNotificationDao;
import com.cts.dao.raiseissuedao;
import com.cts.model.CategoryBean;
import com.cts.model.CategoryRepBean;
import com.cts.model.RaiseIssueBean;
import com.cts.model.ResolutionBean;
import com.cts.model.UserNotificationBean;

@Controller
public class ResolutionController {

	@Autowired
	private CategoryDao cdao;
	
	@Autowired
	private raiseissuedao rdao;
	
	@Autowired
	private ResolutionDao resdao;
	
	@Autowired
	private UserNotificationDao undao;
	
	@GetMapping("/updateWorklogIssues")
	public String worklogUpdate(String rib,String uid,Model m) {
		
		List<RaiseIssueBean> ribi = rdao.findByCategory(rib);
		
		m.addAttribute("IssueList", ribi);
		
		return "updateWorklog";
	}
	
	
	@PostMapping("/addResolution")
	public String storeResolution(@ModelAttribute("resolutionBean")ResolutionBean resolutionBean,int id,HttpSession session,Model m ) {
		String cid=(((CategoryRepBean)session.getAttribute("rep")).getCategoryrepid());
		System.out.println(cid);
		 resolutionBean.setIssueId(id);
		
		 
		resolutionBean.setNotificationFlag(true); 
		System.out.println(resolutionBean);
		
		
		resdao.save(resolutionBean);
		
		RaiseIssueBean opt = rdao.findIssueById(id);
		
		System.out.println(opt);
		
		CategoryRepBean crb = (CategoryRepBean)session.getAttribute("rep");
		
		System.out.println("CategoryBou==================" + crb);
		
		m.addAttribute("rep", crb);
		
		m.addAttribute("issue",	opt);
		
		m.addAttribute("postCheck", "You have Posted Successfully");

		List<ResolutionBean> lrb  = resdao.findResolutionByIssueId(id);
		
		if(lrb.isEmpty()) {
			System.out.println("Empty List man ********************************");
			m.addAttribute("resolutionList", null);
		}
		else
			m.addAttribute("resolutionList", lrb);
		
		
		  Optional<RaiseIssueBean> orib = rdao.findById(id);
		  
		  RaiseIssueBean rib = orib.get();
		
		  String cause =((CategoryRepBean)session.getAttribute("rep")).getCategoryrepid();
	       
	       UserNotificationBean unb = new UserNotificationBean();
	       
	       unb.setNotificationCause(cause);
	       
	       unb.setUser(rib.getAskedby());
	       
	       String Message = "The " + cause + " has posted the resolution to Issue id: " + resolutionBean.getIssueId();
	       
	       unb.setMessage(Message);
	       
	       undao.save(unb);
		
		
		return "showIssuePage";
	}
}
