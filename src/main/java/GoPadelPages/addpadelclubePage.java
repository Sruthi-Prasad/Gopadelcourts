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
	String personName ,clubName,padelclubphone,padelclubmobile,padelclubEmail,padelclubAddress,padelconfirmPassword,padelPassword,padelclubDetails,padelclubDescription,padelclubwebaddress;
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
	@FindBy(xpath = "//*[@id='email']")
	WebElement emailfield;
	@FindBy(xpath = "//*[@id='web']")
	WebElement web;
	@FindBy(xpath = "//*[@id='password']")
	WebElement password;
	@FindBy(xpath = "//*[@id='confirm_password']")
	WebElement confirmPassword;
	@FindBy(xpath = "//*[@id='address']")
	WebElement Addressfield;
	@FindBy(xpath = "//*[@id='Status']")
	WebElement status;
	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div/div[11]/div/textarea")
	WebElement padeldetails;
	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div/div[12]/div/textarea")
	WebElement padeldescription;
	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div/label")
	WebElement padellogo;
	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[2]/button")
	WebElement savebutton;
	public void displayhome() {
		Assert.assertEquals(true, home.isDisplayed());
		System.out.println("AddPadelclubes is displayed");
		System.out.println("===========================================================");
	}
	
	public void  padels() {
		Assert.assertEquals(true, padels.isDisplayed());
		System.out.println(" padels is displayed");
		System.out.println("===========================================================");
	}
	public void  AddModifyPadel() {
		Assert.assertEquals(true, padels.isDisplayed());
		System.out.println(" AddModifyPadel is displayed");
		System.out.println("===========================================================");
	}
	
	public void PersonNameField() {
		Assert.assertEquals(true, PersonalNamefield.isDisplayed());
		System.out.println("Person Name Field is displayed");
		System.out.println("===========================================================");
		Scanner enterPersonName = new Scanner(System.in);
		System.out.println("Enter the Person Name : ");
		personName = enterPersonName.nextLine();
		PersonalNamefield.sendKeys(personName);
	}

	public void padelclubNameField() {
		Assert.assertEquals(true, PadelClubName.isDisplayed());
		System.out.println("PadelClub Name Field is displayed");
		System.out.println("===========================================================");
		Scanner enterpadelclubhName = new Scanner(System.in);
		System.out.println("Enter the Branch Name : ");
		clubName =enterpadelclubhName.nextLine();
		PadelClubName.sendKeys(clubName);
	}

	public void padelclubmobileField() {
		Assert.assertEquals(true, mobilenumber.isDisplayed());
		System.out.println("padelclub mobile Field is displayed");
		System.out.println("===========================================================");
		Scanner enterBranchPhone = new Scanner(System.in);
		System.out.println("Enter the mobile Field : ");
		padelclubmobile = enterBranchPhone.nextLine();
		String regex = "[0-9]+";

		if (padelclubmobile.matches(regex)) {
			mobilenumber.sendKeys(padelclubmobile);
		}
	}
	public void padelclubphoneField() {
		Assert.assertEquals(true, phone_number.isDisplayed());
		System.out.println("PadelClub Phone Field is displayed");
		System.out.println("===========================================================");
		Scanner enterpadelclubPhone = new Scanner(System.in);
		System.out.println("Enter thePadelClub Phone : ");
		padelclubphone = enterpadelclubPhone.nextLine();
		String regex = "[0-9]+";

		if (padelclubphone.matches(regex)) {
			phone_number.sendKeys(padelclubphone);
		}
	}
	public void padelclubEmailField() {
		Assert.assertEquals(true, emailfield.isDisplayed());
		System.out.println("PadelClub Email Field is displayed");
		System.out.println("===========================================================");
		Scanner enterpadelclubEmail = new Scanner(System.in);
		System.out.println("Enter the Email Field : ");
		padelclubEmail = enterpadelclubEmail.nextLine();
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

		if (padelclubEmail.matches(regex)) {
			emailfield.sendKeys(padelclubEmail);
		}
	}
	
	public void padelclubwebField() {
		Assert.assertEquals(true, web.isDisplayed());
		System.out.println("PadelClub web Field is displayed");
		System.out.println("===========================================================");
		Scanner enterpadelclubweb = new Scanner(System.in);
		System.out.println("Enter the padelclubweb web: ");
		padelclubwebaddress = enterpadelclubweb.nextLine();
		web.sendKeys(padelclubwebaddress);
	}
	public void padelpasswordField() {
		Assert.assertEquals(true, password.isDisplayed());
		System.out.println("Password  Field is displayed");
		System.out.println("===========================================================");
		Scanner enterpadelclubPassword = new Scanner(System.in);
		System.out.println("Enter the padelPassword address: ");
		padelPassword = enterpadelclubPassword.nextLine();
		password.sendKeys(padelPassword);
	}
	public void padelconfirmpasswordField() {
		Assert.assertEquals(true, confirmPassword.isDisplayed());
		System.out.println("confirmPassword Field is displayed");
		System.out.println("===========================================================");
		Scanner enterpadelclubconfirmPassword = new Scanner(System.in);
		System.out.println("Enter the confirmPassword: ");
		padelconfirmPassword =  enterpadelclubconfirmPassword.nextLine();
		confirmPassword.sendKeys(padelconfirmPassword);
	}
	

	public void padelclubAddressField() {
		Assert.assertEquals(true, Addressfield.isDisplayed());
		System.out.println("PadelClub Address Field is displayed");
		System.out.println("===========================================================");
		Scanner enterpadelclubAddress = new Scanner(System.in);
		System.out.println("Enter the padelclubAddress : ");
		padelclubAddress = enterpadelclubAddress.nextLine();
		Addressfield.sendKeys(padelclubAddress);
	}
	
	
	public void StatusDropdown() {
		Assert.assertEquals(true, status.isDisplayed());
		System.out.println("Status Dropdown is displayed");
		System.out.println("===========================================================");
		Select Status = new Select(status);
		List<WebElement> statusdropdown = Status.getOptions();
		for (WebElement statusDropdown : statusdropdown) {
			System.out.println(statusDropdown.getText());
		}
		Status.selectByIndex(0);

	}
	
	public void padelclubDetailsField() {
		Assert.assertEquals(true, padeldetails.isDisplayed());
		System.out.println("PadelClub Details Field is displayed");
		System.out.println("===========================================================");
		Scanner enterpadelclubDetails = new Scanner(System.in);
		System.out.println("Enter the Branch Details : ");
		padelclubDetails = enterpadelclubDetails.nextLine();
		padeldetails.sendKeys(padelclubDetails);

	}
	public void padelclubdescription() {
		Assert.assertEquals(true, padeldescription.isDisplayed());
		System.out.println("PadelClub Details Field is displayed");
		System.out.println("===========================================================");
		Scanner enterpadelclubdescription = new Scanner(System.in);
		System.out.println("Enter the Branch Details : ");
		padelclubDescription = enterpadelclubdescription.nextLine();
		padeldescription.sendKeys(padelclubDescription);
	
	}

	
	
public void SaveButton() {
	Assert.assertEquals(true, savebutton.isDisplayed());
	System.out.println("Save Button is displayed");
	if(personName.isEmpty() && clubName.isEmpty() &&  padelclubmobile.isEmpty()&& padelclubphone.isEmpty() && padelclubEmail.isEmpty()
			&& padelclubAddress.isEmpty() && padelconfirmPassword.isEmpty() && padelclubwebaddress.isEmpty()
			) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", savebutton);
		System.out.println("Error message is displayed as Please fill out this field");
		System.out.println("===========================================================");
	}
	else {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", savebutton);
		String expectedUrl = "https://gpv2.cadvil.com/bookings/list-padels";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("Navigated to Padel club Page");
		System.out.println("===========================================================");
	}
}
}



