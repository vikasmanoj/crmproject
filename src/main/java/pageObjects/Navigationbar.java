package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigationbar {

        public WebDriver driver;

		By Featurestitle = By.linkText("Features");
		
		By pricingtitle = By.linkText("Pricing");
		By Customerstitle = By.linkText("Customers");
		By Contacttitle = By.linkText("Contact");
		
		
		

		public Navigationbar(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
			
			this.driver=driver;
		}

		public WebElement Features() {

			return driver.findElement(Featurestitle);

		}

		public WebElement Pricing() {

			return driver.findElement(pricingtitle);

		}

		public WebElement Customer() {

			return driver.findElement(Customerstitle);

		}
		
		public WebElement Contact() {

			return driver.findElement(Contacttitle);

		}
	}

