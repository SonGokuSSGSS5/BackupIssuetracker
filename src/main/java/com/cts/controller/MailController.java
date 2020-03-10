package com.cts.controller;




import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.dao.raiseissuedao;
import com.cts.model.MailFormBean;
import com.cts.model.RaiseIssueBean;
import com.cts.model.UserBean;
import com.cts.services.SafeMailSender;






@Controller
public class MailController {
	
	@Autowired
	raiseissuedao mailIssueServ;
	/*@Autowired
	IssueDAO issueDAO;
	
	@RequestMapping(value="/raiseIssue",method=RequestMethod.GET)
	public String issueCreation(@ModelAttribute("issueForm")IssueFormBean ifb,BindingResult br) {
		return "issueCreation";
	}
	
	
	@RequestMapping(value="/addIssue",method=RequestMethod.POST)
	public String addIssue(@ModelAttribute("issueForm")IssueFormBean ifb,BindingResult br) {
		
		if(br.hasErrors()) {
			return "issueCreation";
		}
		
		return "success";
	}
	
	
	@RequestMapping(value="/viewIssues",method=RequestMethod.GET)
	public String viewIssue(Model m)
	{	List<IssueBean> ibl=new ArrayList<IssueBean>();
		
		ibl.addAll(issueDAO.findAll());
	
		m.addAttribute("ibl", ibl);
		return "viewIssues";
	}
	
	*/
	
	
	@Autowired
	SafeMailSender mailsender;
	
	@RequestMapping(value="/help",method=RequestMethod.GET)
	public String help(Model m) {
		return "help";
	}
	
	
	
	@RequestMapping(value="/mailAdmin",method=RequestMethod.GET)
	public String issueMail(@ModelAttribute("mailForm")MailFormBean mf,BindingResult br) {
		return "mailPage";
	}
	
	
	@RequestMapping(value="/sendMail",method=RequestMethod.POST)
	public String sendMail(@Valid @ModelAttribute("mailForm")MailFormBean mf,BindingResult br,Model m,HttpSession session) {
		if(br.hasErrors()) {
			return "mailPage";
		}
		
		mailsender.sendMail(mf);
		RaiseIssueBean issue=new RaiseIssueBean("other", mf.getSubject(), mf.getContent(),((UserBean)session.getAttribute("user")).getUserid());
		mailIssueServ.save(issue);
		return "successMail";
	}
	
	
	
	@RequestMapping(value="/userhome",method=RequestMethod.GET)
	public String userhome() {
		return "UserHome";
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "logoutsuccessful";
	}
}
