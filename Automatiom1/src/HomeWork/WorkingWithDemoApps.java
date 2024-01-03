package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDemoApps {
	
	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/formValidation");
		
		driver.findElement(By.xpath("//input[@name='requiredfield']")).sendKeys("XYZ");
		
		driver.findElement(By.xpath("//input[@name='minLength']")).sendKeys("Pooja");
		
		driver.findElement(By.xpath("//input[@name='maxLength']")).sendKeys("sonali");
		
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pooja@123");
		
		driver.findElement(By.xpath("//input[@name='confirmpass']")).sendKeys("Pooja@123");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Pooja123@gmail.com");
		
		
		driver.findElement(By.xpath("//input[@name='minValue']")).sendKeys("35000");
		
		driver.findElement(By.xpath("//input[@name='url']")).sendKeys("https://www.amazon.in");
		
		driver.findElement(By.xpath("//input[@name='maxValue']")).sendKeys("2346");
		
		driver.findElement(By.xpath("//input[@name='digits']")).sendKeys("712");
		
		driver.findElement(By.xpath("//input[@name='rangeValue']")).sendKeys("45");
		
		driver.findElement(By.xpath("//input[@name='number']")).sendKeys("8234567");
		
		driver.findElement(By.xpath("//input[@name='alphanum']")).sendKeys("kalp712");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
}
	
	


