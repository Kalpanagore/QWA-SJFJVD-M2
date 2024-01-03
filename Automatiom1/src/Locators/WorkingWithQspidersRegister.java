package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithQspidersRegister {
	
	public static void main(String[] args) throws InterruptedException {
		
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to open the web application
		driver.get("http://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.linkText("customModal")).sendKeys("kalpana gore");
		//driver.findElement(By.name("Password")).sendKeys("kalpana@712");

	}

}
