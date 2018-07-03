package com.ems.controller;



import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ems.model.Category;



@RestController
public class CategoryController {

	/* Method for Internal View Resolver for add-category*/
	
	@RequestMapping(value="/add-category", method=RequestMethod.GET)
	public ModelAndView viewCategorypage(){
		ModelAndView m=new ModelAndView("add-category");
		return m;
	}
	
	
	/*Method for adding category ----- */
	@RequestMapping(value="/addincategory",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON)
	public ResponseEntity<String> addCategory(@RequestBody Category cat){
		
		
		return new ResponseEntity<String>("Hello",HttpStatus.OK);
	}
	
	
}
