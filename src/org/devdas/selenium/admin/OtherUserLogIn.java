package org.devdas.selenium.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherUserLogIn {

	public static void main(String[] args) {
		String driverKey = "webdriver.chrome.driver";
		String driverPath = "C:\\Users\\devda\\Documents\\Udemy\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(driverKey, driverPath);
		WebDriver driver = new ChromeDriver();

		// login to cmautomation as CMA
		driver.get("http://localhost:8090/cmautomation/showLoginPage");
		driver.findElement(By.id("username")).sendKeys("dy");
		driver.findElement(By.name("password")).sendKeys("test123");
		driver.findElement(By.xpath("//*[@id=\"command\"]/div[4]/div/button")).click();

		waitDriver();
		// to logout
		driver.findElement(By.xpath("/html/body/nav/div/ul[2]/li[3]/a")).click();

		// login to cmautomation as TSA
		driver.get("http://localhost:8090/cmautomation/showLoginPage");
		driver.findElement(By.id("username")).sendKeys("fs");
		driver.findElement(By.name("password")).sendKeys("test123");
		driver.findElement(By.xpath("//*[@id=\"command\"]/div[4]/div/button")).click();

		waitDriver();
		// to logout
		driver.findElement(By.xpath("/html/body/nav/div/ul[2]/li[3]/a")).click();

		// login to cmautomation as QA
		driver.get("http://localhost:8090/cmautomation/showLoginPage");
		driver.findElement(By.id("username")).sendKeys("dc");
		driver.findElement(By.name("password")).sendKeys("test123");
		driver.findElement(By.xpath("//*[@id=\"command\"]/div[4]/div/button")).click();

		waitDriver();
		// to logout
		driver.findElement(By.xpath("/html/body/nav/div/ul[2]/li[3]/a")).click();
	}

	private static void waitDriver() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
