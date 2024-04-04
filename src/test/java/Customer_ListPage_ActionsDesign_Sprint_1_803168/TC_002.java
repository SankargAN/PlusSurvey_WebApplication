package Customer_ListPage_ActionsDesign_Sprint_1_803168;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class TC_002 extends BaseClass{

	/** Verify that the user can see the action button colour , size as per designs  */
	@Test(priority = 1)
	public static void action_button_colour_size() {
		extentInfo("Verify the actionbutton colour");
		String actionButton_Colour=getCssValue(customer_Pom.Action_Button, customerPage_Pro.CSS_Action_button_Key_Colour());
		softassert.assertEquals(actionButton_Colour, customerPage_Pro.Action_button_colour());
		extentInfo("Verify the action button font Size");
		String actionButton_Size=getCssValue(customer_Pom.Action_Button, customerPage_Pro.CSS_Action_button_key_size());
		softassert.assertEquals(actionButton_Size, customerPage_Pro.Action_button_size());
	}
}