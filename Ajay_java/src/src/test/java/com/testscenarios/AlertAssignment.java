package com.testscenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertAssignment {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  driver.findElement(By.id("alertButton")).click();
	  // To capture the message
	   String first_alert = driver.switchTo().alert().getText();
	   System.out.print(first_alert);
	   Thread.sleep(1000);
	   //to accept or cancel the alert
	   driver.switchTo().alert().accept();
	   Thread.sleep(1000);
	   
	   driver.findElement(By.id("timerAlertButton")).click();
	   WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(30));
	  // Thread.sleep(6000);
	  // String second_alert= driver.switchTo().alert().getText();
	  // System.out.print(second_alert);
	   driver.switchTo().alert().accept();
	   Thread.sleep(6000);
	   
	   //Third click
	   driver.findElement(By.id("confirmButton")).click();
	   String third_alert= driver.switchTo().alert().getText();
	   System.out.print(third_alert);
	   
	  
  }
}
