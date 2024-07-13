package base;

import java.io.IOException;
import java.time.Duration;

import org.checkerframework.framework.qual.PreconditionAnnotation;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadData;

public class BaseClass {
	public  ChromeDriver driver;
	public String fileName;
@BeforeMethod
public void preCondition() {
	
	ChromeOptions options = new ChromeOptions();
	 options.addArguments("--disable-notifications");
	 driver = new ChromeDriver(options);
	 System.out.println("BeforeMethod:" +driver);//initialization(f26b3d014845cf6099b9b03e956e89b9)
	// TODO Auto-generated method stub
	
	// 1.Load the url

			driver.get("https://login.salesforce.com");
			//to maximize the window
			driver.manage().window().maximize();
			//- Add an implicit wait to ensure the web page elements are fully loaded
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
}
@DataProvider(name="fetchData")
public String[][] sendData()throws IOException {
	return ReadData.readData(fileName);
}

@AfterMethod
public void postCondition() {
	// TODO Auto-generated method stub
	driver.close();
}


}

