package com.sgtesting.testscripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceAssign1 {
	public static WebDriver oBrowser=null; 

	public static void main(String[] args) {
		
		launchBrowser();
		 navigate();
		 login();
		 minimizefly();
		 createUser1();
		 createUser2();
		 createUser3();
		 logout();
		 user1login();
		 logoutt();
		 user2login();
		 logout1();
		 user3login();
		 logout2();
		 login1();
		 modifyPass1();
		 modifyPass2();
		 modifyPass3();
		 logout4();
		 user11login();
		 logouta();
		 user22login();
		 logoutb();
    	 user33login();
    	 logoutc();	
		 loginn();
		 deleteUser1();
		 deleteUser2();
		 deleteUser3();
		 logoutfinal();
	     closeApplication();

		 
	}
	static void launchBrowser()
	{
		try
		{ 
			System.setProperty("webdriver.chrome.driver", "F:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizefly()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
	
	static void createUser1()
	{
		try
		{
			
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demo1");
		oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Tazeem");
		oBrowser.findElement(By.name("username")).sendKeys("Khan");
		oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("tazeemkhan123@gmail.com");
		oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome123");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
		oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
		Thread.sleep(2000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
	}

	static void createUser2()
	{
		try
		{
			
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demo2");
		oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Sarvesh");
		oBrowser.findElement(By.name("username")).sendKeys("Kumar");
		oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("Sarveshkumar123@gmail.com");
		oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome1234");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1234");
		oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
		Thread.sleep(2000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
	}
	static void createUser3()
	{
		try
		{
			
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demo3");
		oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Zaid");
		oBrowser.findElement(By.name("username")).sendKeys("Ahmed");
		oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("ZaidAhmed123@gmail.com");
		oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome12345");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome12345");
		oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
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
			   Thread.sleep(3000);
			   
		   }catch(Exception e)
			{
				e.printStackTrace();
		    }
	   }
	
	static void user1login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Khan");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
   
	}
	
	static void logoutt()
	   {
		   try
		   {
			   oBrowser.findElement(By.id("logoutLink")).click();
			   Thread.sleep(3000);
			   
		   }catch(Exception e)
			{
				e.printStackTrace();
		    }
	   }
	

	
	static void user2login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Kumar");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome1234");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
	
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
	}
	
	static void logout1()
	   {
		   try
		   {
			   oBrowser.findElement(By.id("logoutLink")).click();
			   Thread.sleep(3000);
			   
		   }catch(Exception e)
			{
				e.printStackTrace();
		    }
	   }
	

	
	static void user3login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Ahmed");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome12345");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
	
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
	}
	
	static void logout2()
	   {
		   try
		   {
			   oBrowser.findElement(By.id("logoutLink")).click();
			   Thread.sleep(3000);
			   
		   }catch(Exception e)
			{
				e.printStackTrace();
		    }
	   }
	
	static void login1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}


		
	static void modifyPass1()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("Qwerty123");
			oBrowser.findElement(By.name("passwordCopy")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Qwerty123");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	
	static void modifyPass2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Qwerty1234");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Qwerty1234");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyPass3()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Qwerty12345");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Qwerty12345");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']")).click();
			Thread.sleep(3000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout4()
	   {
		   try
		   {
			   oBrowser.findElement(By.id("logoutLink")).click();
			   Thread.sleep(3000);
			   
		   }catch(Exception e)
			{
				e.printStackTrace();
		    }
	   }
	
	static void user11login()
	{
		try
		{
			
			oBrowser.findElement(By.name("username")).sendKeys("Khan");
			oBrowser.findElement(By.name("pwd")).sendKeys("Qwerty123");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
	    }

	}
	static void logouta()
	   {
		   try
		   {
			   oBrowser.findElement(By.id("logoutLink")).click();
			   Thread.sleep(3000);
			   
		   }catch(Exception e)
			{
				e.printStackTrace();
		    }
	   }
	

	static void user22login()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("Kumar");
			oBrowser.findElement(By.name("pwd")).sendKeys("Qwerty1234");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
	}
	
	static void logoutb()
	   {
		   try
		   {
			   oBrowser.findElement(By.id("logoutLink")).click();
			   Thread.sleep(3000);
			   
		   }catch(Exception e)
			{
				e.printStackTrace();
		    }
	   }
	

  
	static void user33login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Ahmed");
			oBrowser.findElement(By.name("pwd")).sendKeys("Qwerty12345");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
	
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
	}
	
	static void logoutc()
	   {
		   try
		   {
			   oBrowser.findElement(By.id("logoutLink")).click();
			   Thread.sleep(3000);
			   
		   }catch(Exception e)
			{
				e.printStackTrace();
		    }
	   }
	static void loginn()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
		
	static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
			
		}catch (Exception e)
		{	
			e.printStackTrace();
		}
	}
	
	
	static void deleteUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
		
		}catch (Exception e)
		{	
			e.printStackTrace();
		}
	
	}
	static void deleteUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
		    String str=oAlert.getText();
		    System.out.println(str);
		    oAlert.accept();
		    Thread.sleep(3000);
		
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutfinal()
	   {
		   try
		   {
			   oBrowser.findElement(By.id("logoutLink")).click();
			   Thread.sleep(3000);
			   
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