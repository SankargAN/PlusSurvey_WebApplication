package Login_Functionality_Frontend_Sprint_2_801776;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class TC_013 extends BaseClass{
	/** Verify that the user can see the password field title text color and size as per designs */
	@Test(priority = 1)
	public static void password_text_colour() {
		extentInfo("Validating the password text color");
		String password_colour= getCssValue(login_Pom.password, loginPage_Pro.Css_color());
		softassert.assertEquals(password_colour, loginPage_Pro.Passsword_text_colour());
	}
	@Test(priority = 2)
	public static void password_text_font_size() {
		extentInfo("Validating the password text font size");
		String password_font_size= getCssValue(login_Pom.password, loginPage_Pro.Css_font_size());
		softassert.assertEquals(password_font_size, loginPage_Pro.Passsword_font_size());
	}
}
