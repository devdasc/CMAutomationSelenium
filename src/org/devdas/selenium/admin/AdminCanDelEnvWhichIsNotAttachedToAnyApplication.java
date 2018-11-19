package org.devdas.selenium.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/*--------Done--------------*/
/* This scripts updates an existing environment to the system 
 in response to requirement of issue #34 */
public class AdminCanDelEnvWhichIsNotAttachedToAnyApplication {

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
		// To Click Environment link
		driver.findElement(By.id("lnkEnvironments")).click();
		waitDriver(3000);
		// To Click delete link button
		driver.findElement(By.xpath("(//a[contains(text(),'Delete')])[last()]")).click();
		waitDriver(2000);
		driver.switchTo().alert().accept();
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
