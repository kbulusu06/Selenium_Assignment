package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase_10 extends utility {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("ch");
		WebDriver driver=utility.driver;			
		Thread.sleep(2000);	
		login_details();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//ul[@id='tabBar']")));
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tryLexDialogX")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//h2[@class='pageDescription']")));
		driver.findElement(By.xpath("//input[@name='new']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='acc2']")).sendKeys("SidduB");
		WebElement Type=driver.findElement(By.xpath("//select[@id='acc6']"));
		Select dropdown=new Select(Type);
		dropdown.selectByVisibleText("Technology Partner");
		//customer priority 
		Thread.sleep(2000);
		WebElement CP=driver.findElement(By.xpath("//select[@id='00N5w00000HYSZk']"));
		Select dropdown1=new Select(CP);
		dropdown1.selectByIndex(1);	
		
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
		quitBrowser();
	}

}
