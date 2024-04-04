package Login_Functionality_Frontend_Sprint_2_801776;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class TC_006 extends BaseClass{

	/** Verify that the user can login to the puls survey when they enter valid credentials in the username and password fields. 
	 * @throws Exception */

	@Test(priority = 1)
	public static void Login_with_valid_credentials() throws Exception {

		extentInfo("Enter Valid Username");
		sendData(login_Pom.username, loginPage_Pro.valid_username());
		extentInfo("Enter Valid Password");
		sendData(login_Pom.password, loginPage_Pro.valid_password());
		extentInfo("Click on login button");
		element_click_intercepted_exception(login_Pom.login_Button);
		Thread.sleep(4000);
		
		
	}
}