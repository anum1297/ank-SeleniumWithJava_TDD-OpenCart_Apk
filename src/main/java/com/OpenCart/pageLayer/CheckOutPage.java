package com.OpenCart.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {

	private WebDriver driver;
	public CheckOutPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//------------Object Repository---------------
//	private By FirstName_txtBox = By.xpath("//input[@id='input-payment-firstname']");
//	private By LastName_txtBox = By.xpath("//input[@id='input-payment-lastname']");
//	private By CompName_txtBox = By.xpath("//input[@id='input-payment-company']");
//	private By AddressOne_txtBox = By.xpath("//input[@id='input-payment-address-1']"); 
//	private By AddressTwo_txtBox = By.xpath("//input[@id='input-payment-address-2']");
//	private By City_txtBox = By.xpath("//input[@id='input-payment-city']");
//	private By PostCode_txtBox = By.xpath("//input[@id='input-payment-postcode']");
//	private By Country_dropdown = By.xpath("//select[@id='input-payment-country']");
//	private  By RegionState_dropdown = By.xpath("//select[@id='input-payment-zone']");
	
    private By Continue_btn = By.xpath("//input[@id='button-payment-address']");
		
	private By Delivery_Details_Continue_btn = By.xpath("//input[@id='button-shipping-address']");
	
	private By Delivery_Method_Continue_btn = By.xpath("//input[@id='button-shipping-method']");
	
	private By Payment_Check_box = By.xpath("//input[@name='agree']");
	
	private By Payment_Method_continue_btn = By.xpath("//input[@id='button-payment-method']");
	
	private By Confirm_Order = By.xpath("//input[@id='button-confirm']");
	
	@FindBy(xpath="//h1[contains(text(),'Your order has been placed!')]")
	private WebElement Success_Msg;
	
	
	//By Success_Msg = By.xpath("//h1[contain(text(),'Your Order Has Been Placed']");
	
	//---------------Action Method---------------------------------------------
	
	public void EnterBillingDetails() {
//		driver.findElement(FirstName_txtBox).sendKeys("Devid");
//		driver.findElement(LastName_txtBox).sendKeys("Miller");
//		driver.findElement(CompName_txtBox).sendKeys("Baby Corp");
//		driver.findElement(AddressOne_txtBox).sendKeys("MIDC");
//		driver.findElement(AddressTwo_txtBox).sendKeys("Butibori");
//		driver.findElement(City_txtBox).sendKeys("Nagpur");
//		driver.findElement(PostCode_txtBox).sendKeys("441108");
//		
//		SelectDorpDown(driver.findElement(Country_dropdown),"India");
//		SelectDorpDown(driver.findElement(RegionState_dropdown),"Maharashtra");
		driver.findElement(Continue_btn).click();
		
	}
	
	public static void SelectDorpDown(WebElement WebElement_ref, String text) {
		Select s = new Select(WebElement_ref);
		s.selectByVisibleText(text);
		
	}
	public void ClickOnDeliveryDetails() {
		driver.findElement(Delivery_Details_Continue_btn).click();
	}
	
	public void ClickOnDeliveryMethod() {
		driver.findElement(Delivery_Method_Continue_btn).click();
	}
	
	public void ClickOnPaymentMethod() {
		driver.findElement(Payment_Check_box).click();
		driver.findElement(Payment_Method_continue_btn).click();
	}
	public void ClickOnConfirmOrder() {
		driver.findElement(Confirm_Order).click();
	}
	
	public String GetSuccessMsg() {
		String text = (Success_Msg).getText();
		return text;
	}


}
