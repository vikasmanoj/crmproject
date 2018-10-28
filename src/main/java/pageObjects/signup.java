package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signup {

	public WebDriver driver;

	By Firstname = By.cssSelector("input[name='first_name']");

	By Lastname = By.cssSelector("input[name='surname']");

	By EMail = By.cssSelector("input[name='email']");

	By Confirmemail = By.cssSelector("input[name='email_confirm']");

	By Username = By.cssSelector("input[name='username']");

	By Password = By.cssSelector("input[name='password']");

	By Confirmpassword = By.cssSelector("input[name='passwordconfirm']");
	
	By agreetermsncond = By.cssSelector("input[name='agreeTerms']");
	
	By submitbutton = By.cssSelector("div[name='myButton']");
	
	

	public signup(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		
		this.driver=driver;
	}

	public WebElement firstname() {

		return driver.findElement(Firstname);

	}

	public WebElement lastname() {

		return driver.findElement(Lastname);

	}
	
	public WebElement email() {

		return driver.findElement(EMail);

	}

	public WebElement confirmemail1() {

		return driver.findElement(Confirmemail);

	}
	
	public WebElement user() {

		return driver.findElement(Username);

	}

	public WebElement password() {

		return driver.findElement(Password);

	}

	public WebElement confirmpassword() {

		return driver.findElement(Confirmpassword);

	}
	
	
	public WebElement Agreetermsncond() {

		return driver.findElement(agreetermsncond);

	}
	
	public WebElement Submitbutton() {

		return driver.findElement(submitbutton);

	}
	
	
}
