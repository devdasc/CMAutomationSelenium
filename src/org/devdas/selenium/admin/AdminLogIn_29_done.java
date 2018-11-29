package org.devdas.selenium.admin;

import org.devdas.selenium.tutorial.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*--------------------Done-----------#29---------*/
public class AdminLogIn_29_done  extends Login{

	public static void main(String[] args) {
		//instantiate the browser
		launchDriver();
		//log in as Admin
		getLogin(ADMIN, PASSWORD);
		
		//get logged out
		getLogout();
		
		//close the browser
		closeBrowser();
		
	
		
		
	}

}
