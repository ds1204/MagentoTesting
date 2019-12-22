package com.abc.MagentoMain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.MagentoObjects.Home;
import com.abc.MagentoObjects.Login;
import com.abc.MagentoObjects.Welcome;

public class MagentoTest
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.com");
		Welcome w=new Welcome(driver);
		w.clickOnMyAccount();
		Login l=new Login(driver);
		l.typeEmail("durgamini1997@gmail.com");
		l.typePassword("Magento123$");
		l.clickOnLogin();
		Home h=new Home(driver);
		h.clickOnLogout();
		
	}

}
