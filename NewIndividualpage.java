package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class NewIndividualpage extends BaseClass {
	public NewIndividualpage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		}

	public IndividualPage click_New() throws InterruptedException {
		WebElement newindividuals = driver.findElement(By.xpath("//div[contains(text(),'New')]"));
		Actions Dropdown5 = new Actions(driver);
		Dropdown5.moveToElement(newindividuals).click().build().perform();
		return new IndividualPage(driver);
	}
	


}

