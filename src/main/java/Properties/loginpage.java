package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class loginpage {
	public static Properties Login_pro;

	public loginpage () {
		File file = new File(System.getProperty("user.dir")+"/TestData/Login");
		try {
			Login_pro = new Properties();
			FileInputStream input = new FileInputStream(file);
			Login_pro.load(input);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String URL() {
		String URL = Login_pro.getProperty("URL");
		return URL;
	} 
	public String valid_username() {
		String valid_username = Login_pro.getProperty("valid_username");
		return valid_username;
	} 
	public String valid_password() {
		String valid_password = Login_pro.getProperty("valid_password");
		return valid_password;
	} 
	public String login_page_message_text() {
		String login_page_message_text = Login_pro.getProperty("login_page_message_text");
		return login_page_message_text;
	} 
	public String Welcome_to_PULS_colour() {
		String Welcome_to_PULS_colour = Login_pro.getProperty("Welcome_to_PULS_colour");
		return Welcome_to_PULS_colour;
	} 
	public String Welcome_to_PULS_font_size() {
		String Welcome_to_PULS_font_size = Login_pro.getProperty("Welcome_to_PULS_font_size");
		return Welcome_to_PULS_font_size;
	} 
	public String Username_text() {
		String Username_text = Login_pro.getProperty("Username_text");
		return Username_text;
	} 
	public String Username_text_colour() {
		String Username_text_colour = Login_pro.getProperty("Username_text_colour");
		return Username_text_colour;
	} 
	public String Username_font_size() {
		String Username_font_size = Login_pro.getProperty("Username_font_size");
		return Username_font_size;
	} 
	public String username_field_placeholder() {
		String username_field_placeholder = Login_pro.getProperty("username_field_placeholder");
		return username_field_placeholder;
	} 
	public String Psssword_text() {
		String Psssword_text = Login_pro.getProperty("Psssword_text");
		return Psssword_text;
	} 
	public String Passsword_text_colour() {
		String Psssword_text_colour = Login_pro.getProperty("Psssword_text_colour");
		return Psssword_text_colour;
	} 
	public String Passsword_font_size() {
		String Psssword_font_size = Login_pro.getProperty("Psssword_font_size");
		return Psssword_font_size;
	}
	public String Psssword_field_placeholder() {
		String Psssword_field_placeholder = Login_pro.getProperty("Psssword_field_placeholder");
		return Psssword_field_placeholder;
	}
	public String Login_button_colour() {
		String Login_button_colour = Login_pro.getProperty("Login_button_colour");
		return Login_button_colour;
	}
	public String Login_button_font_size() {
		String Login_button_font_size = Login_pro.getProperty("Login_button_font_size");
		return Login_button_font_size;
	}
	public String Forgot_password_text() {
		String Forgot_password_text = Login_pro.getProperty("Forgot_password_text");
		return Forgot_password_text;
	}
	public String Forgot_password_text_colour() {
		String Forgot_password_text_colour = Login_pro.getProperty("Forgot_password_text_colour");
		return Forgot_password_text_colour;
	}
	public String Invalid_Credentials() {
		String Invalid_Credentials = Login_pro.getProperty("Invalid_Credentials");
		return Invalid_Credentials;
	}
	public String Username_required() {
		String Username_required = Login_pro.getProperty("Username_required");
		return Username_required;
	}
	public String Password_required() {
		String Password_required = Login_pro.getProperty("Password_required");
		return Password_required;
	}
	public String Welcome_to_PULS() {
		String Welcome_to_PULS = Login_pro.getProperty("Welcome_to_PULS");
		return Welcome_to_PULS;
	}
	public String invalid_username_with_spaces() {
		String invalid_username_with_spaces = Login_pro.getProperty("invalid_username_with_spaces");
		return invalid_username_with_spaces;
	}
	public String invalid_password_with_spaces() {
		String invalid_password_with_spaces = Login_pro.getProperty("invalid_password_with_spaces");
		return invalid_password_with_spaces;
	}
	public String forgotPassword_page_title() {
		String forgotPassword_page_title = Login_pro.getProperty("forgotPassword_page_title");
		return forgotPassword_page_title;
	}
	public String forgotPassword_page_title_colour() {
		String forgotPassword_page_title_colour = Login_pro.getProperty("forgotPassword_page_title_colour");
		return forgotPassword_page_title_colour;
	}
	public String Email_text_field_title() {
		String Email_text_field_title = Login_pro.getProperty("Email_text_field_title");
		return Email_text_field_title;
	}
	public String Email_text_field_placeholder() {
		String Email_text_field_placeholder = Login_pro.getProperty("Email_text_field_placeholder");
		return Email_text_field_placeholder;
	}
	public String Email_text_field_colour() {
		String Email_text_field_colour = Login_pro.getProperty("Email_text_field_colour");
		return Email_text_field_colour;
	}
	public String Email_text_field_fontsize() {
		String Email_text_field_fontsize = Login_pro.getProperty("Email_text_field_fontsize");
		return Email_text_field_fontsize;
	}
	public String invalid_username() {
		String invalid_username = Login_pro.getProperty("invalid_username");
		return invalid_username;
	}
	public String invalid_password() {
		String invalid_password = Login_pro.getProperty("invalid_password");
		return invalid_password;
	}
	public String username_must_valid() {
		String username_must_valid = Login_pro.getProperty("username_must_valid");
		return username_must_valid;
	}
	public String Css_color() {
		String Css_color = Login_pro.getProperty("Css_color");
		return Css_color;
	}
	public String Css_font_size() {
		String Css_font_size = Login_pro.getProperty("Css_font_size");
		return Css_font_size;
	}
	public String Forgot_password_font_size() {
		String Forgot_password_font_size = Login_pro.getProperty("Forgot_password_font_size");
		return Forgot_password_font_size;
	}
	
}
