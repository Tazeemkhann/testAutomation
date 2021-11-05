package com.sgtesting.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment66 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	
	public static void main(String[] args) {
		
        launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		creteProject();
		modifyProject();
		deleteCustomer();
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
	
	static void createCustomer()
	{
		try
		{
			oPage.custo().click();
			Thread.sleep(2000);
			oPage.custo1().click();
			Thread.sleep(2000);
			oPage.custo2().click();
			Thread.sleep(2000);
			oPage.custo3().click();
			Thread.sleep(2000);
			oPage.custo3().sendKeys("Satish");
			oPage.custo4().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void creteProject()
	{
		try
		{
			oPage.projectcreate1().click();
			Thread.sleep(2000);
			oPage.projectcreate2().click();
			Thread.sleep(2000);
			oPage.projectcreate3().sendKeys("Mech");
			oPage.projectcreate4().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

  
	static void modifyProject()
	{
		try
		{
			oPage.projectmodif1().click();
			Thread.sleep(2000);
			oPage.projectmodif2().sendKeys("It is a Palace");
			oPage.projectmodif1().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}

	}
	
	static void deleteCustomer()
	{
		try 
		{
			oPage.dcusto1().click();
			Thread.sleep(2000);
			oPage.dcusto2().click();
			Thread.sleep(2000);
			oPage.dcusto3().click();
			Thread.sleep(2000);
			oPage.dcusto4().click();
			Thread.sleep(2000);
			
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
