package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactsPage;
	
	public HomePageTest() {
		super();			
	}
	
@BeforeMethod
public void SetUp() {
	initialization();
	contactsPage = new ContactsPage();
	loginpage = new LoginPage();
	homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	
}
@Test(priority=1)
public void verifyHomePageTitleTest() {
	String homePageTitle = homepage.verifyHomePageTitle();
	Assert.assertEquals(homePageTitle, "CRMPRO","Home Page Title Does Not Matched");	
}
@Test(priority=2)
public void verifyUserNameTest() {
	Assert.assertTrue(homepage.verifyCorrectUserName());
	
}
@Test
public void verifyContactsLinkTest() {
	homepage.ClickOnContactsLink();
}

@AfterMethod
public void tearDown() {
	driver.quit();
  }

}
