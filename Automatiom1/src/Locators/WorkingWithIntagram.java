package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIntagram {
	public static void main(String[] args) throws InterruptedException {
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to open the web application
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		String title=driver.getTitle();
		//active element
		//driver.switchTo().activeElement().sendKeys("phoebe buffay");
		//identify the guitar
		driver.findElement(By.name("")).sendKeys("manager");
		
		

	}
}
