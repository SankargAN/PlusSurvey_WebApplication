package Login_Functionality_Frontend_Sprint_2_801776;

import org.testng.annotations.Test;
import Utilities.BaseClass;

public class TC_004 extends BaseClass{
	
	/**Verify that the user can see the placeholder in the text fields, like "Enter Username in the username field and Enter Password in the password field." */
	
	
	@Test(priority = 1)
	public static void validate_username_placeholder() {
		
		extentInfo("Validate the placeholder text in the username field");
		String usedrname_placeholder= getAttributes(login_Pom.username);
		softassert.assertEquals(usedrname_placeholder, loginPage_Pro.username_field_placeholder());
		
	}
	@Test(priority = 2)
	public static void validate_password_placeholder() {
		extentInfo("Validate the placeholder text in the password field");
		String password_placeholder= getAttributes(login_Pom.username);
		softassert.assertEquals(password_placeholder, loginPage_Pro.Psssword_field_placeholder());
	}
}
