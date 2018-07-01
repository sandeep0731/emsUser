package com.ems.model;

/*
`category_id` INT NOT NULL AUTO_INCREMENT,
`category_name` VARCHAR(50) NOT NULL,
`category_desc` VARCHAR(200) NULL,
`category_typeid` INT NULL,
`created_by` VARCHAR(45) NULL,
`created_on` DATETIME NULL,
`changed_by` VARCHAR(45) NULL,
`changed_on` DATETIME NULL,
*/

/**
 * 
 * @author Ankit
 *
 */

public class Category {

	int category_id;
	String category_name;
	String category_desc;
	String category_typeid;
	String created_by;
	String created_on;
	String changed_by;
	String changed_on;
	
	
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getCategory_desc() {
		return category_desc;
	}
	public void setCategory_desc(String category_desc) {
		this.category_desc = category_desc;
	}
	public String getCategory_typeid() {
		return category_typeid;
	}
	public void setCategory_typeid(String category_typeid) {
		this.category_typeid = category_typeid;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getCreated_on() {
		return created_on;
	}
	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}
	public String getChanged_by() {
		return changed_by;
	}
	public void setChanged_by(String changed_by) {
		this.changed_by = changed_by;
	}
	public String getChanged_on() {
		return changed_on;
	}
	public void setChanged_on(String changed_on) {
		this.changed_on = changed_on;
	}
	
	
	
	
	
}
