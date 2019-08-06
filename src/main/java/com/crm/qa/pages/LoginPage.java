package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory = OR
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	//Initializing the Page Objects
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
		//Actions
			
	}
   public String ValidateLoginPageTitle() {
	   return driver.getTitle();
	   
   }
   public boolean ValidateCRMImage() {
	   return crmLogo.isDisplayed();
	   
   }
   public HomePage login(String un, String pwd) {
	   username.sendKeys(un);
	   password.sendKeys(pwd);
	   
	   WebElement loginbutn = driver.findElement(By.xpath("//input[@type='submit']"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();" ,loginbutn);
	   
	   return new HomePage();
   }
}
