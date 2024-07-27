package com.OpenCart.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	private WebDriver driver;
	public ShoppingCartPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	//-------------------Object Repository-----------------
	
	private By Shopping_Cart_link = By.xpath("//span[contains(text(),'Shopping Cart')]");
	
	private By CheckOut_btn = By.xpath("//a[contains(text(),'Checkout')]");
	
	//---------------------Action Method-------------------
	public void ClickOnShoppingCartLink() {
		driver.findElement(Shopping_Cart_link).click();		
	}
	public void ClickOnCheckOutBtn() {
		driver.findElement(CheckOut_btn).click();		
	}


}
