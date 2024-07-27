package com.OpenCart.testLayer;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OpenCart.pageLayer.CheckOutPage;
import com.OpenCart.pageLayer.HomePage;
import com.OpenCart.pageLayer.LoginPage;
import com.OpenCart.pageLayer.ProductPage;
import com.OpenCart.pageLayer.ShoppingCartPage;
import com.OpenCart.testBase.TestBase;

public class BuyTestPage extends TestBase{
	
	@Test
	public void VerifyBuyFunctionality() throws InterruptedException {
		
		Logger log = Logger.getLogger("Opencart Framework");
		
		String Expect_Result = "Your order has been placed!";
		
		//-------------------Home Page -------------------------------
		HomePage home_page = new HomePage(driver);
		home_page.EnterProductNameInSearchBox("MacBook");
		
		//---------------Add To Cart page-----------------------------
		
		ProductPage product_obj = new ProductPage(driver);
		product_obj.ClickOnProduct();
		product_obj.ClickOnAddToCart();
		Thread.sleep(2000);
		log.info("Added to Cart");
		
		//---------------Check Out Page------------------------------
		
		ShoppingCartPage shop_object = new ShoppingCartPage(driver);
		shop_object.ClickOnShoppingCartLink();
		shop_object.ClickOnCheckOutBtn();
		Thread.sleep(2000);
		log.info("Added to Cart");

		//----------------CheckOut- Step:1.Login-----------------------
		LoginPage login_page =new LoginPage(driver);
		login_page.EnterEmailId("Devidp123@gmail.com");
		login_page.EnterPassword("Devid@123");
		login_page.ClickOnLogIn2();
		Thread.sleep(1000);
		log.info("Logged in");

		//-----------------CheckOut -------------------------------
		CheckOutPage CO_Object = new CheckOutPage(driver);
		CO_Object.EnterBillingDetails();	
		CO_Object.ClickOnDeliveryDetails();	
		CO_Object.ClickOnDeliveryMethod();	
		CO_Object.ClickOnPaymentMethod();
		CO_Object.ClickOnConfirmOrder();
		
		String Actual_Result = CO_Object.GetSuccessMsg();
		Assert.assertEquals(Actual_Result, Expect_Result);
		log.info("Order Placed");

	}

}
