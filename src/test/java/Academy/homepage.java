package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.Landingpage;
import pageObjects.signup;
import resources.basepage;

public class homepage extends basepage{

	@Test
	
	public void navigatehomepage() throws IOException {
		
		driver=Intializedriver();
		
		Landingpage lp = new Landingpage(driver);
		
		lp.registeraccount().click();
		
		
		
	}
	
//	@Test
//	
//	public void registeruser() {
//		
//        signup sp = new signup(driver);
//		
//		sp.firstname().sendKeys("vikas");
//		
//		sp.lastname().sendKeys("Pedamallu");
//		
//		sp.email().sendKeys("vikaspedamallu@gmail.com");
//		
//		sp.confirmemail1().sendKeys("vikaspedamallu@gmail.com");
//		
//		sp.user().sendKeys("vikasmanoj");
//		
//		sp.password().sendKeys("Vikas@2018");
//		
//		sp.confirmemail1().sendKeys("Vikas@2018");
//		
//		sp.Agreetermsncond().click();
//		
//		sp.Submitbutton().click();
//	}
//	

	
	
}
