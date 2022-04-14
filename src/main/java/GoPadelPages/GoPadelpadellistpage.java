package GoPadelPages;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GoPadelpadellistpage {
	WebDriver driver;

	@FindBy(xpath = "(//*[text()='Padel Branch'])[1]")
	WebElement title;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/div/div/div/ul/li[1]/a/i")
	WebElement homebutton;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/div/div/div/ul/li[2]/a")
	WebElement padellist;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/div/div/a")
	WebElement AddPadelclubes;

	@FindBy(xpath = "//*[@id=\"DataTables_Table_0_filter\"]/label/input")
	WebElement searchBar;

	@FindBy(xpath = "//*[@id=\"DataTables_Table_0_previous\"]")
	WebElement previousButton;

	@FindBy(xpath = "//*[@id=\"DataTables_Table_0_next\"]")
	WebElement nextButton;
	
	@FindBy(xpath ="//*[@id=\"DataTables_Table_0_wrapper\"]/div[1]/a")
	WebElement ExcelButton;
	
	@FindBy(xpath ="//*[@id=\"DataTables_Table_0\"]")
	WebElement showEntriesTable;
	
public GoPadelpadellistpage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void displayhomebutton() {
	Assert.assertEquals(true, homebutton.isDisplayed());
	System.out.println("Search Bar is displayed");
}

public void displaySearchBar() {
	Assert.assertEquals(true, searchBar.isDisplayed());
	System.out.println("Search Bar is displayed");
}

public void displayAddPadelclubes() {
	Assert.assertEquals(true, AddPadelclubes.isDisplayed());
	System.out.println("AddPadelclubes is displayed");
}

public void displayNextButton() {
	Assert.assertEquals(true, nextButton.isDisplayed());
	System.out.println("Next Button is displayed");
}

public void displayPreviousButton() {
	Assert.assertEquals(true, previousButton.isDisplayed());
	System.out.println("Previous Button is displayed");
}

public void displayExcelButton() {
	Assert.assertEquals(true, ExcelButton.isDisplayed());
	System.out.println("Previous Button is displayed");
}

public void searchBarFunctionality() {
	Scanner search = new Scanner(System.in);
	System.out.println("Enter the keyword to search : ");
	String keyword = search.nextLine();
	searchBar.sendKeys(keyword);
	System.out.println(showEntriesTable.getText());

}





}