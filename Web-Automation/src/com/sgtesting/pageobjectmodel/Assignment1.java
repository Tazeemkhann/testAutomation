package com.sgtesting.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		CreateUser1();
		DeleteUser();
		logout();
		closeApplication();
		
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","F:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/user/submit_tt.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try 
		{
			oPage.getusername().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getlogin().click();
			Thread.sleep(2000);
			
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	

	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindows().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void CreateUser1()
	
		{
		try
		{
			oPage.Users1().click();
			Thread.sleep(3000);
			oPage.Useradd1().click();
			Thread.sleep(3000);
			oPage.sendfirstname1().sendKeys("Zaid");
			oPage.sendlastName1().sendKeys("Ahmed");
			oPage.email1().sendKeys("Zaid@gmail.com");
			oPage.username1().sendKeys("Zahmed");
			oPage.Password1().sendKeys("Welcome123");
			oPage.passwordCopy1().sendKeys("Welcome123");
			oPage.Createuser1().click();
			Thread.sleep(2000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		}
	
	static void DeleteUser()
	{
		try
		{
			oPage.deleteu().click();
			Thread.sleep(2000);
			oPage.deleteUser1().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
		    }
		
		
	}
	static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.quit();
			
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
	}

	
		

}
