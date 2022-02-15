package pagefactory;

import pages.Launch;
import pages.LoginPage;
import pages.SignupPage;
import utility.Base;


public class ObjectFactory {
	private Base BaseObj;
	private Launch LaunchObj;
	private SignupPage SignupPageObj;
	private LoginPage LoginPageObj;
	
	public Base getBase() {
		if(BaseObj==null) {
			BaseObj= new Base();
		}
		return BaseObj;
	}
	public Launch getLaunch() {
		if(LaunchObj==null) {
			LaunchObj= new Launch();
		}
		return LaunchObj;
	}
	public SignupPage getSignupPage() {
		if(SignupPageObj==null) {
			SignupPageObj= new SignupPage();
		}
		return SignupPageObj;
	}
	public LoginPage getLoginPage() {
		if(LoginPageObj==null) {
			LoginPageObj= new LoginPage();
		}
		return LoginPageObj;
	}
	
}
