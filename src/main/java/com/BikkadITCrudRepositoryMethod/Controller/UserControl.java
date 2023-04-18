package com.BikkadITCrudRepositoryMethod.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadITCrudRepositoryMethod.Service.UserServiceI;
import com.BikkadIUICrudRepositoryMethod.Model.User;
@RestController
public class UserControl {
@Autowired
	private UserServiceI userServiceI;

	@GetMapping("/loadForm")
	public String loadForm() {
		return "RegForm";
		
	}
		
	
	@GetMapping("/saveUser")
	public String saveUser( User user, Model model) {
		System.out.println(user);
		User saveUser = userServiceI.saveUser(user);
		
		model.addAttribute("MSG", saveUser);
		return "RegSuccess";

	}
		
	}