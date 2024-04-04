package Login_Functionality_Frontend_Sprint_2_801776;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class TC_003 extends BaseClass{


@Test
	public static void fields() {
	extentInfo("verifying the welcome message like Welcome to PULS");
	boolean welcome_text=isDisplayed(login_Pom.welcome_to_PULS);
	softassert.assertTrue(welcome_text);
	}
}