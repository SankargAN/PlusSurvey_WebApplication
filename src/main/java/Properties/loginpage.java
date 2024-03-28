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

}
