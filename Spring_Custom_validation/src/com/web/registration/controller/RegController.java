package com.web.registration.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.registration.bean.UserInfo;
import com.web.registration.formvalidator.FormValidator;



@Controller
@RequestMapping("/reg")
public class RegController {
	
	
	@Autowired
	FormValidator validform;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String view(Map model){
		UserInfo userInfo= new UserInfo();
		model.put("userInfo", userInfo);
		
		List desg= new ArrayList();
		desg.add("Architect");
		desg.add("Developer");
		desg.add("Tester");
		model.put("designations", desg);
		
		return "Registration";
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String process(@Valid @ModelAttribute("userInfo") UserInfo info, BindingResult result, Map model){
		
		validform.validate(info, result);
		
		if(result.hasErrors()){
			List desg= new ArrayList();
			desg.add("Architect");
			desg.add("Developer");
			desg.add("Tester");
			model.put("designations", desg);
			return "Registration";
		}
		
		System.out.println("Name:" +info.getName());
		System.out.println("email:" +info.getEmail());
		System.out.println("DOB:" +info.getDob());
		System.out.println("Designation:" +info.getDesgination());
		
		return "success";
		
	}

}
