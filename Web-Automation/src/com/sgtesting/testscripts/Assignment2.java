package com.sgtesting.testscripts;


		import java.time.Duration;

		import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Assignment2 {
			public static WebDriver oBrowser=null;
		    
			public static void main(String[] args) {
				launchBrowser();
				navigate();
				login();
				minimizeFlyOut();
				createUser();
				modify();
				deleteuser();
				logout();
				closeApplication();

			}

			static void launchBrowser()
			{
				try
				{
					System.setProperty("webdriver.chrome.driver","F:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
					oBrowser=new ChromeDriver();
				}catch(Exception e)
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
					
				}catch(Exception e)
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
					Thread.sleep(4000);
				}catch(Exception e)
				{
					e.printStackTrace();
			    }
			}
			
			static void minimizeFlyOut()
			{
				try 
				{
					oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
					Thread.sleep(2000);
				}catch(Exception e)
				{
					e.printStackTrace();
			    }
			}
			
			static void createUser()
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

   static void modify()
   {
	   try 
	   {
		   oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table")).click();
		   Thread.sleep(2000);
		   oBrowser.findElement(By.id("userDataLightBox_firstNameField")).clear();
		   Thread.sleep(2000);
		   oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Ahmed");
		   oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
		   Thread.sleep(2000);
		   
	   }catch(Exception e)
		{
			e.printStackTrace();
	    }
   }
   
   static void deleteuser()
   {
	   try
	   {
		   oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
		   Thread.sleep(3000);
		   oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
		   Thread.sleep(3000);
		   Alert oAlert=oBrowser.switchTo().alert();
		   String str=oAlert.getText();
		   oAlert.accept();
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
	
   static void closeApplication()
   {
	   try
	   {
		   oBrowser.close();
		   }catch(Exception e)
		{
			e.printStackTrace();
	    }
   }

}
