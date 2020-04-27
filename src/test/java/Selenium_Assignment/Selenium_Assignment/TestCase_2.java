package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.WebDriver;

public class TestCase_2 extends utility {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("ch");
		WebDriver driver=utility.driver;			
		Thread.sleep(2000);
		login_details();
quitBrowser();
	}

}
