package com.OpenCart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OpenCart.pageLayer.HomePage;
import com.OpenCart.pageLayer.LoginPage;
import com.OpenCart.testBase.TestBase;
import com.OpenCart.utilities.UtilClass;
public class LoginTestPage extends TestBase{
	
	@Test
	public void VerifyLoginFunctionality() {
		
		String Expected_Result = "My Account";
		
		//------------Home Page --------------
		
		HomePage home_page =new HomePage(driver);
		home_page.ClickOnMyAccountLink();
		home_page.ClickOnLoginLink();
		
		UtilClass util_cla =new UtilClass();
		
		//--------------LoginPage---------------
		LoginPage login_page =new LoginPage(driver);
		login_page.EnterEmailId("Devidp123@gmail.com");
		login_page.EnterPassword("Devid@123");
		login_page.ClickOnLogIn();
		
		String Actual_Result = util_cla.getPageTitle();
		Assert.assertEquals(Actual_Result, Expected_Result);
	}
	
}
