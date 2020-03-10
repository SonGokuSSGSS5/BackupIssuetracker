package com.cts.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.dao.UserDao;
import com.cts.model.LoginBean;
import com.cts.model.UserBean;

@Controller
public class UserController {

	@Autowired
	private UserDao rd;
	
	@RequestMapping(value="/",method=RequestMethod.GET) //load the basic user sign in page
	public String index(@ModelAttribute("login")LoginBean loginBean) {
		return "Home";
	}

	@PostMapping("/login")
	public ModelAndView signIn(@Valid @ModelAttribute("login")LoginBean loginBean,BindingResult br,HttpSession session) {
		
		ModelAndView mv=new ModelAndView("Home", "flag", 1);

		if(br.hasErrors()) {
			mv=new ModelAndView("Home");
		}
		else {
			
			UserBean user=rd.validateUser(loginBean.getUserid(), loginBean.getPassword());

			if(user != null)
			{
			mv=new ModelAndView("User_Home");
			session.setAttribute("user", user);
			}
		}
			
		return mv;
	}
	
	
	@RequestMapping(value="/hi",method=RequestMethod.GET) //After registration ,load the basic user sign in page
	public String index1() {
		return "index";
	}
	
	@RequestMapping(value="/RegisterUser",method=RequestMethod.GET) // display user registration page
	public String register( @ModelAttribute("userregister")UserBean rb) {
		return "Register_User";
	}
	
	@RequestMapping(value="/success",method=RequestMethod.POST) // go to success page
	public String registerUserSubmit(@Valid @ModelAttribute("userregister") UserBean rb, BindingResult br) {
		
		String page="Register_User";
		
		if(br.hasErrors()) {
			page="Register_User";
		}
		else {
			Optional<UserBean> op= rd.findById(rb.getUserid());
			if(!op.isPresent()) {
				
				System.out.println("No Record Present");
				rd.save(rb);
				page="success";
			}
			else {
				System.out.println("WTF");
				UserBean ub=op.get();
				br.addError(new FieldError("userid", "userid", ub.getUserid()+" userid aldready exists"));
				page="Register_User";
			}
		}
		
		return page;
	}
	@RequestMapping(value="/forgot",method=RequestMethod.GET) //load the basic user sign in page
	public String forgotPassword() {
		
		return "index";
	}
	
	
}
