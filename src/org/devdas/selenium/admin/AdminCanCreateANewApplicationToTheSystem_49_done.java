package org.devdas.selenium.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/*-----Done------#49--------------*/
public class AdminCanCreateANewApplicationToTheSystem_49_done {

	public static void main(String[] args) {
		String driverKey = "webdriver.chrome.driver";
		String driverPath = "C:\\Users\\devda\\Documents\\Udemy\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(driverKey, driverPath);
		WebDriver driver = new ChromeDriver();

		// login to cmautomation as CMA
		driver.get("http://localhost:8090/cmautomation/showLoginPage");
		driver.findElement(By.id("username")).sendKeys("md");
		driver.findElement(By.name("password")).sendKeys("test123");
		driver.findElement(By.xpath("//*[@id=\"command\"]/div[4]/div/button")).click();
		// to wait the driver for a while
		waitDriver(4000);
		// to click ManageSystemParameter
		driver.findElement(By.id("ddlManageSystemParameter")).click();
		waitDriver(4000);
		// To Click Admin link
		driver.findElement(By.id("lnkApplications")).click();
		waitDriver(4000);
		// To Click add Application button
		driver.findElement(By.xpath("//input[@value='Add Application']")).click();
		waitDriver(2000);
		// To fill Add Applications form
		driver.findElement(By.id("applicationName")).sendKeys("TestApp");;
		driver.findElement(By.id("description")).sendKeys("TestApp Description");
		// Click the Save button
		waitDriver(2000);
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		waitDriver(2000);
		driver.close();
	}

	private static void waitDriver(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
