package GoPadelTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import GoPadelPages.GoPadelAddPadelBranchPage;
import GoPadelPages.GoPadelDashboardPage;
import GoPadelPages.GoPadelLoginPage;
import GoPadelPages.GoPadelPadelBranchPage;
import GoPadelPages.GoPadelpadellistpage;
import GoPadelPages.addpadelclubePage;
import TestScenario.GoPadelTestBase;

public class GoPadelTest extends GoPadelTestBase {

	GoPadelLoginPage loginPage;
	GoPadelPadelBranchPage padelBranchPage;
	GoPadelpadellistpage padellistPage;
	addpadelclubePage padelclubePage;

	// Log4j configuration
	private static final Logger log = LogManager.getLogger(GoPadelTest.class);

	@Test(priority = 0)
	public void PadelBranchesTest() {

		log.info("Verifying successful login.");

		loginPage = new GoPadelLoginPage(driver);

		GoPadelDashboardPage dashboardPage = loginPage.login("admin", "Admin@12345");
		dashboardPage.clickOnpadellists();

	} 
	
	@Test(priority = 1)
	public void padellistPageTest()
	{
		padellistPage =	new GoPadelpadellistpage(driver);
		padellistPage.displayhomebutton();
		padellistPage.displayPreviousButton();
		padellistPage.displayNextButton();
		padellistPage.displaySearchBar();
		padellistPage.displayAddPadelclubes();
		padellistPage.searchBarFunctionality();
	}
		


@Test(priority = 2)
public void PadellistPageTitle() {
	padelclubePage = new addpadelclubePage(driver);
	padelclubePage.AddModifyPadel();
	padelclubePage.displayhome();
	padelclubePage.PersonNameField();
	padelclubePage.BranchPhoneField();
	padelclubePage.BranchNameField();
}
	
	

}

//	@Test(priority = 2)
//	public void AddPadelBranchPageTest() {
//		addpadelBranchPage = new GoPadelAddPadelBranchPage(driver);
//		addpadelBranchPage.displayAddPadelBranchPageTitle();
//		addpadelBranchPage.PersonNameField();
//		addpadelBranchPage.BranchNameField();
//		addpadelBranchPage.BranchPhoneField();
//		addpadelBranchPage.BranchEmailField();
//		addpadelBranchPage.BranchAddressField();
//		addpadelBranchPage.BranchDetailsField();
//		addpadelBranchPage.PadelDropdown();
//		addpadelBranchPage.CityDropdown();
//		addpadelBranchPage.BranchLatitudeField();
//		addpadelBranchPage.BranchLongitudeField();
//		addpadelBranchPage.StatusDropdown();
//		addpadelBranchPage.SaveButton();
//	}
//
//	@Test(priority = 3)
//	public void VerifyAddedPadelBranchTest() {
//		padelBranchPage.verifyPadelBranchAdded();
//	}
