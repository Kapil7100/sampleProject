package com.tp.crm.loginModule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
@FindBy(name="user_name")
private WebElement username;
@FindBy(name="user_password")
private WebElement password;
@FindBy(id="submitButton")
private WebElement loginButton;
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLoginButton() {
	return loginButton;
}
}
