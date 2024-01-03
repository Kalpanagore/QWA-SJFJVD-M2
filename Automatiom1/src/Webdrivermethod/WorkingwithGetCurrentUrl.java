package Webdrivermethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithGetCurrentUrl 
{

	public static void main(String[] args) {
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to open the web application
		driver.get("https://www.amazon.in/");
		//to fetch the CurrentUrl
		
		String url=driver.getCurrentUrl();
		//system.out.println("The title of current WebPage is"+title);
		if(url.equals("https://www.amazon.in/"))
		{	System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
	}
}
