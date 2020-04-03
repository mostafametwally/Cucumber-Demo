package com.pom.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.pom.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public TestBase() {
		try {
		prop= new Properties();
		FileInputStream ip=new FileInputStream("C://Users/Mostafa/eclipse-workspace/pomDemo/src/main/java/com/pom/config/cofig.properties");
		prop.load(ip);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
		//String browserName = prop.getProperty("browser");

	public static void Initialzation () {
		
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\programs\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (prop.getProperty("browser").equals("firefox")){
			System.setProperty("webdriver.gecko.geckodriver", "D:\\programs\\geckodriver.exe");
			driver= new FirefoxDriver();
		}

		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.navigate().to(prop.getProperty("url"));
	}
	
	public String GetPageTitle() {
		return driver.getTitle();
	}
}
