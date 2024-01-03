package searchContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElement {
	public static void main(String[] args) {
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to open the web application
		driver.get("https://www.amazon.in/");
		
		

}
}
