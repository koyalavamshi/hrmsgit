package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Gobal {
	
	WebDriver driver;
	// To provide TestData and Object/Elements for whole application
	
	//*************************Test Data
	 //     DT     V     VV
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un = "nareshit";
	public String pw = "nareshit";
	public String ln = "vamshi";
	public String fn = "koyala";
	
	//**************************Object/Element
	public String txt_loginname = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout = "Logout";
	//Add Employee
	public String frame = "rightMenu";
	public String link_Addemploye="//input[@value='Add']";
	public String Last_name="txtEmpLastName";
	public String First_name="txtEmpFirstName";
	public String save = "btnEdit";
	//Delete Employee
	public String Checkbox = "chkLocID[]";
	public String Delete = "/html/body/div/div[2]/form/div[3]/div[1]/input[2]";
	//Mouse over on PIM 
	public String ClickPIM = "PIM";
	public String ClickAddemployee ="Add Employee";
	//drop down fun:
	public String dropdown_Select ="loc_code"; 
	

}
