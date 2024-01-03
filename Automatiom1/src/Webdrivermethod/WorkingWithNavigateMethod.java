package Webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//optimize code to maximize()window
		driver.manage().window().maximize();
		
		//to launch the web application
		driver.get("https://www.zomato.com/");
		
		//to next webpage
		driver.get("https://www.swiggy.com/");
		
		//to go back
		Thread.sleep(2000);
		driver.navigate().back();
		
		//to go forward
		Thread.sleep(2000);
		driver.navigate().forward();
		
		//to refresh
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}
}
