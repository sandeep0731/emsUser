package com.ems.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ems.model.Expense;
import com.ems.model.User;
import com.ems.service.ExpenseService;
import com.ems.service.LoginService;

// Login Controller

@Controller
public class LoginController {

	@Autowired
	ExpenseService expser;
	
	Expense e=new Expense();
	
	@Autowired
	LoginService lgin;
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String login(Model model){
		System.out.println("Hellooooooooooo");
		
		
		/**
		 * Here Perform a Testing for inserting some default entries in the Database
		 */
		
	    System.out.println("Fuck The Ladies!!!!");
		
	    /// initialise the object of Expense here with default values
	    
	    /*e.setExpense_id(1);
	    e.setExpense_name("SDFDDSFSD");
	    e.setExpense_desc("sdsd");
	    e.setExpense_amount(1232);
	    e.setExpense_category("GROC");
	    e.setNotes("hekkihjk");
	    e.setUser_id("1");
	    e.setCreated_by("ANK");
	    
	    
	    
	    expser.addExpense(e);
		*/
		return "login";
	}
	
	@RequestMapping(value="/fakelogin", method=RequestMethod.GET)
	public String trylogin(Model model){
		
			System.out.println("Inside Fake Login");
		
		return "dashboard";
		
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginintoDashboard(@RequestParam("email") String email,@RequestParam("pass") String pass,Model m){
		
			User user = (User)lgin.verifyUser(email,pass);
		    String final_result=null;
			//System.out.println("User"+user.getPassword());
			System.out.println("Inside Actual Login Login");
		    System.out.println("The email id is : " + email);
		    System.out.println("The password is : "+ pass);
			
		    if(user==null){
		    	final_result="redirect:/index.html";
		    }
		    else{
		        
		    	final_result="dashboard";
		    }
		    
		    
		    
		return final_result;
		
	}
	
	
	
	@RequestMapping(value="/admin", method=RequestMethod.POST)
	public String dashboard(@ModelAttribute("usera") User usera){
		
			
		
		return "redirect:/dashboard";
		
	}
}
