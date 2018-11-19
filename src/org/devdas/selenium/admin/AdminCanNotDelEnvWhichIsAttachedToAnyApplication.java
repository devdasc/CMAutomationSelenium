package org.devdas.selenium.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/*------------------Can not be done now---------------*/
/* This scripts updates an existing environment to the system 
 in response to requirement of issue #34 */
public class AdminCanNotDelEnvWhichIsAttachedToAnyApplication {

	public static void main(String[] args) {
		
	}

	private static void waitDriver(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
