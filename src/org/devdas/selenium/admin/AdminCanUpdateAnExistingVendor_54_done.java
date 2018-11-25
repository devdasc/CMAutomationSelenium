package org.devdas.selenium.admin;

import org.devdas.selenium.tutorial.Login;
/*-----------Done---------#54-----------*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdminCanUpdateAnExistingVendor_54_done extends Login {

	public static void main(String[] args) {

		launchDriver();
		// login to cmautomation as Admin
		getLogin(ADMIN, PASSWORD);

		// to click ManageSystemParameter
		clickManageSystemParameter();

		// To Click Vendor link
		clickVendorLink();
		
		// click update link
		clickUpdateButtonLink();
		
		// To update Add Environment form
		fillUpdateVendorForm();
		
		// to click save button
		clickSaveButton();
		//logout
		getLogout();

		// close the driver
		closeBrowser();

	}

}
