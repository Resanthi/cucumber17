package com.app.pageexe;

import com.app.base.BaseClassCucumber;
import com.app.pagelocators.LoginPageLocator;

public class LoginPageExe extends LoginPageLocator {
	
	public static void username() {
		BaseClassCucumber.sendKeys(BaseClassCucumber.findByName(LoginPageLocator.username), BaseClassCucumber.propertiesFileReuse("Username"));
	}
	public static void password() {
		BaseClassCucumber.sendKeys(BaseClassCucumber.findByName(LoginPageLocator.password), BaseClassCucumber.propertiesFileReuse("Password"));
	}
	public static void loginbutton() {
		BaseClassCucumber.click(BaseClassCucumber.findByName(LoginPageLocator.login));
	}
	

}
