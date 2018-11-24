package org.devdas.selenium.admin;

import org.devdas.selenium.tutorial.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*--------------------Done------------#32--------*/
public class OtherUserLogIn_32_done extends Login {

	public static void main(String[] args) {
		//instantiate the driver
		launchDriver();
		// login to cmautomation as CMA
		getLogin(CMA, PASSWORD);
		// to logout
		getLogout();

		// login to cmautomation as TSA
		getLogin(TSA, PASSWORD);
		// to logout
		getLogout();

		// login to cmautomation as QA
		getLogin(QA, PASSWORD);
		// to logout
		getLogout();
		
		//close the browser
		closeBrowser();
	}
	
}
