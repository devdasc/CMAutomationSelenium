package org.devdas.selenium.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*-----------------------------Done---------------#53------------*/
public class AdminCanAddNewVendorToSystem_53_done {

	public static void main(String[] args) {
		// instatiate the driver
		String driverKey = "webdriver.chrome.driver";
		String driverPath = "C:\\Users\\devda\\Documents\\Udemy\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(driverKey, driverPath);
		WebDriver driver = new ChromeDriver();

		// login to cmautomation as Admin
		driver.get("http://localhost:8090/cmautomation/showLoginPage");
		// for mouse hover action
		Actions act = new Actions(driver);
		// fill in username & password for admin
		driver.findElement(By.id("username")).sendKeys("md");
		driver.findElement(By.name("password")).sendKeys("test123");
		// move to Login button
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"command\"]/div[4]/div/button"));
		act.moveToElement(ele).build().perform();
		waitDriver(2000);
		// click onto the button
		ele.click();
		// to wait the driver for a while
		waitDriver(3000);

		// to click ManageSystemParameter
		WebElement menuElement = driver.findElement(By.id("ddlManageSystemParameter"));
		act.moveToElement(menuElement).build().perform();
		waitDriver(2000);
		menuElement.click();

		// To Click Vendor link
		WebElement appElement = driver.findElement(By.id("lnkVendors"));
		act.moveToElement(appElement).build().perform();
		waitDriver(2000);
		appElement.click();
		waitDriver(2000);

		// To Click Add Vendor button
		driver.findElement(By.xpath("//input[@value='Add vendor']")).click();
		waitDriver(4000);
		// To fill Add Environment form
		driver.findElement(By.id("vendorName")).sendKeys("test Vendor");
		driver.findElement(By.id("description")).sendKeys("test Vendor description");
		// Click the Save button
		waitDriver(2000);
		driver.findElement(By.xpath("//input[@value='Save']")).click();

		// close the driver
		waitDriver(2000);
		driver.close();	
		//driver.quit();
	}

	private static void waitDriver(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}