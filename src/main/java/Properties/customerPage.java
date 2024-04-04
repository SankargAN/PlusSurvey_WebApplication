package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class customerPage {
	public static Properties Login_pro;

	public customerPage () {
		File file = new File(System.getProperty("user.dir")+"/TestData/Customers");
		try {
			Login_pro = new Properties();
			FileInputStream input = new FileInputStream(file);
			Login_pro.load(input);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String Customer_Email() {
		String Customer_Email = Login_pro.getProperty("Customer_Email");
		return Customer_Email;
	} 
	public String Action_button_size() {
		String Action_button_size = Login_pro.getProperty("Action_button_size");
		return Action_button_size;
	}
	public String Action_button_colour() {
		String Action_button_colour = Login_pro.getProperty("Action_button_colour");
		return Action_button_colour;
	}
	public String CSS_Action_button_key_size() {
		String CSS_Action_button_key_size = Login_pro.getProperty("CSS_Action_button_key_size");
		return CSS_Action_button_key_size;
	}
	public String CSS_Action_button_Key_Colour() {
		String CSS_Action_button_Key_Colour = Login_pro.getProperty("CSS_Action_button_Key_Colour");
		return CSS_Action_button_Key_Colour;
	}
	public String Action_Dropdown_list_Edit_Customer() {
		String Action_Dropdown_list_Edit_Customer = Login_pro.getProperty("Action_Dropdown_list_Edit_Customer");
		return Action_Dropdown_list_Edit_Customer;
	}
	public String Action_Dropdown_list_Basic_Info() {
		String Action_Dropdown_list_Basic_Info = Login_pro.getProperty("Action_Dropdown_list_Basic_Info");
		return Action_Dropdown_list_Basic_Info;
	}
	public String Action_Dropdown_list_Stores() {
		String Action_Dropdown_list_Stores = Login_pro.getProperty("Action_Dropdown_list_Stores");
		return Action_Dropdown_list_Stores;
	}
	public String Action_Dropdown_list_Study_Types() {
		String Action_Dropdown_list_Study_Types = Login_pro.getProperty("Action_Dropdown_list_Study_Types");
		return Action_Dropdown_list_Study_Types;
	}
	public String Action_Dropdown_list_Surveys() {
		String Action_Dropdown_list_Surveys = Login_pro.getProperty("Action_Dropdown_list_Surveys");
		return Action_Dropdown_list_Surveys;
	}
	public String Action_Dropdown_list_Deactivate() {
		String Action_Dropdown_list_Deactivate = Login_pro.getProperty("Action_Dropdown_list_Deactivate");
		return Action_Dropdown_list_Deactivate;
	}
	
}
