package org.devdas.selenium.admin;

import org.devdas.selenium.tutorial.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*-----------------------------Done---------------#53------------*/
public class AdminCanAddNewVendorToSystem_53_done extends Login{

	public static void main(String[] args) {
		
		launchDriver();
		getLogin(ADMIN, PASSWORD);
		
		// to click ManageSystemParameter
		clickManageSystemParameter();

		// To Click Vendor link
		clickVendorLink();
		
		//click add vendor button
		clickAddVendorButton();
		
		// To fill Add Vendor form
		fillAddVendorForm();
		
		//to save button
		clickSaveButton();

		// close the driver
		closeBrowser();
		
	}

	
}
