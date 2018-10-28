package Academy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.loginpage;
import resources.basepage;

public class Loginpage extends basepage {

	@BeforeTest
	public void Driverinitialization() throws IOException {

		driver = Intializedriver();

	}

	@Test

	public void getlogin() throws IOException {

		driver = Intializedriver();

		loginpage lp = new loginpage(driver);

		lp.username().sendKeys("vikaspedamallu@gmail.com");

		lp.password().sendKeys("Vikas@2018");

		lp.Submit().click();

	}

	@AfterTest

	public void teardown() {

		driver.close();
	

}
	
}
