package org.devdas.selenium.admin;

import org.devdas.selenium.tutorial.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*--------------------Done------------#30--------*/
public class InvalidLogInAdmin_30_done extends Login {

	public static void main(String[] args) {

		// instantiate the browser
		launchDriver();
		// log in as Admin with aflase password
		getLogin(ADMIN, PASSWORD+"4");
	}

}
