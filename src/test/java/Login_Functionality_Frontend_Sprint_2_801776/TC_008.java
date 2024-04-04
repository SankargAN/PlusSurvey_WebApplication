package Login_Functionality_Frontend_Sprint_2_801776;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class TC_008 extends BaseClass{
	/** Verify that the user is not able to login to the Puls Survey portal
	 *  when they enter an empty (null) username in the username field and an empty (null) password in the password field. */

	@Test(priority = 1)
	public static void Login_with_null_credentials() {

		extentInfo("Enter null username");

		extentInfo("Enter null password");

		extentInfo("Click on login button");

		element_click_intercepted_exception(login_Pom.login_Button);
		implicit_wait(5);
		extentInfo("validate the validation in username and password fields");
		String Validation_username= getText(login_Pom.validation_on_username);
		softassert.assertEquals(Validation_username, loginPage_Pro.Username_required());
		String Validation_password= getText(login_Pom.validation_on_password);
		softassert.assertEquals(Validation_password, loginPage_Pro.Password_required());
	}
}