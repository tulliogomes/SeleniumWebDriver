package com.company.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyFirstTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Programas\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true);
		//options.addArguments("disable-infobars");
		//options.addArguments("--start-maximized");
		//options.addArguments("--disable-popup-blocking");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		// to maximize browser
		driver.manage().window().maximize();
		
		// to get the title
		System.out.println("The title of the page is "+driver.getTitle());
		
		// using ID
		/*driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();*/
		
		// using xpath
		//tagname[@attribute='value']/abc/xyz
		/*driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();*/
		
		// using css selector
		// id --> #
		// class --> .
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		//driver.findElement(By.cssSelector("input.button.hover")).click();
		driver.findElement(By.cssSelector("input.button")).click();
		
		
		// close browser
		//driver.close();
	}

}
