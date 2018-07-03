package com.ems.controller;

import java.text.ParseException;
import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//import org.springframework.http.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ems.model.Expense;
import com.ems.service.ExpenseService;

@RestController
public class ExpenseController {

	@Autowired
	ExpenseService eserv;
	
    /* Method for Internal View Ressolver for */
	@RequestMapping(value="/add-exp", method=RequestMethod.GET)
	public ModelAndView addExpense(){
		ModelAndView m=new ModelAndView("add-expense");
		return m;
	}	
	
	
	
	/*Method to add an expense in the db*/
	@RequestMapping(value="/addintoexp",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON)
	public ResponseEntity<String> addexpense(@RequestBody Expense expp){
		
		
		System.out.println("Inside AddintoExp  --date -- "+ expp.getExp_date());
		
		String date=expp.getExp_date().split("T")[0];
		expp.setExp_date(date);
		System.out.println("The Date is " + date);
		//pass to the service
		try {
			eserv.addExpense(expp);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ResponseEntity<String>("Hello",HttpStatus.OK);
	}
	
	
	
	/*This method is used to get all the expense data*/
	@RequestMapping(value="/getallexpense",method=RequestMethod.GET)
	@Produces({"application/json"})
	public ResponseEntity<List<Expense>> fetchallexpense(){	
		System.out.println("Inside the getallexpense controller");
		List<Expense> getexp=eserv.getallexpenses();
		System.out.println(getexp.size());
		return new ResponseEntity<List<Expense>>(getexp,HttpStatus.FOUND);
	}	
}
