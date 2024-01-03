package Webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wrokingwithGetMethod {
	public static void main(String[] args) {
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		//to open the web appliction
		driver.get("https://www.flipkart.com/");
	}

}
