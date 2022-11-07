package com.app.pageexe;

import com.app.base.BaseClassCucumber;
import com.app.pagelocators.LoginPageLocator;

public class LoginPageExe1 extends LoginPageLocator {
	
	public static void username(String user) {
		BaseClassCucumber.sendKeys(BaseClassCucumber.findByName(LoginPageLocator.username), user);
	}
	public static void password(String pass) {
		BaseClassCucumber.sendKeys(BaseClassCucumber.findByName(LoginPageLocator.password), pass);
	}
	public static void loginbutton() {
		BaseClassCucumber.click(BaseClassCucumber.findByName(LoginPageLocator.login));
	}
	

}
