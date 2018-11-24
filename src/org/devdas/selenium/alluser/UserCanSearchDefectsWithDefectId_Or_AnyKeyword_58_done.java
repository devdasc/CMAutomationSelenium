package org.devdas.selenium.alluser;

import org.devdas.selenium.tutorial.Login;

public class UserCanSearchDefectsWithDefectId_Or_AnyKeyword_58_done  extends Login{

	public static void main(String[] args) {
		//launch the driver
		launchDriver();
		//get logged in
		getLogin(CMA, PASSWORD);
		// move to manage Defects link and click
		getManageDefects();
		// move to defect List link and click
		getDefectList();
		// search by defect id
		search("5");
		searchWithEmptyString();
		//search by keyword 
		search("user");
		searchWithEmptyString();
		// search by Application name
		search("APP1");
		searchWithEmptyString();
		//search by Vendor name
		search("REDHAT");
		searchWithEmptyString();
		// log out		
		getLogout();
		//close the browser
		closeBrowser();

		
	}

}
