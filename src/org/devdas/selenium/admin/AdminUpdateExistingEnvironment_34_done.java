package org.devdas.selenium.admin;

import org.devdas.selenium.tutorial.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/* This scripts updates an existing environment to the system 
 in response to requirement of issue #34 */
/*--------------------Done----------#34----------*/
public class AdminUpdateExistingEnvironment_34_done extends Login{

	public static void main(String[] args) {
		// instantiate the browser
		launchDriver();

		// log in as Admin
		getLogin(ADMIN, PASSWORD);

		// to click ManageSystemParameter
		clickManageSystemParameter();

		// To Click Environment link
		clickEnvironmentLink();
		
		// To Click update link button
		clickUpdateButtonLink();
		// To fill update Environment form
		fillUpdateEnvironmentForm();
		//click save button
		clickSaveButton();
		//log out
		getLogout();
		//close the browser
		closeBrowser();

	}

	
}
