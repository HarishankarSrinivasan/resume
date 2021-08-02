package org.task;

import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Object {

	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harishankar\\eclipse-workspace\\Seletask3\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions act= new Actions(driver);
		WebElement findElement3 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		findElement3.click();
		WebElement findElement = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		findElement.sendKeys("mobiles",Keys.ENTER);
		WebElement findElement2 = driver.findElement(By.xpath("//img[@alt='POCO M3 (Power Black, 64 GB)'][2]"));
	    act.moveToElement(findElement2).click().perform();
		Thread.sleep(3000);
		driver.close();

	}

}