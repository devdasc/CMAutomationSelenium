package org.devdas.selenium.admin;

import org.devdas.selenium.tutorial.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*-----------------------Done--------------#56----------*/
public class AdminCanNotDelAnVendorWhichIsAttachedToDefect_56_done extends Login{

	public static void main(String[] args) {
		// instatiate the driver
		launchDriver();

		// login to cmautomation as Admin
		getLogin(ADMIN, PASSWORD);

		// to click ManageSystemParameter
		clickManageSystemParameter();

		// To Click Vendor link
		clickVendorLink();

		// To Click delete Vendor button--1st vendor
		driver.findElement(By.xpath("(//a[contains(text(),'Delete')])[1]")).click();
		waitDriver(3000);
		// click on the browser alert to confirm delete action
		clickBrowserAlertToConform();
		
		//close the browser
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
