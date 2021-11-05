package com.sgtesting.testscripts;
		

		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Demo1 {

			public static WebDriver oBrowser=null;
			public static void main(String[] args) {
				launchBrowser();
				navigate();
				closeApplication();
			}
			
			static void launchBrowser()
			{
				try
				{
					System.setProperty("webdriver.chrome.driver", "F:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
					oBrowser.get("http://localhost:82/user/submit_tt.do");
					Thread.sleep(4000);
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
