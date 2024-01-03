package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithlinkTextLocator {

	public static void main(String[] args) {
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to open the web application
		driver.get("http://demoWebShop.tricentis.com/");
		driver.findElement(By.linkText("login")).click();

}
}