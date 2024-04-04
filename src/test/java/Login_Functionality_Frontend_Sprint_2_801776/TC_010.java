package Login_Functionality_Frontend_Sprint_2_801776;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class TC_010 extends BaseClass{
	/** Verify the forgot password link in the login page */

	@Test(priority = 1)
	public static void forgot_password() {
		extentInfo("Verify the forgot password link");
		boolean fotgot_link= isDisplayed(login_Pom.forgot_password);
		softassert.assertTrue(fotgot_link);
	}
}