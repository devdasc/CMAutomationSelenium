package org.devdas.selenium.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/*----------------Done--------#50---------*/
public class AdminCanUpdateAnExistingApplication_50_done {

	public static void main(String[] args) {

		String driverKey = "webdriver.chrome.driver";
		String driverPath = "C:\\Users\\devda\\Documents\\Udemy\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(driverKey, driverPath);
		WebDriver driver = new ChromeDriver();

		// login to cmautomation as Admin
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
		// To Click update link button
		driver.findElement(By.xpath("(//a[contains(text(),'Update')])[last()]")).click();
		waitDriver(2000);
		// To fill Add Environment form
		driver.findElement(By.id("applicationName")).clear();
		driver.findElement(By.id("applicationName")).sendKeys("Updated TestApp");
		driver.findElement(By.id("description")).clear();
		driver.findElement(By.id("description")).sendKeys("Updated TestApp Description");
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
