package org.devdas.selenium.admin;

import org.devdas.selenium.tutorial.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*----------------------Done----------------#55------------*/
public class AdminCanDelAnVendorNotAttachedToAnDefect_55_done extends Login{

	public static void main(String[] args) {
		// instatiate the driver
		launchDriver();

		// login to cmautomation as Admin
		getLogin(ADMIN, PASSWORD);

		// to click ManageSystemParameter
		clickManageSystemParameter();

		// To Click Vendor link
		clickVendorLink();

		// To Click Delete Vendor link
		clickDeleteButtonLink();
		
		// to click browser alert button
		clickBrowserAlertToConform();
		
		// close the driver
		closeBrowser();
		
	}

	private static void waitDriver(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
