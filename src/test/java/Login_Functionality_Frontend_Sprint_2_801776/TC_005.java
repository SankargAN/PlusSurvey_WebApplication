package Login_Functionality_Frontend_Sprint_2_801776;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class TC_005 extends BaseClass{

	/** Verify that the user can see the text field titles, like username and password, when they open the login page. */

	@Test(priority = 1)
	public static void validate_username_title() {

		extentInfo("Validate the username title");
		String username = getText(login_Pom.Username_title);
		softassert.assertEquals(username, loginPage_Pro.Username_text());
	}
	@Test(priority = 2)
	public static void validate_password_title() {
		extentInfo("Validate the password title");
		String password_title = getText(login_Pom.password_title);
		softassert.assertEquals(password_title, loginPage_Pro.Psssword_text());

	}}