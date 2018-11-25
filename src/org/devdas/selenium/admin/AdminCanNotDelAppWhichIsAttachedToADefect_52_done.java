package org.devdas.selenium.admin;

import org.devdas.selenium.tutorial.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/*----------------Done-------#52----------*/
public class AdminCanNotDelAppWhichIsAttachedToADefect_52_done extends Login {

	public static void main(String[] args) {
		// instantiate the Browser
		launchDriver();
		// login to cmautomation as Admin
		getLogin(ADMIN, PASSWORD);
		// to click ManageSystemParameter
		clickManageSystemParameter();
		// To Click Applications link
		clickApplicationLink();
		// To Click delete Application button---1st of the list
		driver.findElement(By.xpath("(//a[contains(text(),'Delete')])[1]")).click();
		waitDriver(2000);
		//confirm delete
		clickBrowserAlertToConform();
		// logout
		getLogout();
		// close browser
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
