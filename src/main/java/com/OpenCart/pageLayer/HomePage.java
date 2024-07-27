package com.OpenCart.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	//-----------------------Object Repository-------------------
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	private WebElement my_account_link;
	
	private By Registor_link = By.xpath("//a[contains(text(),'Register')]");
	
	private By Login_link = By.xpath("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");
	
	@FindBy(xpath="//header/div[1]/div[1]/div[2]/div[1]/input[1]")
	private WebElement Search_txt_box;
	
	//---------------------------Action Method-----------------
	
	public void ClickOnMyAccountLink() {
		my_account_link.click();
	}
	public void ClickOnRegistorLink() {
		
		driver.findElement(Registor_link).click();
	}
    public void ClickOnLoginLink() {
		
		driver.findElement(Login_link).click();
	}
	public void EnterProductNameInSearchBox(String product_name) {
		Search_txt_box.sendKeys(product_name+ Keys.ENTER);
	}


}
