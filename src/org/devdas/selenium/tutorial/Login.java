package org.devdas.selenium.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {
	private static String driverKey = "webdriver.chrome.driver";
	private static String driverPath = "C:\\Users\\devda\\Documents\\Udemy\\Selenium\\chromedriver_win32\\chromedriver.exe";
	protected static WebDriver driver;
	private static Actions act;
	private static WebElement element;
	protected static final String ADMIN = "Michael";
	protected static final String PASSWORD = "test123";
	protected static final String CMA = "Dinesh";
	protected static final String TSA = "Farhana";
	protected static final String QA = "Devdas";

	public static void getLogin(String userName, String password) {
		act = new Actions(driver);
		// login to cmautomation as CMA------------------>
		driver.get("http://localhost:8090/cmautomation/showLoginPage");
		// for mouse hover action
		// fill in username & password for admin
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		// move to Login button
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"command\"]/div[4]/div/button"));
		act.moveToElement(ele).build().perform();
		waitDriver(2000);
		// click onto the button
		ele.click();
		waitDriver(2000);
	}

	public static void getLogout() {
		// log out
		driver.findElement(By.xpath("/html/body/nav/div/ul[2]/li[3]/a")).click();
	}

	public static void getManageDefects() {
		element = driver.findElement(By.id("ddlManageDefects"));
		act.moveToElement(element).build().perform();
		waitDriver(2000);
		element.click();
		waitDriver(2000);

	}

	public static void getDefectList() {
		// click on the defect list
		element = driver.findElement(By.id("lnkDefectList"));
		act.moveToElement(element).build().perform();
		waitDriver(2000);
		element.click();
		waitDriver(3000);
	}

	public static void search(String searchName) {
		driver.findElement(By.id("theSearchName")).sendKeys(searchName);
		waitDriver(2000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		waitDriver(3000);

	}

	public static void searchWithEmptyString() {
		driver.findElement(By.id("theSearchName")).sendKeys("");
		waitDriver(2000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		waitDriver(3000);

	}

	private static void waitDriver(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void closeBrowser() {
		if (!driver.toString().contains("null")) {
			driver.close();
		}
	}

	public static void launchDriver() {
		System.setProperty(driverKey, driverPath);
		driver = new ChromeDriver();
	}

	public static void clickManageSystemParameter() {
		// to click ManageSystemParameter
		element = driver.findElement(By.id("ddlManageSystemParameter"));
		act.moveToElement(element).build().perform();
		waitDriver(2000);
		element.click();
	}

	public static void clickVendorLink() {
		element = driver.findElement(By.id("lnkVendors"));
		act.moveToElement(element).build().perform();
		waitDriver(2000);
		element.click();
		waitDriver(3000);
	}

	public static void clickApplicationLink() {
		element = driver.findElement(By.id("lnkApplications"));
		act.moveToElement(element).build().perform();
		waitDriver(2000);
		element.click();
		waitDriver(3000);
	}
	public static void clickEnvironmentLink() {
		element = driver.findElement(By.id("lnkEnvironments"));
		act.moveToElement(element).build().perform();
		waitDriver(2000);
		element.click();
		waitDriver(3000);
	}


	public static void clickAddApplicationButton() {
		driver.findElement(By.xpath("//input[@value='Add Application']")).click();
		waitDriver(4000);
	}

	public static void clickAddVendorButton() {
		driver.findElement(By.xpath("//input[@value='Add vendor']")).click();
		waitDriver(4000);
	}
	public static void clickAddEnvironmentButton() {
		driver.findElement(By.xpath("//input[@value='Add Environment']")).click();
		waitDriver(4000);
	}

	public static void fillAddVendorForm() {
		// To fill Add Vendor form
		driver.findElement(By.id("vendorName")).sendKeys("test Vendor");
		driver.findElement(By.id("description")).sendKeys("test Vendor description");
		// Click the Save button
		waitDriver(2000);
	}

	public static void fillAddApplicationForm() {
		driver.findElement(By.id("environmentName")).sendKeys("test");
		driver.findElement(By.id("description")).sendKeys("test description");
		// Click the Save button
		waitDriver(2000);
	}
	public static void fillAddEnvironmentForm() {
		driver.findElement(By.id("environmentName")).sendKeys("test Environment");
		driver.findElement(By.id("description")).sendKeys("test description");
		// Click the Save button
		waitDriver(2000);
	}

	public static void fillUpdateVendorForm() {
		driver.findElement(By.id("vendorName")).clear();
		driver.findElement(By.id("vendorName")).sendKeys("Updated test Vendor");
		driver.findElement(By.id("description")).clear();
		driver.findElement(By.id("description")).sendKeys("Updated test Vendor description");
	}

	public static void clickDeleteButtonLink() {
		driver.findElement(By.xpath("(//a[contains(text(),'Delete')])[last()]")).click();
		waitDriver(3000);
	}

	public static void clickBrowserAlertToConform() {
		// click on the browser alert to confirm delete action
		driver.switchTo().alert().accept();
		waitDriver(2000);
	}

	public static void clickSaveButton() {

		driver.findElement(By.xpath("//input[@value='Save']")).click();
		waitDriver(2000);
	}

	public static void clickUpdateButtonLink() {
		driver.findElement(By.xpath("(//a[contains(text(),'Update')])[last()]")).click();
		waitDriver(3000);

	}

}
