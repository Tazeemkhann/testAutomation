package com.sgtesting.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sgtesting.pageobjectmodel.ActiTimePage;

public class CssSelectordemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		//absolutecssPath();
		//relativecssUsingTagnameAlone();
		//relativecssUsingTagnamewithIDAttribute();
		//relativecssUsingIDAttributeValue();
		 //relativecssUsingTagNameWithClassAttributeValue();
		//relativecssUsingAttributeValue();
		//relativecssUsingTagNameWithAttributeNameAndValue();
		relativecssUsingTagNameWithMultipleAttributeNameAndValue();
		
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","F:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("file:///C:/Users/TAZEEM~1/AppData/Local/Temp/Rar$EXa6980.43343/CSSSelector_02_NOV_2021/Sample.html");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	static void absolutecssPath()
	{
		oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("Demo1");
	}
	
	
	static void relativecssUsingTagnameAlone()
	{
		oBrowser.findElement(By.cssSelector("input")).sendKeys("demo1");
	}
	
	static void relativecssUsingTagnamewithIDAttribute()
	{
		oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("123");
	}

	static void relativecssUsingIDAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("123");
	}
	
	static void relativecssUsingTagNameWithClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("123");
	}
	static void relativecssUsingAttributeValue()
	{
		oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("Demo1");
	}
	
	static void relativecssUsingTagNameWithAttributeNameAndValue()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit']")).click();
	}
	
	static void relativecssUsingTagNameWithMultipleAttributeNameAndValue()
	{
	}
}
