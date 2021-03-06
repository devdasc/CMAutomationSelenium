package org.devdas.selenium.cma;

import org.devdas.selenium.tutorial.Login;

public class CMACanCreateNewDefectByProvidingAllRequiredInformation_61 extends Login{

	public static void main(String[] args) {
		// instantiate the browser
		launchDriver();
		// get login as CMA
		getLogin(CMA, PASSWORD);
		// click manage Defects link
		getManageDefects();
		// click defect detail link
		clickDefectDetailLink();
		// fill in the defect fix detail form to create a new defect
		fillDefectFixDetailForm();
		// to click save button
		clickSaveButton();
		// logout
		/*getLogout();
		// close the driver
		closeBrowser();
*/
	}

}
