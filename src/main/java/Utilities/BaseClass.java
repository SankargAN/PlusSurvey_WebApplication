package Utilities;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Properties.loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static String testSuiteName;
	public static String testCaseName;
	public static ExtentReports extentReports;
	public static ExtentSparkReporter sparkRepoter;
	public static WebDriver driver;
	public static Actions action;
	public static ExtentTest extentTest;
	public static Alert alert;
	public static Select select;
	public static String screenshotPath = null;
	public static loginpage loginPage_PRO;
	@BeforeSuite
	public void extendsReportsInstantiation(ITestContext context) {
		testSuiteName = context.getSuite().getName();
		testCaseName = context.getCurrentXmlTest().getName();

		extentReports = new ExtentReports();
		sparkRepoter = new ExtentSparkReporter(System.getProperty("user.dir")+"/ExtentReports/"+testSuiteName+"/"+testCaseName+"/"+testCaseName+timeStamp()+".html");
		extentReports.attachReporter(sparkRepoter);
	}

	@Parameters("browserName")
	@BeforeTest
	//Cross Browsing 
	public void browserInstantiation(String browserName, ITestContext context) {
		switch (browserName) {
		case "chrome": WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();break;
		case "firefox": WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();break;
		case "edge" : WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();break;
		}
		//maximize the page
		driver.manage().window().maximize();
		//Object Creating for Actions class
		action = new Actions(driver);
		
		//Object creating for Loginpage properties
		loginPage_PRO = new loginpage();

		//Object for Capabilities
		Capabilities capablity = ((RemoteWebDriver)driver).getCapabilities();
		String device = capablity.getBrowserName()+" "+capablity.getBrowserVersion().substring(0,capablity.getBrowserVersion().indexOf("."));
		String author = context.getCurrentXmlTest().getParameter("author");

		//System Environment
		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
		extentReports.setSystemInfo("Website URL", "N/A");

		//Create test in Reports
		extentTest=extentReports.createTest(context.getName(), "Subject Diary Admin Role");
		extentTest.assignAuthor(author);
		extentTest.assignDevice(device);

	}

	@AfterMethod
	public void checkStatus(ITestResult result, java.lang.reflect.Method m) throws Exception {
		//status Checking
		testCaseName = result.getTestContext().getName();
		if(result.getStatus()==ITestResult.SUCCESS) {
			extentTest.pass(m.getName() + " is pass");
			//			screenshotPath = captureScrrenshotPath(result.getTestContext().getName()+"-"+result.getMethod().getMethodName());
			//			extentTest.addScreenCaptureFromPath(screenshotPath);
		}else if (result.getStatus()==ITestResult.FAILURE) {
			screenshotPath = captureScrrenshotPath(result.getTestContext().getName()+"-"+result.getMethod().getMethodName());
			extentTest.addScreenCaptureFromPath(screenshotPath);
			extentTest.fail(result.getThrowable());
		}else if (result.getStatus() == ITestResult.SKIP) {
			extentTest.skip(m.getName()+ " is Skiped");
		}
		extentTest.assignCategory(m.getAnnotation(org.testng.annotations.Test.class).groups());
		File jsonfile = new File(System.getProperty("user.dir")+"/Resources/extent-reports-config.json");
		sparkRepoter.loadJSONConfig(jsonfile);
	}
	@AfterTest
	//close the browser
	public void closeBrowser() {
		//driver.close();
	}
	@AfterSuite
	public void generateExtentReports() {
		extentReports.flush();
	}
	//ExtentInfo
	public static void extentInfo(String info) {
		extentTest.info(info);
	}
	//element click intercepted exception
	public static void element_click_intercepted_exception(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	//send keys intercepted exception
	public static void element_Sendkeys_intercepted_exception(WebElement element, String value) {
		JavascriptExecutor sendKeys = (JavascriptExecutor) driver;
		sendKeys.executeScript("arguments[0].sendKeys"+"("+value+")"+";", element);
	}
	//GET
	public static void get(String URL) {
		driver.get(URL);	
	}
	//click on element
	public static void click(WebElement element) {
		element.click();
	}

	//clear 
	public static void clear(WebElement element) {
		element.clear();	
	}

	//Send data
	public static void sendData(WebElement element, String data) {
		element.sendKeys(data);	
	}

	//getText
	public static String getText(WebElement element) {
		return element.getText();	
	}
	public static void implicit_wait(int Seconds) {

		// Set the implicit wait time to 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Seconds));

	}
	//----------------------------------Alert--------------------------------------------------->
	//alertAccept
	public static void alertAccept() {
		alert = driver.switchTo().alert();
		alert.accept();;
	}

	//alertDismiss
	public static void alertDismiss() {
		alert = driver.switchTo().alert();
		alert.dismiss();
	}

	//alert Get Text
	public static String alertGetText() {
		alert = driver.switchTo().alert();
		return alert.getText();
	}

	//alert SendKeys
	public static void alertSendkeys(String data) {
		alert= driver.switchTo().alert();
		alert.sendKeys(data);
	}
	//----------------------------------Alert End------------------------------------------------>

	//-------------------------------------is----------------------------------------------------->

	//is Displayed
	public static boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	//is Enabled
	public static boolean isEnabled(WebElement element) {
		return element.isEnabled();	
	}

	//is Selected
	public static void isSelected(WebElement element) {
		element.isSelected();
	}

	//<--------------------------------------is end ------------------------------------------------->

	//<---------------------------------Action Classes----------------------------------------------->

	//move To Element
	public static void moveToElement(WebElement element) {
		action.moveToElement(element).perform();
	}

	//moveToClick
	public static void moveToClick(WebElement element) {
		action.moveToElement(element).click().perform();
	}

	//doubleClick
	public static void doubleClick(WebElement element) {
		action.doubleClick(element).perform();
	}
	//Click
	public static void actionsclick(WebElement element) {
		action.click(element);
	}
	//---------------------------------Action Class End--------------------------------------------->

	//----------------------------------Select Class------------------------------------------------>

	//Dropdown List
	public static void dropDownList(WebElement element) {
		select = new Select(element);
		List<WebElement> webElements = select.getOptions();
		for (WebElement webElement : webElements) {
			webElement.getText();
		}
	}

	//dropdown equal to given data
	public static void validationDropdownsingleValue(WebElement element, String data) {
		select = new Select(element);
		List<WebElement> webelements = select.getOptions();
		for (WebElement webElement : webelements) {
			webElement.getText().equals(data);			
		}
	}

	//select By Visible Text 
	public static void selectByVisibleText(WebElement element, String data) {
		select = new Select(element);
		select.selectByVisibleText(data);
	}
	//Select By Value
	public static void selectByValue(WebElement element, String data) {
		select = new Select(element);
		select.selectByValue(data);
	}
	//select By index
	public static void selectByIndex(WebElement element, int index) {
		select = new Select(element);
		select.selectByIndex(index);
	}
	//De-select By Visible Text
	public static void deslectByVisibleText(WebElement element, String data) {
		select =new Select(element);
		select.deselectByVisibleText(data);
	}
	//De-Select By Value
	public static void deselectByValue(WebElement element, String data) {
		select = new Select(element);
		select.deselectByValue(data);
	}
	//De-Select By index
	public static void deselectindex(WebElement element, int index) {
		select = new Select(element);
		select.deselectByIndex(index);
	}
	//de-SelectAll
	public static void deselectAll(WebElement element) {
		select = new Select(element);
		select.deselectAll();
	}

	//-----------------------------------Select Class end---------------------------------------->

	//TimeStamp
	public static String timeStamp() {
		String timeStamp = null;
		LocalDateTime timedate = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyymmddhhss");
		timeStamp = timedate.format(format);
		return timeStamp;
	}
	//ScreenShot
	public static void screenShot(String fileName) {
		TakesScreenshot sh = (TakesScreenshot) driver;
		File sourcePath = sh.getScreenshotAs(OutputType.FILE);
		File destPath = new File(System.getProperty("use.dir")+"/Screenshots/"+fileName+timeStamp());

		try {
			FileUtils.copyFile(sourcePath, destPath);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	//Screenshot path
	public static String captureScrrenshotPath(String fileName) {
		TakesScreenshot sh = (TakesScreenshot) driver;
		File sourcPath = sh.getScreenshotAs(OutputType.FILE);
		File destFilePath = new File(System.getProperty("user.dir")+"/Screenshots/"+testSuiteName+"/"+testCaseName+"/"+fileName+timeStamp()+".jpg");
		try {
			FileUtils.copyFile(sourcPath, destFilePath);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return destFilePath.getAbsolutePath();
	}

}
