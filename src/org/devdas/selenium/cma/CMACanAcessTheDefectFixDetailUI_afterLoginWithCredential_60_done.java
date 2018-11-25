package org.devdas.selenium.cma;

import org.devdas.selenium.tutorial.Login;

public class CMACanAcessTheDefectFixDetailUI_afterLoginWithCredential_60_done extends Login {

	public static void main(String[] args) {
		// instantiate the browser
		launchDriver();
		// get login as CMA
		getLogin(CMA, PASSWORD);
		// click manage Defects link
		getManageDefects();
		// click defect detail link
		clickDefectDetailLink();
		// logout
		getLogout();

		// close the driver
		closeBrowser();

	}

}
