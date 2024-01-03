package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithnameLocator {
	
public static void main(String[] args) {
	//to launch the browser
	WebDriver driver=new ChromeDriver();
	//to maximize the window
	driver.manage().window().maximize();
	//to open the web application
	driver.get("http://desktop-puj308n/login.do");
	//identify Username
	driver.findElement(By.name("username")).sendKeys("admin");
	
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	driver.findElement(By.id("loginButton")).click();
}
}
