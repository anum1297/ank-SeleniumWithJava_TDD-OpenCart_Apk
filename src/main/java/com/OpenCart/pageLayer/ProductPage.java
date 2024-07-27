package com.OpenCart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	private WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//------------------Object Repository-----------------
	@FindBy(xpath="//a[contains(text(),'MacBook Pro')]")
	private WebElement Product_link;
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement AddToCart_btn;

	//--------------------Action Method-------------------
	
	public void ClickOnProduct() {
		Product_link.click();
	}
	public void ClickOnAddToCart() {
		AddToCart_btn.click();
	}

}
