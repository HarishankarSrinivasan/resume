package org.task;

import java.awt.RenderingHints.Key;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Argument;

public class ScroolDown {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harishankar\\eclipse-workspace\\Seletask3\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		findElement.sendKeys("Harishankar");
		String text = findElement.getAttribute("value");
		System.out.println(text);
		WebElement findElement1 = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		findElement1.sendKeys("9840160108");
		String text2 = findElement1.getAttribute("value");
		System.out.println(text2);
		driver.close();

	}

}