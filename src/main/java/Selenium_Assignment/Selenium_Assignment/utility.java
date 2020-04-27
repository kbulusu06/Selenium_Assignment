package Selenium_Assignment.Selenium_Assignment;

import java.io.FileInputStream;
//import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class utility {
public static WebDriver driver = null;
	
	static void launchBrowser(String sBrowser){
		
		if(sBrowser.startsWith("ch")) {
		WebDriverManager.chromedriver().setup();			
		driver = new ChromeDriver();
		}				
		
		else if(sBrowser.startsWith("fire"))			{
			WebDriverManager.firefoxdriver().setup();				
			driver=new FirefoxDriver();			
		}
		
		driver.manage().window().maximize(); 
		driver.get("https://www.salesforce.com/"); 
		
		
	}
	static void quitBrowser(){
		driver.quit();
	}
	
	static void waitForPageElementToVisible(WebElement eleToWait) {
		WebDriverWait wait = new WebDriverWait(utility.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(eleToWait));
		
	}
	
	static void login_details() {
		
		String spath=System.getProperty("user.dir")+"/credentials.properties";{
			try {
			Properties prop=new Properties();
			FileInputStream fi=new FileInputStream(spath);
			prop.load(fi);
			System.getProperties().putAll(prop);
			driver.get(prop.getProperty("URL"));
			driver.findElement(By.id("username")).sendKeys(prop.getProperty("Username"));
			driver.findElement(By.id("password")).sendKeys(prop.getProperty("Password"));
			driver.findElement(By.xpath("//input[@id='Login']")).click();
			
			
			}catch(Exception a) {
				System.out.println(a);
			}
			
		}
	}
}
