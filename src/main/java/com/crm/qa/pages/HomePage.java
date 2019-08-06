package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase  {
	
	//Page Factory
	
@FindBy(xpath="//td[contains(text(),'User: Araf hossain')]")
WebElement userNameLable;

@FindBy(xpath="//a[contains(text(),'Contacts')]")
WebElement contactsLink;

@FindBy(xpath="//a[contains(text(),'Deals')]")
WebElement dealsLink;

@FindBy(xpath="//a[contains(text(),'Tasks')]")
WebElement tasksLink;

@FindBy(xpath="//a[contains(text(),'Calendar')]")
WebElement calendarLink;

    //initilizing the page object

public HomePage() {
	PageFactory.initElements(driver, this);

  }
public String verifyHomePageTitle() {
	return driver.getTitle();
}

public boolean verifyCorrectUserName() {
	return userNameLable.isDisplayed();
}
public ContactsPage ClickOnContactsLink() {
	contactsLink.click();
	return new ContactsPage();
}
public DealsPage  ClickOnDealsLink() {
	dealsLink.click();
	return new DealsPage();	
}
public TasksPage  ClickOnTasksLink() {
	tasksLink.click();
	return new TasksPage();
}
public CalendarPage ClickOnCalendarLink() {
	calendarLink.click();
	return new CalendarPage();
 }

}