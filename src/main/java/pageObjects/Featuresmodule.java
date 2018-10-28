package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Featuresmodule {

	
	public WebDriver driver;

	By Featuresheader = By.cssSelector("[class='col-lg-8 col-offset-2'] h1");
	
//	By getfeature = By.linkText("Features");
	
	
	By getfeature = By.xpath("//div[@id='navbar-collapse']/ul[@class='nav navbar-nav navbar-right']//a[@href='https://www.freecrm.com/features.html']");
	
	
	
	


	public Featuresmodule(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		
		
		this.driver=driver;
	}



	public WebElement Featuretitlevalidation() {

		return driver.findElement(Featuresheader);

	}
	
	public WebElement navigatetofeature() {
		
		return driver.findElement(getfeature);
	}

	
	
}
