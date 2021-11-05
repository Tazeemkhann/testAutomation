package com.sgtesting.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceAssign11 {
	public static WebDriver oBrowser=null;
	public static ActiTimePageforEtE oPage=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		CreateUser1();
		CreateUser2();
		CreateUser3();
		logout();
		
		loginasUser1();
		logout();
		loginasUser2();
		logout();
		loginasUser3();
		logout();
		
		login();
		modifyPassward1();
		modifyPassward2();
		modifyPassward3();
		logout();
		
		
		loginasUser11();
		logout();
		loginasUser22();
		logout();
		loginasUser33();
		logout();
		login();
		
		DeleteUser1();
		DeleteUser2();
		DeleteUser3();
		
		
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","F:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePageforEtE(oBrowser);
			
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
		oPage.sendfirstname1().sendKeys("user1");
		oPage.sendlastName1().sendKeys("Demo1");
		oPage.email1().sendKeys("user1@gmail.com");
		oPage.username1().sendKeys("user1");
		oPage.Password1().sendKeys("Welcome123");
		oPage.passwordCopy1().sendKeys("Welcome123");
		oPage.Createuser1().click();
		Thread.sleep(2000);
		
	}catch (Exception e)
	{
		e.printStackTrace();
	}	
	}

static void CreateUser2()
	
	{
	try
	{
		oPage.Users1().click();
		Thread.sleep(3000);
		oPage.Useradd1().click();
		Thread.sleep(3000);
		oPage.sendfirstname1().sendKeys("user2");
		oPage.sendlastName1().sendKeys("Demo2");
		oPage.email1().sendKeys("user2@gmail.com");
		oPage.username1().sendKeys("user2");
		oPage.Password1().sendKeys("Welcome123");
		oPage.passwordCopy1().sendKeys("Welcome123");
		oPage.Createuser1().click();
		Thread.sleep(2000);
		
	}catch (Exception e)
	{
		e.printStackTrace();
	}	
	}

static void CreateUser3()

{
try
{
	oPage.Users1().click();
	Thread.sleep(3000);
	oPage.Useradd1().click();
	Thread.sleep(3000);
	oPage.sendfirstname1().sendKeys("user3");
	oPage.sendlastName1().sendKeys("Demo3");
	oPage.email1().sendKeys("user3@gmail.com");
	oPage.username1().sendKeys("user3");
	oPage.Password1().sendKeys("Welcome123");
	oPage.passwordCopy1().sendKeys("Welcome123");
	oPage.Createuser1().click();
	Thread.sleep(2000);
	
}catch (Exception e)
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

static void loginasUser1()
{
	try 
	{
		oPage.getusername().sendKeys("user1");
		oPage.getPassword().sendKeys("Welcome123");
		oPage.getlogin().click();
		Thread.sleep(2000);
		oPage.loginasuse11().click();
		Thread.sleep(2000);
		
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}

static void loginasUser2()
{
	try 
	{
		oPage.getusername().sendKeys("user2");
		oPage.getPassword().sendKeys("Welcome123");
		oPage.getlogin().click();
		Thread.sleep(2000);
		oPage.loginasuse11().click();
		Thread.sleep(2000);
		
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}

static void loginasUser3()
{
	try 
	{
		oPage.getusername().sendKeys("user3");
		oPage.getPassword().sendKeys("Welcome123");
		oPage.getlogin().click();
		Thread.sleep(2000);
		oPage.loginasuse11().click();
		Thread.sleep(2000);
		
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}

static void modifyPassward1()
{
	try
	{
		oPage.modpass1().click();
		Thread.sleep(2000);
		oPage.usermodi1().click();
		Thread.sleep(2000);
		oPage.modpass2().sendKeys("Qwerty123");
		oPage.modpass3().sendKeys("Qwerty123");
		oPage.modpass4().click();
		Thread.sleep(2000);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}

static void modifyPassward2()
{
	try
	{
		oPage.modpass1().click();
		Thread.sleep(2000);
		oPage.usermodi2().click();
		Thread.sleep(2000);
		oPage.modpass2().sendKeys("Qwerty123");
		oPage.modpass3().sendKeys("Qwerty123");
		oPage.modpass4().click();
		Thread.sleep(2000);

	}catch (Exception e)
	{
		e.printStackTrace();
	}
}

static void modifyPassward3()
{
	try
	{
		oPage.modpass1().click();
		Thread.sleep(2000);
		oPage.usermodi3().click();
		Thread.sleep(2000);
		oPage.modpass2().sendKeys("Qwerty123");
		oPage.modpass3().sendKeys("Qwerty123");
		oPage.modpass4().click();
		Thread.sleep(2000);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}

static void loginasUser11()
{
	try 
	{
		oPage.getusername().sendKeys("user1");
		oPage.getPassword().sendKeys("Qwerty123");
		oPage.getlogin().click();
		Thread.sleep(2000);
		
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}

static void loginasUser22()
{
	try 
	{
		oPage.getusername().sendKeys("user2");
		oPage.getPassword().sendKeys("Qwerty123");
		oPage.getlogin().click();
		Thread.sleep(2000);
		
		
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}

static void loginasUser33()
{
	try 
	{
		oPage.getusername().sendKeys("user3");
		oPage.getPassword().sendKeys("Qwerty123");
		oPage.getlogin().click();
		Thread.sleep(2000);
		
		
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}

static void DeleteUser1()
{
	try
	{
		oPage.deleteu().click();
		Thread.sleep(2000);
	    oPage.deleteu1().click();
	    Thread.sleep(2000);
	    oPage.deleteUser1();
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


static void DeleteUser2()
{
	try
	{
		oPage.deleteu().click();
		Thread.sleep(2000);
		oPage.deleteu2().click();
		Thread.sleep(2000);
		oPage.deleteUser1().click();
		Thread.sleep(0);
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

static void DeleteUser3()
{
	try
	{
		oPage.deleteu().click();
		Thread.sleep(2000);
		oPage.deleteu1().click();
		Thread.sleep(2000);
		oPage.deleteu3().click();
		Thread.sleep(0);
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

}

