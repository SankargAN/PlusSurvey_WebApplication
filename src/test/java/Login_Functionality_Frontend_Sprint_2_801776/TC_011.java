package Login_Functionality_Frontend_Sprint_2_801776;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class TC_011 extends BaseClass{

	/**Verify that the user can see the forgot password link text color and size as per designs */
	@Test(priority = 1)
	public static void forgot_password_link_text_colour() {
		implicit_wait(5);
		extentInfo("Validating the forgot password link text color");
		String text_colour= getCssValue(login_Pom.forgot_password, loginPage_Pro.Css_color());
		softassert.assertEquals(text_colour, loginPage_Pro.Forgot_password_text_colour());
		implicit_wait(5);
	}
	@Test(priority = 2)
	public static void forgot_password_link_text_font_size() {
		implicit_wait(5);
		extentInfo("Validating the forgot password link text font size");
		String text_font_size= getCssValue(login_Pom.forgot_password, loginPage_Pro.Css_font_size());
		softassert.assertEquals(text_font_size, loginPage_Pro.Forgot_password_font_size());
	
	}
}