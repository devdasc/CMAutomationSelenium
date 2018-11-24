package org.devdas.selenium.alluser;

import org.devdas.selenium.tutorial.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AnyUserCanAccessDefects_ListUIWithCredential_57_done  extends Login{
		
	public static void main(String[] args) {
		launchDriver();
		// login as CMA------------------>
		getLogin(CMA, PASSWORD);
		getManageDefects();
		getDefectList();
		// logout
		getLogout();
		
		// log in as TSA------------->
		getLogin(TSA, PASSWORD);
		getManageDefects();
		// log out
		getLogout();
		
		// log in as QA---------------->
		getLogin(QA, PASSWORD);
		// click on the manage defects link
		getManageDefects();
		getDefectList();
		// log out
		getLogout();
		closeBrowser();

	}
	
}
