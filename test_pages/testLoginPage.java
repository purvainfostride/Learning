package test_pages;

import org.testng.annotations.Test;

import utility.Base;

public class testLoginPage extends Base {
	
	public testLoginPage() {
		super();
	}

@Test
	public void clickingLogin() {
		obj.getLoginPage().clickLogin();
	}
	public void clickloginbtn() {
		obj.getLoginPage().loggingin();
}
}
