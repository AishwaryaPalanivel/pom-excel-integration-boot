package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import base.BaseClass;

public class ViewIndividualpage extends BaseClass{
	public ViewIndividualpage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		}

	public ViewIndividualpage verify_Individual_page() throws InterruptedException {
		String message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(message);

		String actTitle= message;
		String expTitle="Individual \"kumar\" was created.";
		
		Assert.assertEquals(actTitle, expTitle);
		boolean displayed =driver.findElement(By.xpath("//input[@placeholder='Last Name']")).isDisplayed();
		Assert.assertTrue(displayed);
		System.out.println(displayed);
		return this;
	}
	

}

