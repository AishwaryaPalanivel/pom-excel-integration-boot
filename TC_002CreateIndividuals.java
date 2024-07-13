package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002CreateIndividuals extends BaseClass {
	
		@BeforeTest
		public void setValues() {
			fileName="CreateIndividuals";
		}
	@Test(dataProvider="fetchData")
	public void run_Login(String uName,String pWord,String Lastname) {
//System.out.println("@Test :" +driver);
//		LoginPage lp=new LoginPage();
//		lp.enterUsername();
//		lp.enterPassword();
//		lp.clickLoginButton();
//		
//		HomePage hp=new HomePage();
//		hp.verifySetupHome();
try {
	new LoginPage(driver)
	.enterUsername(uName)
	.enterPassword(pWord)
	.clickLoginButton()
	.verifySetupHome()
	.clicktogglebutton()
	.clickviewall()
	.clickIndividuals()
	.clickRecentlyViewed_or_Individuals()
	.click_New()
	.enter_Last_Name(Lastname)
	.click_save()
	.verify_Individual_page();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}





	
	}
}
