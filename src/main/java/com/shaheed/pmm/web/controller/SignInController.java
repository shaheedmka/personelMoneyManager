/**
 * @author shaheed
 * Controller for SignIn and SignUp forms*/
package com.shaheed.pmm.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shaheed.pmm.web.service.SignInService;


@Controller
public class SignInController {

	private static final Logger LOG = LoggerFactory.getLogger(SignInController.class);
	
	@Autowired
	SignInService signInService;
	
	@GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", "personelMoneyManager");
        return "signIn";
    }
		
	@RequestMapping(value="/validateSignIn", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String userName, @RequestParam String password){
		boolean isValidUser = signInService.validateUser(userName, password);
		if(isValidUser) {
			model.put("userName", userName);
			model.put("password", password);
			
			return "welcomePage";
			
		} else {
			model.put("errorMessage", "Invalid Credentials");
			return "error";
		}
				
	}

}
