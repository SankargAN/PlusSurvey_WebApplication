package Login_Functionality_Frontend_Sprint_2_801776;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class TC_009 extends BaseClass{
	/** Verify that the user can see the password when user click on eye icon button in login page*/

	@Test(priority = 1)
	public static void eye_icon_functionality() {
		extentInfo("Enter password in the password field");
		sendData(login_Pom.password, loginPage_Pro.valid_password());
		extentInfo("Click on eye icon button");
		element_click_intercepted_exception(login_Pom.eye_icon_button);
		implicit_wait(5);
	}
}