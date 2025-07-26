package test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicValidation {
	
	//webdriver declaration
	public static WebDriver driver;
	String url = "https://www.facebook.com";
	
	//pre-activity
	@BeforeTest
	public void setup() {
		//open chrome browser
		driver = new ChromeDriver();
		
		//open the facebook url
		driver.get(url);
	}
	
	//post-activity
	@AfterTest
	public void tearDown() {
		//close the chrome browser after the test case is executed
		driver.quit();
	}
	
	@Test
	public void welcomeMessageValidation() {
		String expectedResult = "Facebook helps you connect and share with the people in your life.";
		String actualResult = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		
		Reporter.log("Expected Result =  " + expectedResult);
		Reporter.log("Actual Result = " + actualResult);
		
		//compare the results
		assertTrue(actualResult.equals(expectedResult), "Mismatch in the welcome message,");
	}
	
	@Test
	public void emailTextBoxPlaceholderValidation() {
		String expectedResult = "Email address or phone number";
		String actualResult = driver.findElement(By.id("email")).getDomAttribute("placeholder");
		
		Reporter.log("Expected Result =  " + expectedResult);
		Reporter.log("Actual Result = " + actualResult);
		
		//compare the results
		assertTrue(actualResult.equals(expectedResult), "Mismatch in the email placeholder,");
	}
	
	@Test
	public void passwordTextBoxPlaceholderValidation() {
		String expectedResult = "Password";
		String actualResult = driver.findElement(By.id("pass")).getDomAttribute("placeholder");
		
		Reporter.log("Expected Result =  " + expectedResult);
		Reporter.log("Actual Result = " + actualResult);
		
		//compare the results
		assertTrue(actualResult.equals(expectedResult), "Mismatch in the password placeholder,");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
