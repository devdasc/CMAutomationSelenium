package org.devdas.selenium.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogInAdmin {

	public static void main(String[] args) {
		String driverKey="webdriver.chrome.driver";
		String driverPath="C:\\Users\\devda\\Documents\\Udemy\\Selenium\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty(driverKey, driverPath);
		
		WebDriver driver=new ChromeDriver();
		
		//login to cmautomation 		
		driver.get("http://localhost:8090/cmautomation/showLoginPage");
		driver.findElement(By.id("username")).sendKeys("ak");
		driver.findElement(By.name("password")).sendKeys("test123");
		driver.findElement(By.xpath("//*[@id=\"command\"]/div[4]/div/button")).click();
		//to find the login error text
		//System.out.println(driver.findElement(By.xpath("//*[@id=\'command\']/div[1]/div/div/div")).getText());
		
	}

}
