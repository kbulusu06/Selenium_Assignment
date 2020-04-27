package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase_4A extends utility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser("ch");
		WebDriver driver=utility.driver;			
		Thread.sleep(2000);	
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("siddharthi.B@salesforce.com");
		driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys("siddharthi.B@salesforce.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.xpath("//p[contains(text(),'ve sent you an email with a link to finish rese')]")).getText();
		if(driver.findElement(By.xpath("//p[contains(text(),'ve sent you an email with a link to finish rese')]")).getText().trim().equals("ve sent you an email with a link to finish rese")){
			System.out.println("Sucess");
		}
		else {
			System.out.println("Fail");
		}
       quitBrowser();
	}
	

}
