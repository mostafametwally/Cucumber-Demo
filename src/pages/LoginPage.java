package com.pom.pages;

import com.pom.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends TestBase {
	
    /*
     * All WebElements are identified by @FindBy annotation
     */
	@FindBy(xpath="//input[@type=\"email\"]")
	WebElement email;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//input[@class=\"button-1 login-button\"]")   
	WebElement LoginButton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean ValidateLoginButton() {
		return LoginButton.isDisplayed();
	}
	
	public HomePage Login(String userName,String passWord) {
		email.sendKeys(userName);
		password.sendKeys(passWord);
		LoginButton.click();
		return new HomePage();
	}
}
