package org.devdas.selenium.alluser;

import org.devdas.selenium.tutorial.Login;

public class UserDoesNotGetAnySearchResult_If_DefectId_Or_SearchStringIsNotValid_59_done extends Login {

	public static void main(String[] args) {
		// launch the driver
		launchDriver();
		// get logged in
		getLogin(CMA, PASSWORD);
		// move to manage Defects link and click
		getManageDefects();
		// move to defect List link and click
		getDefectList();
		// search by keyword which is not present in the defect description
		search("connect");
		searchWithEmptyString();
		//search by defect ID which does not exist
		search("10");
		searchWithEmptyString();
		// log out
		getLogout();
		// close the browser
		closeBrowser();

	}

}
