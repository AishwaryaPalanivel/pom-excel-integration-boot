package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ApplauncherPage extends BaseClass {
	public ApplauncherPage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		}

	public IndividualsPage clickviewall() throws InterruptedException {
		Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
	return new IndividualsPage(driver);
}
	
	

}
