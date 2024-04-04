package Login_Functionality_Frontend_Sprint_2_801776;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class TC_012 extends BaseClass{

	/** Verify that the user can see the username field title text color and size as per designs */
	@Test(priority = 1)
	public static void userName_text_colour() {
		extentInfo("Validating the username text color");
		String username_colour= getCssValue(login_Pom.username, loginPage_Pro.Css_color());
		softassert.assertEquals(username_colour, loginPage_Pro.Username_text_colour());
	}
	@Test(priority = 2)
	public static void userName_text_font_size() {
		extentInfo("Validating the username text font size");
		String username_font_size= getCssValue(login_Pom.username, loginPage_Pro.Css_font_size());
		softassert.assertEquals(username_font_size, loginPage_Pro.Username_font_size());
	}
}
