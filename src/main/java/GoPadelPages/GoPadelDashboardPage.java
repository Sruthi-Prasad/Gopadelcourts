package GoPadelPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoPadelDashboardPage {
	WebDriverWait wait;
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"minileftbar\"]/ul/li[4]/a/i")
	WebElement menu;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[1]/aside[2]/div[2]/div/div[1]/div/div[2]/ul/li[1]/a")
	WebElement PadelList;

	@FindBy(xpath = "//*[@id='divdynemicmenu']/div[1]/aside[2]/div[2]/div/div[1]/div/div[2]/ul/li[2]/a")
	WebElement PadelBranches;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[1]/aside[2]/div[2]/div/div[1]/div/div[2]/ul/li[3]/a")
	WebElement Padelcourt;
	@FindBy(xpath = "//*[text()='Discount Coupons']")
	WebElement DiscountCoupons;

	@FindBy(xpath = "//*[text()='Create Coupons'] ")
	WebElement CreateCoupons;

	@FindBy(xpath = "//*[@id=\"leftsidebar\"]/div/ul/li[16]/a/i")
	WebElement Hover;

	public GoPadelDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnpadellists() {
		menu.click();
		PadelList.click();
	}

	public void clickOnPadelBranches() {
		menu.click();
		PadelBranches.click();
	}

	public void clickOnPadelcourt() {
		menu.click();
		Padelcourt.click();
	}

	public void DiscountCoupons() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Hover);
		actions.perform();
		CreateCoupons.click();
	}
}
