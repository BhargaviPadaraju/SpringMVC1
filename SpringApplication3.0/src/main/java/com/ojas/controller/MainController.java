package com.ojas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ojas.beans.User;
import com.ojas.dao.EmpDao;
@Controller
public class MainController {
	 @RequestMapping("/Login")
	    String displayPage() {
	        System.out.println("inside login controller");
	        return "Login";
	        
	    }
	    @RequestMapping("/register")
	    String displayRegistration() {
	        
	        return "Registration";
	        
	    }
	    @RequestMapping(method=RequestMethod.POST)
	    String displayUserDetails(Model m,@ModelAttribute("user") User userb,@RequestParam("userId") int uid, @RequestParam("password") String password) {
	        userb.setUserId(uid);
	        userb.setPassword(password);
	        System.out.println("user"+userb.getUserId());
	        m.addAttribute("username",userb.getPassword());
	        
	        return "RegistrationDetails";
	    }
}