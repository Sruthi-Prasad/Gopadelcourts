package GoPadelTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import GoPadelPages.GoPadelAddPadelBranchPage;
import GoPadelPages.GoPadelAddPadelcourtPage;
import GoPadelPages.GoPadelDashboardPage;
import GoPadelPages.GoPadelLoginPage;
import GoPadelPages.GoPadelPadelBranchPage;
import GoPadelPages.GoPadelpadellistpage;
import GoPadelPages.GopadelCreatecouppage;
import GoPadelPages.GopadelPadelCourts;
import GoPadelPages.addpadelclubePage;
import TestScenario.GoPadelTestBase;

public class GoPadelTest extends GoPadelTestBase {

	GoPadelLoginPage loginPage;
	GoPadelPadelBranchPage padelBranchPage;
	GoPadelpadellistpage padellistPage;
	addpadelclubePage padelclubePage;
	GoPadelAddPadelBranchPage AddPadelBranchPage;
	GoPadelDashboardPage dashboardPage;
	GopadelPadelCourts PadelCourts;
	GoPadelAddPadelcourtPage AddPadelcourtPage;
	GopadelCreatecouppage Createcouppage;

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
	public void padellistPageTest() {
		padellistPage = new GoPadelpadellistpage(driver);
		padellistPage.displayhomebutton();
		padellistPage.displayPreviousButton();
		padellistPage.displayNextButton();
		padellistPage.displaySearchBar();
		padellistPage.displayAddPadelclubes();
		padellistPage.searchBarFunctionality();
		padellistPage.clickAddPanellistButton();

	}
//
	@Test(priority = 2)
	public void addpadelpage() {
		padelclubePage = new addpadelclubePage(driver);
		padelclubePage.AddModifyPadel();
		padelclubePage.displayhome();
		padelclubePage.PersonNameField();
		padelclubePage.padelclubNameField();
		padelclubePage.padelclubphoneField();
		padelclubePage.padelclubmobileField();
		padelclubePage.padelclubEmailField();
		padelclubePage.padelclubwebField();
		padelclubePage.padelpasswordField();
		padelclubePage.padelconfirmpasswordField();
		padelclubePage.padelclubAddressField();
		padelclubePage.StatusDropdown();
		padelclubePage.padelclubDetailsField();
		padelclubePage.padelclubdescription();
		padelclubePage.SaveButton();
	}
	@Test(priority = 3)
	public void VerifyAddedPadelBranchTest() {
		padellistPage.verifyPadellistAdded();
			}

	@Test(priority = 4)
	public void clickOnPadelBranches() {
		dashboardPage = new GoPadelDashboardPage(driver);
		dashboardPage.clickOnPadelBranches();

	}

	@Test(priority = 5)
	public void PadelBranchPageTest() {
		padelBranchPage = new GoPadelPadelBranchPage(driver);
		padelBranchPage.displayTitle();
		padelBranchPage.searchBarFunctionality();
		padelBranchPage.displayAddPadelBranchButton();
		padelBranchPage.displaybranchesfor();
		padelBranchPage.displayTableHeaders();
		padelBranchPage.displaySearchBar();
		padelBranchPage.Excel();
		padelBranchPage.displayNextButton();
		padelBranchPage.displayPreviousButton();
		padelBranchPage.verifyPadelBranchAdded();
		padelBranchPage.displayhome();
		padelBranchPage.displayBranches();
		padelBranchPage.displaypadels();
		padelBranchPage.selectFromShowEntriesDropdown();
		padelBranchPage.clickAddbranch();
	}
//
////	@Test(priority = 5)
////	public void AddPadelBranchPage() {
////		AddPadelBranchPage = new GoPadelAddPadelBranchPage(driver);
////		AddPadelBranchPage.breadcrumb();
////		AddPadelBranchPage.PersonNameField();
////		AddPadelBranchPage.BranchNameField();
////		AddPadelBranchPage.BranchPhoneField();
////		AddPadelBranchPage.BranchEmailField();
////		AddPadelBranchPage.BranchDetailsField();
////		AddPadelBranchPage.BranchAddressField();
////		AddPadelBranchPage.BranchLatitudeField();
////		AddPadelBranchPage.BranchLongitudeField();
////		AddPadelBranchPage.CityDropdown();
////		AddPadelBranchPage.PadelDropdown();
////		AddPadelBranchPage.StatusDropdown();
////		AddPadelBranchPage.TransectionFeePercentageField();
////		AddPadelBranchPage.ShowInMobileApp();
////		AddPadelBranchPage.BranchStartTime();
////		AddPadelBranchPage.BranchStartTime();
////		AddPadelBranchPage.BranchendstartTimeMobileApp();
//////		AddPadelBranchPage.BranchendendTimeMobileApp();
////		AddPadelBranchPage.ShowInMobileApp();
////		AddPadelBranchPage.ServicesFees();
////		AddPadelBranchPage.SaveButton();
////	}
//
	@Test(priority = 6)
	public void clickOnPadelcourt() {
		dashboardPage = new GoPadelDashboardPage(driver);
		dashboardPage.clickOnPadelcourt();

	}

	@Test(priority = 7)
	public void PadelCourtsPage() {
		PadelCourts = new GopadelPadelCourts(driver);

		PadelCourts.breadcrumb();
		PadelCourts.displayNextButton();
		PadelCourts.displayPreviousButton();
		PadelCourts.displayExcel();
		PadelCourts.displaySearchBar();
		PadelCourts.displayTableHeaders();
		PadelCourts.displayTitle();
		PadelCourts.clickAddbranch();
		PadelCourts.displaybranchesfor();
		PadelCourts.displayaddPadelcourtButton();
		PadelCourts.clickaddPadelcourtButton();
	}

	@Test(priority = 8)
	public void AddPadelCourtsPage() {
		AddPadelcourtPage = new GoPadelAddPadelcourtPage(driver);
		AddPadelcourtPage.breadcrumb();
		AddPadelcourtPage.PadelName();
		AddPadelcourtPage.CourtName();
		AddPadelcourtPage.CourtType();
//		AddPadelcourtPage.AllowBookingFromMobileApp();
		AddPadelcourtPage.Status();
		AddPadelcourtPage.SaveButton();
	}

	@Test(priority = 9)
	public void DiscountCoupons() {
		dashboardPage = new GoPadelDashboardPage(driver);
		dashboardPage.DiscountCoupons();
	}

	@Test(priority = 10)
	public void clickcreatecoupns() {
		Createcouppage = new GopadelCreatecouppage(driver);
		Createcouppage.Title();
		Createcouppage.DiscountType();
		Createcouppage.Description();
		Createcouppage.Amount();
		Createcouppage.breadcrumb();
		Createcouppage.DailyNoLimit();
		Createcouppage.IsAlphanumeric();
		Createcouppage.NoLimit();
		Createcouppage.PerPersonLimit();
		Createcouppage.RandomCode();
		Createcouppage.startdate();
		Createcouppage.EndDate();
	}
}
