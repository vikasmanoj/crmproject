package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basepage {
	
	public WebDriver driver;
	
	public WebDriver Intializedriver() throws IOException {
		
	Properties prop= new Properties();
	
	FileInputStream fis= new FileInputStream("C:\\Users\\Vikas Manoj\\CRMProject\\src\\main\\java\\resources\\data.properties");
		
	prop.load(fis);
	
	String browsername = prop.getProperty("browser");
	
	System.out.println(browsername);
	
	//Selecting the browser 
	if(browsername.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
	    driver=new ChromeDriver();
	}
	else if(browsername.equals("firefox")) {
		
		System.setProperty("webdriver.gecko.driver","C:/geckodriver.exe");
		driver=new FirefoxDriver();
		
	}
    else if(browsername.equals("IE")){
		
    	System.setProperty("webdriver.gecko.driver","C:/geckodriver.exe");
		driver=new FirefoxDriver();
	}
	
	//Sending url details
	String urlname=prop.getProperty("url");
	
	driver.get(urlname);
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	return driver;
	
	
	//Creating objects for Userid and password
	
	
	
		
	}

	
	
}
