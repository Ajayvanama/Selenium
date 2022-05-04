package com.testscenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownhandle {

	public static void main(String[] args) {
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://collegeweeklive.com/go-signup/");
		//Thread sleep(3000);
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//select country
		Select abc = new Select(driver.findElement(By.id("country")));
		abc.selectByVisibleText("INDIA");
		
		
		
      
	}

}
