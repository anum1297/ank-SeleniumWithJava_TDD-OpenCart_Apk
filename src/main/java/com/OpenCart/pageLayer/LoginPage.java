package com.OpenCart.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
private WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;	
	}
	
	//-------------Object Repository--------------
	private By EmailId = By.xpath("//input[@id='input-email']");
	private By Password = By.xpath("//input[@id='input-password']");
	private By LoginBtn = By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");
	private By LoginBtn2 = By.xpath("//input[@id='button-login']");
	
	//---------------Action Method ----------
	public void EnterEmailId(String email) {
		driver.findElement(EmailId).sendKeys(email);;
	}
	public void EnterPassword(String pass) {
		driver.findElement(Password).sendKeys(pass);;	
	}
	public void ClickOnLogIn() {
		driver.findElement(LoginBtn).click();
	}
	public void ClickOnLogIn2() {
		driver.findElement(LoginBtn2).click();
	}

}
