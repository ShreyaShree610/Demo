package com.abc.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.abc.Selenium.Login;
import com.abc.Selenium.Main;
import com.abc.Selenium.Welcome;

public class MagentoTest {

	public static void main(String[] args) {
		String url ="https://www.magento.com";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		Welcome w=new Welcome(driver);
		w.clickOnMyAccount();
		Login l = new Login(driver);
		l.enterEmail();
		l.enterpassword();
		l.clickOnLogin();
		Main m = new Main(driver);
		m.clickOnLogout();
		driver.close();
		
		
		
		
		
		
		

	}

}
