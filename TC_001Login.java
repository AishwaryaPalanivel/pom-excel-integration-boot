package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class TC_001Login extends BaseClass {
	@BeforeTest
	public void setValues() {
		fileName="LoginPage";
	}
	@Test(dataProvider="fetchData")
	public void run_Login(String uName,String pWord) {
//System.out.println("@Test :" +driver);
//		LoginPage lp=new LoginPage();
//		lp.enterUsername();
//		lp.enterPassword();
//		lp.clickLoginButton();
//		
//		HomePage hp=new HomePage();
//		hp.verifySetupHome();
	new LoginPage(driver)
	.enterUsername(uName)
	.enterPassword(pWord)
	.clickLoginButton()
	.verifySetupHome()
	.clicktogglebutton();
	
	
	}
}
