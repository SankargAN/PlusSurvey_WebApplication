package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Customers {
	
	@FindBy(xpath = "/html/body/app-root/app-layout/app-vertical/div/app-sidebar/div/ngx-simplebar/div[1]/div[2]/div/div/div/div/div/ul/li[3]/a")public WebElement customers_tab;
	@FindBy(xpath = "")public WebElement add_customer_button;
	@FindBy(xpath = "/html/body/app-root/app-layout/app-vertical/div/div/div/app-customer-list/div/div[2]/div/div/div/div[2]/div[2]/div/label/input")public WebElement serach;
	
	
	//Add Customer
	@FindBy(xpath = "")public WebElement Add_customer_title;
	//Add Customer-Organization Details
	@FindBy(xpath = "")public WebElement Organization_title;
	@FindBy(xpath = "")public WebElement Organization_textfield;
	@FindBy(xpath = "")public WebElement Address_title;


	//Action Button
	@FindBy(xpath = "/html/body/app-root/app-layout/app-vertical/div/div/div/app-customer-list/div/div[2]/div/div/div/div[3]/div/div/table/tbody/tr[1]/td[8]/div/button")public WebElement Action_Button;
	@FindBy(xpath = "/html/body/app-root/app-layout/app-vertical/div/div/div/app-customer-list/div/div[2]/div/div/div/div[3]/div/div/table/tbody/tr[1]/td[8]/div/div/a[1]")public WebElement Action_Edit_Customer;
	@FindBy(xpath = "/html/body/app-root/app-layout/app-vertical/div/div/div/app-customer-list/div/div[2]/div/div/div/div[3]/div/div/table/tbody/tr[1]/td[8]/div/div/a[2]")public WebElement Action_Basic_info;
	@FindBy(xpath = "/html/body/app-root/app-layout/app-vertical/div/div/div/app-customer-list/div/div[2]/div/div/div/div[3]/div/div/table/tbody/tr[1]/td[8]/div/div/a[3]")public WebElement Action_Stores;
	@FindBy(xpath = "/html/body/app-root/app-layout/app-vertical/div/div/div/app-customer-list/div/div[2]/div/div/div/div[3]/div/div/table/tbody/tr[1]/td[8]/div/div/a[4]")public WebElement Action_Study_types;
	@FindBy(xpath = "/html/body/app-root/app-layout/app-vertical/div/div/div/app-customer-list/div/div[2]/div/div/div/div[3]/div/div/table/tbody/tr[1]/td[8]/div/div/a[5]")public WebElement Action_Surveys;
	@FindBy(xpath = "/html/body/app-root/app-layout/app-vertical/div/div/div/app-customer-list/div/div[2]/div/div/div/div[3]/div/div/table/tbody/tr[1]/td[8]/div/div/a[6]")public WebElement Action_Deactivate;
	@FindBy(xpath = "/html/body/app-root/app-layout/app-vertical/div/div/div/app-customer-list/div/div[1]/div/div/h4")public WebElement Customer_page_title;

}
