package Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithimpicitWait {
	public static void main(String[] args) throws InterruptedException{
		{
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			
			driver.get("http://desktop-puj308n/login.do");
			
			driver.findElement(By.name("username")).sendKeys("admin");
			
			driver.findElement(By.name("pwd")).sendKeys("manager");
			
			//identify login button
			driver.findElement(By.id("loginButton")).click();
			
		
			
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		
		driver.findElement(By.xpath("//a[text()='projects & Customers']")).click();
		
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		
		 driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Pooja Kale");
		 
			driver.findElement(By.name("createCustomerSubmit")).click();
			
			//closed 
			driver.quit();
		
		}
	}
}
	
		
		
		
		
		



