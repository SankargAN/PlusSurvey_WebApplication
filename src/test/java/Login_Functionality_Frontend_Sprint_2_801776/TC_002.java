package Login_Functionality_Frontend_Sprint_2_801776;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class TC_002 extends BaseClass{
	
	@Test
	public static void fields() {
		extentInfo("verifying the fields like username, password, login button and forgotbutton");
		boolean username_field=isEnabled(login_Pom.username);
		boolean password_field=isEnabled(login_Pom.password);
		boolean login_button=isEnabled(login_Pom.login_Button);
		boolean forgotpassword=isDisplayed(login_Pom.forgot_password);
		softassert.assertTrue(username_field);
		softassert.assertTrue(password_field);
		softassert.assertTrue(login_button);
		softassert.assertTrue(forgotpassword);
	}

}
