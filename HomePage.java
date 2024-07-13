package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class HomePage extends BaseClass {
	public HomePage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		}
	public HomePage verifySetupHome() {
		
				String verify_home = driver.findElement(By.xpath("(//span[contains(@class,'breadcrumbNoLink uiOutputText')]/following::span)[2]")).getText();
	if(verify_home.contains("Home")) {
		System.out.println("Homepage displayed");
	}else {
		System.out.println("Homepage not displayed");
		}
	return this;
	}
	public ApplauncherPage clicktogglebutton() {
		driver.findElement(By.xpath("//div[contains(@class,'slds-icon-waffle')]")).click();
		return new ApplauncherPage(driver);

	}
	
	}
	


