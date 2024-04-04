package Login_Functionality_Frontend_Sprint_2_801776;

import org.testng.annotations.Test;
import Utilities.BaseClass;

public class TC_001 extends BaseClass{
	
	@Test
	public static void open_URL() {
		extentInfo("Open Broswer");
		extentInfo("Enter Url");
		driver.get(loginPage_Pro.URL());
		boolean welcomepuls_text= isEnabled(login_Pom.welcome_to_PULS);
		softassert.assertTrue(welcomepuls_text);
		
	}
	
	

}
