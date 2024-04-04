package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	@FindBy(xpath ="/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/div/div/h4")public WebElement welcome_to_PULS;
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[3]/form/div[1]/label")public WebElement Username_title;
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[3]/form/div[1]/input")public WebElement username;
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[3]/form/div[2]/label")public WebElement password_title;
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[3]/form/div[2]/div/input")public WebElement password;
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[3]/form/div[2]/div/button")public WebElement eye_icon_button;
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[3]/form/div[3]/button")public WebElement login_Button;
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[3]/form/div[4]/a")public WebElement forgot_password;
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[3]/form/div[1]/div/div")public WebElement validation_on_username;
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[3]/form/div[2]/div/div")public WebElement validation_on_password;

	

}
