package GoPadelPages;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GopadelCreatecouppage {
	WebDriver driver;
	String Titles ,DiscountTypes,Descriptions,Amounts;
	@FindBy(className = "breadcrumb-item")
	WebElement  breadcrumb;

	@FindBy(xpath = "//*[@id='Title']")
	WebElement Title;

	@FindBy(xpath = "//*[@id='DiscountType']")
	WebElement DiscountType;

	@FindBy(xpath = "//*[@id='Description']")
	WebElement Description;

	@FindBy(xpath  = "//*[@id='Amount']")
	WebElement Amount;

	@FindBy(xpath  = "//*[@id='StartDate']")
	WebElement StartDate;

	@FindBy(xpath = "//*[@id='NoOfLimit']")
	WebElement TotalUsable;

	@FindBy(xpath = "//*[@id='NoOfPersonLimit']")
	WebElement PerPersonLimit;
	
	
	@FindBy(xpath = "//*[@id='IsNoOfLimit']")
	WebElement NoLimit;

	@FindBy(xpath ="//*[text()='Per Person No Limit']")
	WebElement perperson;
	
	@FindBy(xpath = "//*[@id='NoOfDailyLimit']")	
	WebElement NumberOfCode;
	
	@FindBy(xpath = "//*[@id='Code']")
	WebElement Code;

	@FindBy(xpath ="//*[@id='Status']")
	WebElement status;
	@FindBy(xpath ="//*[text()='Daily No Limit']")
	WebElement DailyNoLimit;
			
	@FindBy(xpath ="//*[text()='Random Code']")
	WebElement RandomCode;
	
	@FindBy(xpath ="//*[text()='Valid For All']")
	WebElement ValidForAll;
	
	@FindBy(xpath ="//*[text()='Is Alphanumeric']")
	WebElement IsAlphanumeric;
	
	@FindBy(xpath ="//*[@id=\"divdynemicmenu\"]/div[3]/main/section/div/div/div[1]/h2")
	WebElement CreateDiscountCoupons;

	@FindBy(xpath = "//*[@id='EndDate']")
	WebElement EndDate;		
	
	@FindBy(xpath ="(//*[text()='Today'])[2]")
	WebElement Today;
	
	@FindBy(xpath = "(//*[text()='OK'])[2]")
	WebElement Startdateokbutton;
	
	
	@FindBy(xpath = "(//*[text()='OK'])[1]")
	WebElement enddateokbutton;
	
	@FindBy(xpath = "(//*[text()='31'])[1]")
	WebElement end31date;
	
	public GopadelCreatecouppage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void breadcrumb() {
		Assert.assertEquals(true, breadcrumb.isDisplayed());
		System.out.println(" breadcrumb is displayed with " + breadcrumb.getText());
		System.out.println("===========================================================");
	}

	public void Title() {
		Assert.assertEquals(true, Title.isDisplayed());
		System.out.println("Title Field is displayed");
		System.out.println("===========================================================");
		Scanner enterTitle = new Scanner(System.in);
		System.out.println("Enter the Title : ");
		Titles = enterTitle.nextLine();
		Title.sendKeys(Titles);
	}
	
	public void DiscountType() {
		Assert.assertEquals(true, DiscountType.isDisplayed());
		System.out.println("DiscountType Field is displayed");
		System.out.println("===========================================================");
		Scanner enterDiscountType = new Scanner(System.in);
		System.out.println("Enter the DiscountType : ");
		DiscountTypes = enterDiscountType.nextLine();
		DiscountType.sendKeys(DiscountTypes);
	}
	
	public void Description() {
		Assert.assertEquals(true, Description.isDisplayed());
		System.out.println(" Description Field is displayed");
		System.out.println("===========================================================");
		Scanner enterDescription = new Scanner(System.in);
		System.out.println("Enter the  Description : ");
		Descriptions =enterDescription.nextLine();
		 Description.sendKeys(Descriptions);
	}
	
	public void Amount() {
		Assert.assertEquals(true, Amount.isDisplayed());
		System.out.println(" Amount Field is displayed");
		System.out.println("===========================================================");
		Scanner enterAmounts = new Scanner(System.in);
		System.out.println("Enter the Amount : ");
		Amounts =enterAmounts.nextLine();
		Amount.sendKeys(Amounts);
	}


	
	public void NoLimit() {
		Assert.assertEquals(true, NoLimit.isDisplayed());
		System.out.println("NoLimit Field is displayed");
		System.out.println("===========================================================");
}
	
	public void PerPersonLimit() {
		Assert.assertEquals(true, PerPersonLimit.isDisplayed());
		System.out.println("PerPersonLimit Field is displayed");
		System.out.println("===========================================================");
}
	public void IsAlphanumeric() {
		Assert.assertEquals(true, IsAlphanumeric.isDisplayed());
		System.out.println("IsAlphanumericis displayed");
		System.out.println("===========================================================");
}
	public void RandomCode()
	{
		Assert.assertEquals(true, RandomCode.isDisplayed());
		System.out.println("RandomCode displayed");
		System.out.println("===========================================================");
	
	}
	public void DailyNoLimit() {
		Assert.assertEquals(true, DailyNoLimit.isDisplayed());
		System.out.println("DailyNoLimit displayed");
		System.out.println("===========================================================");
	}
	
	public void ValidForAll() {
		Assert.assertEquals(true, ValidForAll.isDisplayed());
		System.out.println("ValidForAll displayed");
		System.out.println("===========================================================");
	}
	
	
	public void startdate()
	{
		Assert.assertEquals(true, StartDate.isDisplayed());
		System.out.println("StartDate displayed");
		System.out.println("===========================================================");
		StartDate.click();
		Today.click();
		Startdateokbutton.click();
	
}
	public void EndDate()
	{
		Assert.assertEquals(true, EndDate.isDisplayed());
		System.out.println("EndDate displayed");
		System.out.println("===========================================================");
		EndDate.click();
		end31date.click();
		enddateokbutton.click();
	
}
	
	
	
	
	
	
	
	
	
	
}
