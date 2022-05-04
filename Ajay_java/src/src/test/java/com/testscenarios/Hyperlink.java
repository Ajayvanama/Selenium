package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//code for hyper link
		driver.findElement(By.linkText("Forgot password?")).click();
		 
	}
   
}
