package com.cts.controller;


import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.dao.AdminDao;
import com.cts.model.AdminBean;
import com.cts.model.LoginBean;



@Controller
public class AdminController {
	
	@Autowired
	private AdminDao ad;
	
	@RequestMapping(value="/AdminLogin",method=RequestMethod.GET) // sign in page for admin
	public String signInAdmin(@ModelAttribute("login")LoginBean loginBean) {
		return "Login_Admin";
	}
	
	@PostMapping("/loginadmin")
	public ModelAndView signInAdmin(@Valid @ModelAttribute("login")LoginBean loginBean,BindingResult br,HttpSession session) {
		
		ModelAndView mv=new ModelAndView("Login_Admin", "flag", 1);

		if(br.hasErrors()) {
			mv=new ModelAndView("Home");
		}
		else {
			
			AdminBean user=ad.validateAdmin(loginBean.getUserid(), loginBean.getPassword());

			if(user != null)
			{
			mv=new ModelAndView("AdminHome");
			session.setAttribute("admin", user);
			}
		}
			
		return mv;
	}
	
	@GetMapping("/mapToLoginAdmin")
	public String goToAdminHomePage() {
		return "AdminHome";
	}
	@GetMapping("/LogoutAdmin")
	public String logoutAdmin(@ModelAttribute("login")LoginBean loginBean,HttpSession session) {
		session.removeAttribute("admin");
		return "AdminSignin";
	}
	
	
}
