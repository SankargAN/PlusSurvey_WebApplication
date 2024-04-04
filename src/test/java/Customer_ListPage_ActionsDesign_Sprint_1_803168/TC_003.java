package Customer_ListPage_ActionsDesign_Sprint_1_803168;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class TC_003 extends BaseClass{
	/** Verify that the user can see the action drop down list like "Edit Customer , Basic Info, Stores, Sub Types, Surveys, Deactivate" as per designs  
	 * @throws Exception */
	@Test(priority = 1)
	public static void customer_Actions_List() throws Exception {
		extentInfo("Click on Action button");
		element_click_intercepted_exception(customer_Pom.Action_Button);
		Thread.sleep(2000);
		extentInfo("Validating the customer actions list");
		String editCustomer = getText(customer_Pom.Action_Edit_Customer);
		Thread.sleep(2000);
		String basicInfo = getText(customer_Pom.Action_Basic_info);
		Thread.sleep(2000);
		String Stories = getText(customer_Pom.Action_Stores);
		System.out.println(Stories);
		Thread.sleep(2000);
		String study_Types = getText(customer_Pom.Action_Study_types);
		Thread.sleep(2000);
		String surveys = getText(customer_Pom.Action_Surveys);
		Thread.sleep(2000);
		String deActivate = getText(customer_Pom.Action_Deactivate);
		Thread.sleep(2000);

		softassert.assertEquals(editCustomer, customerPage_Pro.Action_Dropdown_list_Edit_Customer());
		Thread.sleep(2000);
		softassert.assertEquals(basicInfo, customerPage_Pro.Action_Dropdown_list_Basic_Info());
		Thread.sleep(2000);
		softassert.assertEquals(Stories, customerPage_Pro.Action_Dropdown_list_Stores());
		Thread.sleep(2000);
		System.out.println(customerPage_Pro.Action_Dropdown_list_Stores());
		softassert.assertEquals(study_Types, customerPage_Pro.Action_Dropdown_list_Study_Types());
		Thread.sleep(2000);
		softassert.assertEquals(surveys, customerPage_Pro.Action_Dropdown_list_Surveys());
		Thread.sleep(2000);
		softassert.assertEquals(deActivate, customerPage_Pro.Action_Dropdown_list_Deactivate());
		Thread.sleep(2000);
		
		softassert.assertAll();

	}
}