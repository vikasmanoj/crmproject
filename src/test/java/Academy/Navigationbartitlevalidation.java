package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Connection.Base;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.Navigationbar;
import resources.basepage;

public class Navigationbartitlevalidation extends basepage {

	public static Logger log =LogManager.getLogger(Base.class.getName());
	
	
	
	@BeforeTest
	public void Driverinitialization() throws IOException {

		driver = Intializedriver();
		log.info("Driver is Intialized");
		
		

	}

	@Test

	public void Validatenavigation() throws IOException {

		Navigationbar nb = new Navigationbar(driver);

		Assert.assertEquals(nb.Features().getText(), "Features");
		
		log.info("Feature Bar title validated");

		Assert.assertEquals(nb.Pricing().getText(), "Pricing");
		
		log.info("Pricing Bar title validated");


		Assert.assertEquals(nb.Contact().getText(), "Contact");
		
		log.info("Contact Bar title validated");


		Assert.assertEquals(nb.Customer().getText(), "Customers");
		
		log.info("Customers Bar title validated");


	}

	@AfterTest

	public void teardown() {

		driver.close();

	}

}
