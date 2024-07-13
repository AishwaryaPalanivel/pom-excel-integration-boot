package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage(ChromeDriver driver){
		this.driver=driver;
	}
	
	public LoginPage enterUsername(String uName) {
		// System.out.println("LoginPage:" +driver);
		driver.findElement(By.id("username")).sendKeys(uName);
	
		//LoginPage lp=new LoginPage();
		//return lp;
		return this;
	}
	public LoginPage enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
		return this;
	}
	public HomePage clickLoginButton() {
		driver.findElement(By.id("Login")).click();
		//HomePage hp=new HomePage();
		//return hp;
		return new HomePage(driver);
	}
	 
}
