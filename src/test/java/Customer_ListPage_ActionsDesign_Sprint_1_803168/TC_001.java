package Customer_ListPage_ActionsDesign_Sprint_1_803168;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class TC_001 extends BaseClass{

	/** Verify that the user can see the action button in the customers table when user click on the customers tab at left side menu tab */


	@Test(priority = 1)
	public static void login() {
		extentInfo("Open Broswer");
		extentInfo("Enter Url");
		driver.get(loginPage_Pro.URL());
		extentInfo("Enter Valid Username");
		sendData(login_Pom.username, loginPage_Pro.valid_username());
		extentInfo("Enter Valid Password");
		sendData(login_Pom.password, loginPage_Pro.valid_password());
		extentInfo("Click on login button");
		element_click_intercepted_exception(login_Pom.login_Button);
	}
	@Test(priority = 2)
	public static void customer_Page() {
		extentInfo("Click on Customers at the left side menu");
		element_click_intercepted_exception(customer_Pom.customers_tab);
		boolean customer_Title = isDisplayed(customer_Pom.Customer_page_title);
		softassert.assertTrue(customer_Title);		
	}
	@Test(priority = 3)
	public static void action_Button() throws Exception {
		extentInfo("Serach customer");
		sendData(customer_Pom.serach, customerPage_Pro.Customer_Email());
		Thread.sleep(4000);
		extentInfo("Verify the Action Button");
		boolean Actionbutton = isDisplayed(customer_Pom.Action_Button);
		softassert.assertTrue(Actionbutton);
	}
}