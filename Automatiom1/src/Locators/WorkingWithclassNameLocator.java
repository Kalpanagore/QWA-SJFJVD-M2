package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithclassNameLocator {
	public static void main(String[] args) {
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to open the web application
		driver.get("https://www.google.co.in/");
		//active element
		driver.switchTo().activeElement().sendKeys("phoebe buffay");
		//identify the guitar
		driver.findElement(By.className("1NPNe")).click();
		
		
	}

}
