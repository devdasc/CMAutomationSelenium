package org.devdas.selenium.tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeMicrosoftEdge {

	public static void main(String[] args) {
		
		String driverKey="webdriver.edge.driver";
		String driverPath="C:\\Users\\devda\\Documents\\Udemy\\Selenium\\MicrosoftWebDriver.exe";
		
		System.setProperty(driverKey, driverPath);
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

	}

}
