package org.devdas.selenium.admin;

import org.devdas.selenium.tutorial.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/* This scripts creates a new environment to the system 
 in response to requirement of issue #33 */
/*-----------Done------------#33--*/
public class AdminCreatesNewEnvironment_33_done extends Login {

	public static void main(String[] args) {

		// instantiate the browser
		launchDriver();
		
		// log in as Admin
		getLogin(ADMIN, PASSWORD);
		
		// to click ManageSystemParameter
		clickManageSystemParameter();
		
		// To Click Environment link
		clickEnvironmentLink();
		
		// To Click Add Environment button
		clickAddEnvironmentButton();
		
		// To fill Add Application form
		fillAddEnvironmentForm();
		
		// Click the Save button
		clickSaveButton();
		
		//close the browser
		closeBrowser();

		
	}

	private static void waitDriver(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
