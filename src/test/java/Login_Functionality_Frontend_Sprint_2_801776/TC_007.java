package Login_Functionality_Frontend_Sprint_2_801776;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class TC_007 extends BaseClass{


	/** Verify that the user is not able to login to the Puls Survey portal when they enter an invalid username in the username field and an invalid password in the password field.*/

	@Test(priority = 1)
	public static void Login_with_invalid_credentials() {

		extentInfo("Enter invalid Username");
		sendData(login_Pom.username, loginPage_Pro.invalid_password());
		extentInfo("Enter invalid Password");
		sendData(login_Pom.password, loginPage_Pro.invalid_password());
		extentInfo("Click on login button");
		element_click_intercepted_exception(login_Pom.login_Button);
		implicit_wait(5);
		extentInfo("validate the validation Username must be valid on the username field");
		String Validation_username= getText(login_Pom.validation_on_username);
		softassert.assertEquals(Validation_username, loginPage_Pro.username_must_valid());

	}
}
