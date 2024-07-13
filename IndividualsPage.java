package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base.BaseClass;

public class IndividualsPage extends BaseClass{
	public IndividualsPage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		}

	public More clickIndividuals() {
		WebElement individuals= driver.findElement(By.xpath("//div[contains(@class,'slds-scrollable')]//p[text()='Individuals']"));
		Actions Dropdown = new Actions(driver);
		Dropdown.moveToElement(individuals).click().build().perform();
	return new  More(driver);
	}
}
