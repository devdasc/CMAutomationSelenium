package org.devdas.selenium.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Login {
	private static String driverKey = "webdriver.chrome.driver";
	private static String driverPath = "C:\\Users\\devda\\Documents\\Udemy\\Selenium\\chromedriver_win32\\chromedriver.exe";
	protected static WebDriver driver;
	private static Select dropdown;
	private static Actions act;
	private static WebElement element;
	protected static final String ADMIN = "Michael";
	protected static final String PASSWORD = "test123";
	protected static final String CMA = "Dinesh";
	protected static final String TSA = "Farhana";
	protected static final String QA = "Devdas";

	/*-----Instantiate Browser---Login-------Logout----close browser----explicit wait----*/

	public static void launchDriver() {
		System.setProperty(driverKey, driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

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
		waitDriver(2000);
	}

	public static void closeBrowser() {
		if (!driver.toString().contains("null")) {
			driver.close();
		}
	}

	private static void waitDriver(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/*-------Admin functionality-----------------------------------*/
	public static void clickManageSystemParameter() {
		// to click ManageSystemParameter
		element = driver.findElement(By.id("ddlManageSystemParameter"));
		act.moveToElement(element).build().perform();
		waitDriver(2000);
		element.click();
	}

	public static void clickApplicationLink() {
		element = driver.findElement(By.id("lnkApplications"));
		act.moveToElement(element).build().perform();
		waitDriver(2000);
		element.click();
		waitDriver(3000);
	}

	public static void clickAddApplicationButton() {
		driver.findElement(By.xpath("//input[@value='Add Application']")).click();
		waitDriver(4000);
	}

	public static void fillAddApplicationForm() {
		driver.findElement(By.id("applicationName")).sendKeys("test App");
		driver.findElement(By.id("description")).sendKeys("test description");
		element = driver.findElement(By.xpath("//select[@id='vendor.vendor_Id']"));
		Select dropdown = new Select(element);
		waitDriver(3000);
		dropdown.selectByIndex(3);
		waitDriver(2000);
	}

	public static void fillUpdateApplicationForm() {
		driver.findElement(By.id("applicationName")).clear();
		driver.findElement(By.id("applicationName")).sendKeys("Updated Test App");
		driver.findElement(By.id("description")).clear();
		driver.findElement(By.id("description")).sendKeys("Updated Test description");
		element = driver.findElement(By.xpath("//select[@id='vendor.vendor_Id']"));
		Select dropdown = new Select(element);
		waitDriver(3000);
		dropdown.selectByIndex(3);
		waitDriver(2000);
	}

	public static void clickEnvironmentLink() {
		element = driver.findElement(By.id("lnkEnvironments"));
		act.moveToElement(element).build().perform();
		waitDriver(2000);
		element.click();
		waitDriver(3000);
	}

	public static void clickAddEnvironmentButton() {
		driver.findElement(By.xpath("//input[@value='Add Environment']")).click();
		waitDriver(4000);
	}

	public static void fillAddEnvironmentForm() {
		driver.findElement(By.id("environmentName")).sendKeys("test Environment");
		driver.findElement(By.id("description")).sendKeys("test description");
		// Click the Save button
		waitDriver(2000);
	}

	public static void fillUpdateEnvironmentForm() {
		driver.findElement(By.id("environmentName")).clear();
		driver.findElement(By.id("environmentName")).sendKeys("Updated test Environment");
		driver.findElement(By.id("description")).clear();
		driver.findElement(By.id("description")).sendKeys("Updated test Description");
		waitDriver(2000);
	}

	public static void clickVendorLink() {
		element = driver.findElement(By.id("lnkVendors"));
		act.moveToElement(element).build().perform();
		waitDriver(2000);
		element.click();
		waitDriver(3000);
	}

	public static void clickAddVendorButton() {
		driver.findElement(By.xpath("//input[@value='Add vendor']")).click();
		waitDriver(4000);
	}

	public static void fillAddVendorForm() {
		// To fill Add Vendor form
		driver.findElement(By.id("vendorName")).sendKeys("test Vendor");
		driver.findElement(By.id("description")).sendKeys("test Vendor description");
		// Click the Save button
		waitDriver(2000);
	}

	public static void fillUpdateVendorForm() {
		driver.findElement(By.id("vendorName")).clear();
		driver.findElement(By.id("vendorName")).sendKeys("Updated test Vendor");
		driver.findElement(By.id("description")).clear();
		driver.findElement(By.id("description")).sendKeys("Updated test Vendor description");
		waitDriver(2000);
	}
/*-----------Defects functionality-----------------------------------*/
	public static void getManageDefects() {
		element = driver.findElement(By.id("ddlManageDefects"));
		act.moveToElement(element).build().perform();
		waitDriver(2000);
		element.click();
		waitDriver(2000);

	}
	public static void clickDefectDetailLink() {
		element = driver.findElement(By.id("lnkDefectAddForm"));
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
	// creates a new defect
	public static void fillDefectFixDetailForm() {
		//filling in title box
		driver.findElement(By.id("title")).sendKeys("Test Defect");
		waitDriver(2000);
		
		//selecting application
		element=driver.findElement(By.xpath("//select[@id='application.application_Id']"));
		dropdown = new Select(element);
		dropdown.selectByIndex(1);
		waitDriver(2000);
		
		//selecting vendor
		element=driver.findElement(By.xpath("//select[@id='vendor.vendor_Id']"));
		dropdown = new Select(element);
		dropdown.selectByIndex(1);
		waitDriver(2000);
		
		//selecting defect creation date
		driver.findElement(By.id("defectCreationDate")).sendKeys("2018-11-25");
		waitDriver(2000);
		
		//selecting Fix received date
		driver.findElement(By.id("fixRecieveDate")).sendKeys("2018-11-26");
		waitDriver(2000);
		
		//selecting dependent defect(not required)
		driver.findElement(By.id("dependentDefect_Id")).sendKeys("2");
		waitDriver(2000);
		
		//selecting status
		element=driver.findElement(By.id("status"));
		dropdown = new Select(element);
		dropdown.selectByVisibleText("Fix Received");
		waitDriver(2000);
		
		// selecting impacted components(not required)
		driver.findElement(By.id("impactedComponent")).sendKeys("test component");
		waitDriver(2000);
		
		// filling in package location link
		driver.findElement(By.id("deploymentPackageLocation")).sendKeys("location link");
		waitDriver(2000);
		
		// selecting whether test case is provided
		element=driver.findElement(By.id("isTestCaseprovided"));
		dropdown = new Select(element);
		dropdown.selectByValue("1");
		waitDriver(2000);
		
		//selecting whether instruction is provided
		element=driver.findElement(By.id("isDeploymentInstructionProvided"));
		dropdown = new Select(element);
		dropdown.selectByValue("1");
		waitDriver(2000);
		
		// selecting review date
		driver.findElement(By.id("reviewDate")).sendKeys("2018-11-27");
		waitDriver(2000);
		
		// filling in description
		driver.findElement(By.id("description")).sendKeys("Test Description");
		waitDriver(2000);
		
	}
/*---------------search functionality------------------------------*/
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
/*------------Update----------Delete-----Save---------Browser Alert button-------------*/
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
		waitDriver(3000);
	}

	public static void clickUpdateButtonLink() {
		driver.findElement(By.xpath("(//a[contains(text(),'Update')])[last()]")).click();
		waitDriver(3000);

	}

}
