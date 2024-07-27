package com.OpenCart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistorPage {
	
private WebDriver driver;
	
	public RegistorPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	//-----------------Object Repository----------
	
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement FirstName_txt_box;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement LastName_txt_box;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement Email_txt_box;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement Telephone_txt_box;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement Password_txt_box;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	private WebElement PasswordConfirm_txt_box;
	
	@FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement Policy_Check_box;
	
	@FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
	private WebElement Continue_bottun;
	
	@FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
	private WebElement Success_txt;	
	
	//---------------Action Method -------------
	
	public void EnterFirstName(String firstname) {
		FirstName_txt_box.sendKeys(firstname);
	}
	
	public void EnterLastName(String lastname) {
		LastName_txt_box.sendKeys(lastname);
	}
	public void EnterEmail(String email) {
		Email_txt_box.sendKeys(email);
	}
	public void EnterTelephone(String Tele) {
		Telephone_txt_box.sendKeys(Tele);
	}
	
	public void EnterPassword(String Pass) {
		PasswordConfirm_txt_box.sendKeys(Pass);
	}
	public void EnterPasswordConfirm(String PassCon) {
		Password_txt_box.sendKeys(PassCon);
	}
	public void CheckPolicyBox() {
		Policy_Check_box.click();
	}
	public void ClickOnContinueBtn() {
		Continue_bottun.click();
	}
	public String GetSuccessTxt() {
		String text = Success_txt.getText();
		return text;
	}


}
