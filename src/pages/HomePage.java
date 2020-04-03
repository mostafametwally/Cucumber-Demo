package com.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.base.TestBase;

public class HomePage extends TestBase {
	
	// Dashboard Link
	@FindBy(xpath="//span[text()='Dashboard']")
	public WebElement Dashboard;
	
	//Catalog
	@FindBy(xpath="//span[text()=\"Catalog\"]")
	public WebElement Catalog;
	
	//Sales
	@FindBy(xpath="//span[text()=\"Sales\"]")
	public WebElement Sales;
	
	//Customers
	@FindBy(xpath="//span[text()=\"Customers\"]")
	public WebElement Customers;
	
	public HomePage(){
	PageFactory.initElements(driver, this);
	}
	
	public Boolean  ValidateLink(WebElement webItem) {
		return webItem.isDisplayed();
	}

}
