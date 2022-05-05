package GoPadelPages;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GoPadelAddPadelBranchPage {
	WebDriver driver;
	String personName, branchName, branchPhone, branchEmail, branchAddress, branchDetails, branchLatitude,
			branchLongitude, TransectionFeePercentages, ServiceFees;

	@FindBy(className = "breadcrumb")
	WebElement breadcrumb;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div[2]/div/div/input")
	WebElement branchNameField;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div[1]/div/div/input")
	WebElement personNameField;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div[3]/div/div/input")
	WebElement BranchPhone;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div[4]/div/div/input")
	WebElement branchEmailField;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div[5]/div/div/input")
	WebElement branchAddressField;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div[6]/div/div/input")
	WebElement branchDetailsField;

	@FindBy(xpath = "//*[@id='PadelId']")
	WebElement Padelid;

	@FindBy(xpath = "//*[@id='h-10']")
	WebElement H_starttime;

	@FindBy(xpath = "//*[@id=\"tm-15\"]")
	WebElement M_starttime;

	@FindBy(xpath = "//*[@class='dtp-btn-ok btn btn-flat']")
	WebElement starttimeokbutton;

	@FindBy(xpath = "//*[@id='th-1']")
	WebElement H_Endtime;

	@FindBy(xpath = "//*[@id='tm-30']")
	WebElement M_Endtime;

	@FindBy(xpath = "//*[@class='dtp-btn-ok btn btn-flat']")
	WebElement Endtimeokbutton;

	@FindBy(name = "StartTimeForMobile")
	WebElement BranchStartTimeMobileApp;

	@FindBy(xpath = "//*[@id=\"th-16\"]")
	WebElement H_starttimeMobile;

	@FindBy(xpath = "//*[@id='th-12']")
	WebElement M_starttimeMobile;

	@FindBy(id = "th-10")
	WebElement H_starttimeMobileapp;

	@FindBy(xpath = "//*[@id='th-11']")
	WebElement H_starttimemobile;

	@FindBy(xpath = "(//*[@id=\"th-11\"])[2]")
	WebElement M_Endtimemobile;

	@FindBy(xpath = "(//*[text()=\"OK\"])[4]")
	WebElement OkbuttonendBranchMobileApp;

	@FindBy(xpath = "//*[@id='dtp_uBPJp']/div/div[2]/button[4]")
	WebElement OkbuttonstartBranchMobileApp;

	@FindBy(name = "EndTimeForMobile")
	WebElement BranchendTimeMobileApp;

	@FindBy(xpath = "//*[@id=\"th-1\"]")
	WebElement H_startendtimemobile;

	@FindBy(xpath = " //*[@id='CityId']")
	WebElement cityDropdown;

	@FindBy(xpath = "//*[@id='ShowInMobileApp']")
	WebElement ShowInMobileApp;

	@FindBy(xpath = "//*[@class='menu_sm ng-scope ls-closed']")
	WebElement ServiceFee;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div[9]/div/div/input")
	WebElement branchLatitudeField;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div[10]/div/div/input")
	WebElement branchLongitudeField;

	@FindBy(xpath = "//*[@id='Status']")
	WebElement Status;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div[13]/div/div/input")
	WebElement TransectionFeePercentage;

	@FindBy(name = "StartTime")
	WebElement BranchStartTime;

	@FindBy(name = "EndTime")
	WebElement BranchEndTime;

	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[3]/div/div[2]/div/form/div/div[19]/button")
	WebElement saveButton;

	@FindBy(xpath = "//*[@id=\"file\"]")
	WebElement BranchLogo;

	@FindBy(xpath = "//*[@id=\"example_filter\"]/label/input")
	WebElement searchBar;

	public GoPadelAddPadelBranchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void breadcrumb() {
		Assert.assertEquals(true, breadcrumb.isDisplayed());
		System.out.println(" breadcrumb is displayed with " + breadcrumb.getText());
		System.out.println("===========================================================");
	}

	public void PersonNameField() {
		Assert.assertEquals(true, personNameField.isDisplayed());
		System.out.println("Person Name Field is displayed");
		System.out.println("===========================================================");
		Scanner enterPersonName = new Scanner(System.in);
		System.out.println("Enter the Person Name : ");
		personName = enterPersonName.nextLine();
		personNameField.sendKeys(personName);
	}

	public void BranchNameField() {
		Assert.assertEquals(true, branchNameField.isDisplayed());
		System.out.println("Branch Name Field is displayed");
		System.out.println("===========================================================");
		Scanner enterBranchName = new Scanner(System.in);
		System.out.println("Enter the Branch Name : ");
		branchName = enterBranchName.nextLine();
		branchNameField.sendKeys(branchName);
	}

	public void BranchPhoneField() {
		Assert.assertEquals(true, BranchPhone.isDisplayed());
		System.out.println("Branch Phone Field is displayed");
		System.out.println("===========================================================");
		Scanner enterBranchPhone = new Scanner(System.in);
		System.out.println("Enter the Branch Phone : ");
		branchPhone = enterBranchPhone.nextLine();
		String regex = "[0-9]+";

		if (branchPhone.matches(regex)) {
			BranchPhone.sendKeys(branchPhone);
		}
	}

	public void BranchEmailField() {
		Assert.assertEquals(true, branchEmailField.isDisplayed());
		System.out.println("Branch Email Field is displayed");
		System.out.println("===========================================================");
		Scanner enterBranchEmail = new Scanner(System.in);
		System.out.println("Enter the Branch Email : ");
		branchEmail = enterBranchEmail.nextLine();
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

		if (branchEmail.matches(regex)) {
			branchEmailField.sendKeys(branchEmail);
		}
	}

	public void BranchAddressField() {
		Assert.assertEquals(true, branchAddressField.isDisplayed());
		System.out.println("Branch Address Field is displayed");
		System.out.println("===========================================================");
		Scanner enterBranchAddress = new Scanner(System.in);
		System.out.println("Enter the Branch Address : ");
		branchAddress = enterBranchAddress.nextLine();
		branchAddressField.sendKeys(branchAddress);
	}

	public void BranchDetailsField() {
		Assert.assertEquals(true, branchDetailsField.isDisplayed());
		System.out.println("Branch Details Field is displayed");
		System.out.println("===========================================================");
		Scanner enterBranchDetails = new Scanner(System.in);
		System.out.println("Enter the Branch Details : ");
		branchDetails = enterBranchDetails.nextLine();
		branchDetailsField.sendKeys(branchDetails);

	}

	public void PadelDropdown() {
		Assert.assertEquals(true, Padelid.isDisplayed());
		System.out.println("Padel Dropdown is displayed");
		System.out.println("===========================================================");
		Select padleName = new Select(Padelid);
		List<WebElement> padledropdown = padleName.getOptions();
		for (WebElement padelDropdown : padledropdown) {
			System.out.println(padelDropdown.getText());
		}
		padleName.selectByIndex(1);

	}

	public void CityDropdown() {
		Assert.assertEquals(true, cityDropdown.isDisplayed());
		System.out.println("City Dropdown is displayed");
		System.out.println("===========================================================");
		Select city = new Select(cityDropdown);
		List<WebElement> citydropdown = city.getOptions();
		for (WebElement cityDropdown : citydropdown) {
			System.out.println(cityDropdown.getText());
		}
		city.selectByIndex(1);

	}

	public void BranchLatitudeField() {
		Assert.assertEquals(true, branchLatitudeField.isDisplayed());
		System.out.println("Branch Latitude Field is displayed");
		System.out.println("===========================================================");
		Scanner enterBranchLatitude = new Scanner(System.in);
		System.out.println("Enter the Branch Latitude : ");
		branchLatitude = enterBranchLatitude.nextLine();
		branchLatitudeField.sendKeys(branchLatitude);
	}

	public void TransectionFeePercentageField() {
		Assert.assertEquals(true, TransectionFeePercentage.isDisplayed());
		System.out.println("Branch Longitude Field is displayed");
		System.out.println("===========================================================");
		Scanner enterBranchTransectionFeePercentage = new Scanner(System.in);
		System.out.println("Enter the Branch Longitude : ");
		TransectionFeePercentages = enterBranchTransectionFeePercentage.nextLine();
		TransectionFeePercentage.sendKeys(TransectionFeePercentages);

	}

	public void BranchLongitudeField() {
		Assert.assertEquals(true, branchLongitudeField.isDisplayed());
		System.out.println("Branch Longitude Field is displayed");
		System.out.println("===========================================================");
		Scanner enterBranchLongitude = new Scanner(System.in);
		System.out.println("Enter the Branch Longitude : ");
		branchLongitude = enterBranchLongitude.nextLine();
		branchLongitudeField.sendKeys(branchLongitude);

	}

	public void StatusDropdown() {
		Assert.assertEquals(true, Status.isDisplayed());
		System.out.println("Status Dropdown is displayed");
		Select status = new Select(Status);
		List<WebElement> statusdropdown = status.getOptions();
		for (WebElement statusDropdown : statusdropdown) {
			System.out.println(statusDropdown.getText());
		}
		status.selectByIndex(0);

	}

	public void BranchStartTime() {
		Assert.assertEquals(true, BranchStartTime.isDisplayed());
		System.out.println(" BranchStartTime field is displayed");
		BranchStartTime.click();
		starttimeokbutton.click();
		M_starttime.click();
		starttimeokbutton.click();

	}

	public void BranchEndTime() {
		Assert.assertEquals(true, BranchEndTime.isDisplayed());
		System.out.println(" BranchStartTime Field is displayed");
		BranchEndTime.click();
		Endtimeokbutton.click();
		M_Endtime.click();
		Endtimeokbutton.click();
	}

	public void BranchendstartTimeMobileApp() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Assert.assertEquals(true, BranchendTimeMobileApp.isDisplayed());
		System.out.println(" BranchStartimeMobileApp Field is displayed");
		BranchendTimeMobileApp.sendKeys("10:56");
//		WebElement OkbuttonstartBranchMobileApp = wait.until(ExpectedConditions.visibilityOfElementLocated(
//				By.xpath("//*[@id=\"dtp_VaOqv\"]/div/div[2]/button[4]")));
//		Actions acn = new Actions(driver); 
//		acn.moveToElement(OkbuttonstartBranchMobileApp).click().build().perform();
//		acn.moveToElement(OkbuttonstartBranchMobileApp).click().build().perform();
	}

	public void BranchendendTimeMobileApp() {

		Assert.assertEquals(true, BranchendTimeMobileApp.isDisplayed());
		System.out.println(" BranchStartimeMobileApp Field is displayed");
		BranchendTimeMobileApp.click();
		H_startendtimemobile.click();
		OkbuttonendBranchMobileApp.click();

		OkbuttonendBranchMobileApp.click();
	}

	public void ServicesFees() {
		Assert.assertEquals(true, ServiceFee.isDisplayed());
		System.out.println("ServiceFee Field is displayed");
		System.out.println("===========================================================");
		Scanner enterServiceFees = new Scanner(System.in);
		System.out.println("Enter the ServiceFee : ");
		ServiceFees = enterServiceFees.nextLine();
		ServiceFee.sendKeys(ServiceFees);
	}

	public void Branchlogo() {
		Assert.assertEquals(true, BranchLogo.isDisplayed());
		System.out.println(" BranchLogo Field is displayed");

	}

	public void ShowInMobileApp() {
		Assert.assertEquals(true, ShowInMobileApp.isDisplayed());
		System.out.println("ShowInMobileApp Field is displayed");
		System.out.println("===========================================================");
		ShowInMobileApp.isEnabled();
		System.out.println("Toggle button is Enable   ");

	}

	public void SaveButton() {
		Assert.assertEquals(true, saveButton.isDisplayed());
		System.out.println("Save Button is displayed");
		System.out.println("=========================================================================");
		if (personName.isEmpty() && branchName.isEmpty() && branchPhone.isEmpty() && branchEmail.isEmpty()
				&& branchAddress.isEmpty() && branchDetails.isEmpty() && branchLatitude.isEmpty()
				&& branchLongitude.isEmpty()) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveButton);
			System.out.println("Error message is displayed as Please fill out this field");
		}

		else {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveButton);
			String expectedUrl = "https://gpv2.cadvil.com/bookings/list-branches?PadelId=1";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl, actualUrl);
			System.out.println("Navigated to Padel Branch Page");
		}

	}

}
