package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Connection.Base;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import junit.framework.Assert;
import pageObjects.Featuresmodule;
import resources.basepage;

public class Featurespage extends basepage {
	
	public static Logger log =LogManager.getLogger(Base.class.getName());
	
		@BeforeTest
		public void Driverinitialization() throws IOException {

			driver = Intializedriver();

		}
		
		@Test
		
		public void Navigatetofeature() {
			
			Featuresmodule fm = new Featuresmodule(driver);
			
			fm.navigatetofeature().click();
			
		}

		@Test

		public void headervalidation() throws IOException {

			Featuresmodule fm = new Featuresmodule(driver);
			
			fm.Featuretitlevalidation().getText();
			
			String text="Free CRM Features powerful sales automation and customer service features import data, export, dashboards and more";
			
			Assert.assertEquals(fm.Featuretitlevalidation().getText(), "text");
			
			
			
			
			
		}

		@AfterTest

		public void teardown() {

			driver.close();

		}

	}



