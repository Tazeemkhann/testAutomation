package com.sgtesting.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;






public class Absoluterelative {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		//absolute();
		// relativeXPathUsingTagNameAlone();
		//relativeXPathUsingTagNameWithIndex();
		//relativeXPathUsingTagNameWithAttributeNameAndValue();
		//relativeXPathUsingAttributeNameValueCombination();
		//relativeXPathUsingAttributeValueAlone();
		//relativeXPathUsingMultipleAttributeNameAndValue();
		//MultipleAttributeNameUsingAndOperator();
		//MultipleAttributeNameAndUsingOrOperator();
		//partialMatchingOfAttributeValue();
		// tagNameWithAttributeName_StaleElement();
		//tagNameWithAttributeName_displayslinkNames();
		//tagNameWiyhAttributeName_clickonParticularLink();
		//tagNmaeWithAttributeName_PartialText();
		tagNameWithAttributeName_StaleElement();
		
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe" );
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
			oBrowser.get("file:///C:/Users/TAZEEM/AppData/Local/Temp/Rar$EXa9992.15585/XPATH_26th_OCT_2021/Sample.html");
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
	}
	static void absolute()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
	}
	
	static void relativeXPathUsingTagNameAlone()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("Demouser2");
	}

	static void relativeXPathUsingTagNameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("Demo3");
	}
	
	static void relativeXPathUsingTagNameWithAttributeNameAndValue()
	{
		try
		{
		oBrowser.findElement(By.xpath("//input[@value ='Submit']")).click();
		Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
	}
	static void relativeXPathUsingAttributeNameValueCombination()
	{
		try
	{
		oBrowser.findElement(By.xpath("//*[@name='submit1btn1']")).click();
		Thread.sleep(3000);
	}catch(Exception e)
	{
		e.printStackTrace();
    }
}
	static void relativeXPathUsingAttributeValueAlone()
	{
		oBrowser.findElement(By.xpath("//*[@*='submit1btn1']")).click();
		
	}
	
	static void relativeXPathUsingMultipleAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit'][@type='button']")).click();
	}
	
	static void MultipleAttributeNameUsingAndOperator()
	{
		oBrowser.findElement(By.xpath("//input[@value=\'Submit\' and @type=\'button\']")).click();
	}
	
	static void MultipleAttributeNameAndUsingOrOperator()
	{
		oBrowser.findElement(By.xpath("//input[@value=\'Submit\' or @class=\'submit1btn1\']")).click();
	}
	
	static void partialMatchingOfAttributeValue()
	{
		//oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1')]")).click();
		oBrowser.findElement(By.xpath("//input[contains(@id,'submit')]")).click();
	}
	
	static void tagNameWithAttributeName_StaleElement()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("# of links:"+olinks.size());
		
	}
	
	static void tagNameWithAttributeName_displayslinkNames()
	{
		List <WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			System.out.println(content);
		}
	}
	static void tagNameWiyhAttributeName_clickonParticularLink()
	{
		List <WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		olinks.get(2).click();
	}
	 
	static void tagNmaeWithAttributeName_PartialText()
	{
		List <WebElement> olinks=oBrowser.findElements(By.xpath(("//a[@href]")));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			if(content.endsWith("Tool"))
			{
				link.click();
				break;
			}
		}
		
	}
	
	static void tagNameWithAttributeName_StaleElements()
	{
		List<WebElement>olinks=oBrowser.findElements(By.xpath("//@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			if(content.startsWith("Selenium"));
			{
				link.click();
			}
		}
	}
}

