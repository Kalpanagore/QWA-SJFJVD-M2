package Webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithGetTitleCurrentUrlZomato {

	public static void main(String[] args) {
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		//optimize code
		driver.manage().window().maximize();
		//to open the web application
		driver.get("https://www.zomato.com/");
		//to fetch the title
		String actual_title=driver.getTitle();
		System.out.println("Zomato");
		//system.out.println("The title of current WebPage is"+title);
		//to fetch the url
		String url=driver.getCurrentUrl();
		if(actual_title.equals("Zomato"))
				{
			System.out.println("Test case is pass");
		}
		
		else
		{
			System.out.println("Test case is fail");
		}
	}
}
 