package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {

	public WebDriver driver;

	By Username = By.xpath("//input[@name='username']");

	By Password = By.xpath("//input[@name='password']");

	By submit = By.xpath("//input[@value='Login']");

	public loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}

	public WebElement username() {

		return driver.findElement(Username);

	}

	public WebElement password() {

		return driver.findElement(Password);

	}

	public WebElement Submit() {

		return driver.findElement(submit);

	}
}
