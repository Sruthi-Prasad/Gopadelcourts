package GoPadelPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoPadelDashboardPage {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"minileftbar\"]/ul/li[4]/a/i")
	WebElement menu;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[1]/aside[2]/div[2]/div/div[1]/div/div[2]/ul/li[1]/a")
	WebElement PadelList;

	public GoPadelDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnpadellists() {
		menu.click();
		PadelList.click();
	}

}
