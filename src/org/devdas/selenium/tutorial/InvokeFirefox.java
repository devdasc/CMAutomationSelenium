package org.devdas.selenium.tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFirefox {

	public static void main(String[] args) {
		
		String driverKey="webdriver.gecko.driver";
		String driverPath="C:\\Users\\devda\\Documents\\Udemy\\Selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe";
		
		System.setProperty(driverKey, driverPath);
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

	}

}
