package com.OpenCart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.OpenCart.pageLayer.HomePage;
import com.OpenCart.pageLayer.RegistorPage;
import com.OpenCart.testBase.TestBase;

public class RegistorTestPage extends TestBase{
	
	@Test
	public void VerifyRegistorFunctionality() {
		
		String Expected_Result = "Your Account Has Been Created!";
		//------------------Home Page----------------
		HomePage home_object = new HomePage(driver);
		home_object.ClickOnMyAccountLink();
		home_object.ClickOnRegistorLink();
		
		//-----------------Register Page-----------------
		
		RegistorPage regis_page =new RegistorPage(driver);
		regis_page.EnterFirstName("Devid");
		regis_page.EnterLastName("Parker");
		regis_page.EnterEmail("Devidp678@gmail.com");
		regis_page.EnterTelephone("07896023946");
		regis_page.EnterPassword("Devid@678");
		regis_page.EnterPasswordConfirm("Devid@678");
		regis_page.CheckPolicyBox();
		regis_page.ClickOnContinueBtn();
		
		String Actual_Result = regis_page.GetSuccessTxt();
		Assert.assertEquals(Actual_Result, Expected_Result);		
	}

}
