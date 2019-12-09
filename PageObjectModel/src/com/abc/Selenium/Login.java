package com.abc.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="pass")
	WebElement pass;
	@FindBy(id="send2")
	WebElement login;
	
		
		public Login(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public void enterEmail()
		{
			email.sendKeys("priyankavijaykumar555@gmail.com");
		}
		public void enterpassword()
		{
			pass.sendKeys("Welcome123");
		}
		public void clickOnLogin()
		{
			login.click();
		}
		

}
