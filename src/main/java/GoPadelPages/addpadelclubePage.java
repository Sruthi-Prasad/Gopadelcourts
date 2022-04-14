package GoPadelPages;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class addpadelclubePage {
	WebDriver driver;
	String personName ,clubName,padelclubphone;
	public addpadelclubePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/div/div/div/ul/li[1]/a/i")
	WebElement home;
	@FindBy(xpath = "//*[@id='divdynemicmenu']/div[3]/div/div/div/ul/li[2]/a")
	WebElement padels;
	@FindBy(xpath = "//*[@id='divdynemicmenu']/div[3]/div/div/div/ul/li[2]/a")
	WebElement AddModifyPadel;
	@FindBy(xpath = "//*[@id='divdynemicmenu']/div[3]/main/div/div/div/form/div[1]/div/div[1]/div/div/input")
	WebElement PersonalNamefield;
	@FindBy(xpath = "//*[@id=\"padel_name\"]")
	WebElement PadelClubName;
	@FindBy(xpath = "//*[@id='phone_number']")
	WebElement phone_number;
	@FindBy(xpath = "//*[@id=\"mobile_number\"]")
	WebElement mobilenumber;
	public void displayhome() {
		Assert.assertEquals(true, home.isDisplayed());
		System.out.println("AddPadelclubes is displayed");
	}
	
	public void  padels() {
		Assert.assertEquals(true, padels.isDisplayed());
		System.out.println(" padels is displayed");
	}
	public void  AddModifyPadel() {
		Assert.assertEquals(true, padels.isDisplayed());
		System.out.println(" AddModifyPadel is displayed");
	}
	
	public void PersonNameField() {
		Assert.assertEquals(true, PersonalNamefield.isDisplayed());
		System.out.println("Person Name Field is displayed");
		Scanner enterPersonName = new Scanner(System.in);
		System.out.println("Enter the Person Name : ");
		personName = enterPersonName.nextLine();
		PersonalNamefield.sendKeys(personName);
	}

	public void BranchNameField() {
		Assert.assertEquals(true, PadelClubName.isDisplayed());
		System.out.println("Branch Name Field is displayed");
		Scanner enterBranchName = new Scanner(System.in);
		System.out.println("Enter the Branch Name : ");
		clubName = enterBranchName.nextLine();
		PadelClubName.sendKeys(clubName);
	}

	public void BranchPhoneField() {
		Assert.assertEquals(true, mobilenumber.isDisplayed());
		System.out.println("Branch Phone Field is displayed");padelclubePage878
		Scanner enterBranchPhone = new Scanner(System.in);
		System.out.println("Enter the Branch Phone : ");
		padelclubphone = enterBranchPhone.nextLine();
		String regex = "[0-9]+";

		if (padelclubphone.matches(regex)) {
			mobilenumber.sendKeys(padelclubphone);
		}
	}

//	public void BranchEmailField() {
//		Assert.assertEquals(true, branchEmailField.isDisplayed());
//		System.out.println("Branch Email Field is displayed");
//		Scanner enterBranchEmail = new Scanner(System.in);
//		System.out.println("Enter the Branch Email : ");
//		branchEmail = enterBranchEmail.nextLine();
//		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
//
//		if (branchEmail.matches(regex)) {
//			branchEmailField.sendKeys(branchEmail);
//		}
//	}
//
//	public void BranchAddressField() {
//		Assert.assertEquals(true, branchAddressField.isDisplayed());
//		System.out.println("Branch Address Field is displayed");
//		Scanner enterBranchAddress = new Scanner(System.in);
//		System.out.println("Enter the Branch Address : ");
//		branchAddress = enterBranchAddress.nextLine();
//		branchAddressField.sendKeys(branchAddress);
//	}
//
//	public void BranchDetailsField() {
//		Assert.assertEquals(true, branchDetailsField.isDisplayed());
//		System.out.println("Branch Details Field is displayed");
//		Scanner enterBranchDetails = new Scanner(System.in);
//		System.out.println("Enter the Branch Details : ");
//		branchDetails = enterBranchDetails.nextLine();
//		branchDetailsField.sendKeys(branchDetails);
//
//	}
//
//	public void PadelDropdown() {
//		Assert.assertEquals(true, padelDropdown.isDisplayed());
//		System.out.println("Padel Dropdown is displayed");
//		Select padleName = new Select(padelDropdown);
//		List<WebElement> padledropdown = padleName.getOptions();
//		for (WebElement padelDropdown : padledropdown) {
//			System.out.println(padelDropdown.getText());
//		}
//		padleName.selectByIndex(1);
//
//	}
//
//	public void CityDropdown() {
//		Assert.assertEquals(true, cityDropdown.isDisplayed());
//		System.out.println("City Dropdown is displayed");
//		Select city = new Select(cityDropdown);
//		List<WebElement> citydropdown = city.getOptions();
//		for (WebElement cityDropdown : citydropdown) {
//			System.out.println(cityDropdown.getText());
//		}
//		city.selectByIndex(1);
//
//	}
//
//	public void BranchLatitudeField() {
//		Assert.assertEquals(true, branchLatitudeField.isDisplayed());
//		System.out.println("Branch Latitude Field is displayed");
//		Scanner enterBranchLatitude = new Scanner(System.in);
//		System.out.println("Enter the Branch Latitude : ");
//		branchLatitude = enterBranchLatitude.nextLine();
//		branchLatitudeField.sendKeys(branchLatitude);
//	}
//
//	public void BranchLongitudeField() {
//		Assert.assertEquals(true, branchLongitudeField.isDisplayed());
//		System.out.println("Branch Longitude Field is displayed");
//		Scanner enterBranchLongitude = new Scanner(System.in);
//		System.out.println("Enter the Branch Longitude : ");
//		branchLongitude = enterBranchLongitude.nextLine();
//		branchLongitudeField.sendKeys(branchLongitude);
//
//	}
//
//	public void StatusDropdown() {
//		Assert.assertEquals(true, statusDropdown.isDisplayed());
//		System.out.println("Status Dropdown is displayed");
//		Select status = new Select(statusDropdown);
//		List<WebElement> statusdropdown = status.getOptions();
//		for (WebElement statusDropdown : statusdropdown) {
//			System.out.println(statusDropdown.getText());
//		}
//		status.selectByIndex(0);
//
//	}
//
//	public void SaveButton() {
//		Assert.assertEquals(true, saveButton.isDisplayed());
//		System.out.println("Save Button is displayed");
//		if (personName.isEmpty() && branchName.isEmpty() && branchPhone.isEmpty() && branchEmail.isEmpty()
//				&& branchAddress.isEmpty() && branchDetails.isEmpty() && branchLatitude.isEmpty()
//				&& branchLongitude.isEmpty()) {
//			((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveButton);
//			System.out.println("Error message is displayed as Please fill out this field");
//		}
//
//		else {
//			((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveButton);
//			String expectedUrl = "https://gopadel.cadvil.com/admin/padelBranch/list";
//			String actualUrl = driver.getCurrentUrl();
//			Assert.assertEquals(expectedUrl, actualUrl);
//			System.out.println("Navigated to Padel Branch Page");
//		}
//
//	}
//	
	
}
