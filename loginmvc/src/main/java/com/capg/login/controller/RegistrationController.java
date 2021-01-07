package com.capg.login.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.capg.login.model.Login;
import com.capg.login.model.Register;
import com.capg.login.service.RegistrationService;

@Controller
public class RegistrationController {
	
	@Autowired
	RegistrationService service;
	
	@PostMapping("/add")
	public String newRegistry(@Valid @ModelAttribute Register r, Model m) {
		service.newRegistry(r);
		m.addAttribute("register", r);
		return "success";
	}
	
	@PostMapping("/find")
	public String submit(@ModelAttribute("login") Login login, @ModelAttribute Register register,
			Model m) {
		if(login.getUserId()==register.getUserId() && login.getPassword().equals(register.getPassword())) {
			return "login-success";
		}
		System.out.println("login failed");
		return "login-failed";
	}
}













//@PostMapping("/add")
//public String newRegistry(@RequestParam("txtName") String name, @RequestParam("txtId") int userId,
//		@RequestParam("txtMobile") long mobileNo, @RequestParam("txtEmail") String email,
//		@RequestParam("txtPassword") String password, Model m) {
//	
//	Register r=new Register(name, userId, mobileNo, email, password);
//	m.addAttribute("register", r);
//	return "success";
//}