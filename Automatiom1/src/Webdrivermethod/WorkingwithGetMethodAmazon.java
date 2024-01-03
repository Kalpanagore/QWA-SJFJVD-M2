package Webdrivermethod;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class WorkingwithGetMethodAmazon
	{

		public static void main(String[] args) {
			//to launch the browser
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			//to open the web application
			driver.get("https://www.amazon.in/");
			//to fetch the title
			String actual_title=driver.getTitle();
			//system.out.println("The title of current WebPage is"+title);
			if(actual_title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
					{
				System.out.println("Test case is pass");
			}
			else
			{
				System.out.println("Test case is fail");
			}
		}

	}


