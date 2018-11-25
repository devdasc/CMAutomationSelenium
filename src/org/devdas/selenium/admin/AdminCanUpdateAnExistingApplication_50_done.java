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

/*----------------Done--------#50---------*/
public class AdminCanUpdateAnExistingApplication_50_done extends Login {

	public static void main(String[] args) {

		// instantiate the Browser
		launchDriver();
		// login to cmautomation as Admin
		getLogin(ADMIN, PASSWORD);
		// to click ManageSystemParameter
		clickManageSystemParameter();
		// To Click Applications link
		clickApplicationLink();
		// To Click add Application button
		clickUpdateButtonLink();
		// To fill Add Applications form
		fillUpdateApplicationForm();
		// Click the Save button
		clickSaveButton();
		// logout
		getLogout();
		// close browser
		closeBrowser();
	}

}
