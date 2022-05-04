package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBlogin {

	public static void main(String[] args) {
		WebDriver driver;
		// Launch any browser (Chrome)/ Open webpage
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		// To maximize the current window
		driver.manage().window().maximize();
		// TODO Auto-generated method stub 
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("ajay");
		driver.findElement(By.id("pass")).sendKeys("ajju");
		// Click On Login button
		driver.findElement(By.name("Login")).click();
		
		driver.close();
		
		
		
		
		

	}

}
