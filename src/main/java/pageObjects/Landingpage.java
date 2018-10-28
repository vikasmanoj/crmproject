package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {

	public WebDriver driver;

	
//   By signup =By.xpath("//div[@id='navbar-collapse']/ul[@class='nav navbar-nav navbar-right']//a[@href='https://www.freecrm.com/register/']");
	 
	 By signup =By.xpath("//div[@id='navbar-collapse']/ul[@class='nav navbar-nav navbar-right']//a[@href='https://www.freecrm.com/register/']");
	
//   By signup = By.cssSelector(".navbar-right [href='https\\:\\/\\/www\\.freecrm\\.com\\/register\\/']");
   

	
	public Landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement registeraccount() {
		
		return driver.findElement(signup);
		
		
	}
	
	


}
