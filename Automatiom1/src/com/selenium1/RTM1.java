package com.selenium1;

import java.util.Scanner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class RTM1 {
	static WebDriver driver;
	public static void main(String [] arg)
	{
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the browser name");
String browser =sc. next();
if (browser.equals("Chrome"))
{
driver =new ChromeDriver();
}
else if(browser.equals("Firefox"))
{
	driver=new FirefoxDriver();
}
else if(browser.equals("Edge"))
{
	driver=new EdgeDriver();
}
else
{
	System.out.println("Invalid Browser");
}
	}
}
