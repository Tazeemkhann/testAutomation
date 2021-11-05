package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePageforEtE {
	public ActiTimePageforEtE(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	// User Name WebElement
	private WebElement username;
	public WebElement getusername()
	{
		return username;
		
	}
	
	// Password WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	// Login button WebElement
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement ologin;
	public WebElement getlogin()
	{
		return ologin;
	}
	
	// minimize flyOut Window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindows()
	{
		return gettingStartedShortcutsPanelId;
	}

	//logout link
	@FindBy(linkText="Logout")
	private WebElement ologout;
	public WebElement getlogout()
	{
		return ologout;
 	}
	
	// Create user
	
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement ousers;
	public  WebElement Users1()
	{
		return ousers;
	}
	
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement addUser1;
	public WebElement Useradd1()
	{
		return addUser1;
	}
	
	private WebElement firstName;
	public WebElement sendfirstname1()
	{
		return firstName;
	}
	
	private WebElement lastName;
	public WebElement sendlastName1()
	{
		return lastName;
	}
	
	private WebElement email;
	public WebElement email1()
	{
		return email;
	}
	
	private WebElement userDataLightBox_usernameField;
	public WebElement username1()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement userDataLightBox_passwordField;
	public WebElement Password1()
	{
		return userDataLightBox_passwordField;
	}
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement passwordCopy1()
	{
		return userDataLightBox_passwordCopyField;
	}
	
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement oCreateuser;
	public WebElement Createuser1()
	{
		return oCreateuser;
	}
	
 
	
	// Login As User123
	@FindBy(xpath="//*[@id=\'username\']")
	private WebElement loginasu1;
	public WebElement loginasuser1()
	{
		return loginasu1;
	}
	
	@FindBy(xpath="//*[@id=\'loginFormContainer\']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
	private WebElement loginasu2;
	public WebElement loginasuser2()
	{
		return loginasu2;
	}
	
	@FindBy(xpath="//*[@id=\'loginButton\']/div")
	private WebElement loginasu3;
	public WebElement loginasuser3()
	{
		return loginasu2;
	}
	
	@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
	private WebElement loginasus1;
	public WebElement loginasuse11()
	{
		return loginasus1;
	}
	
	
		
	// Modify password
	
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")
	private WebElement modpas1;
	public WebElement modpass1()
	{
		return modpas1;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
	private WebElement usermod1;
	public WebElement usermodi1()
	{
		return usermod1;
	}
	
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
	private WebElement modpas2;
	public WebElement modpass2()
	{
		return modpas2;
	}
	
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
	private WebElement modpas3;
	public WebElement modpass3()
	{
		return modpas3;
	}
	
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement modpas4;
	public WebElement modpass4()
	{
		return modpas4;
	}
	
	
	
	
	//Users123Extra
	
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
    private WebElement usermod2;
	public WebElement usermodi2()
	{
		return usermod2;
	}
	
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement usermod3;
	public WebElement  usermodi3()
	{
		return usermod3;
	}
	
	
	//Delete User1,2 and 3
	
	
	
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")
	private WebElement odelete;
	public WebElement deleteu()
	{
		return modpas1;
	}

	//user1
		@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
		private WebElement odelete1;
		public WebElement deleteu1()
		{
			return odelete;
		}
		
	//user2
		@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement odelete2;
		public WebElement deleteu2()
		{
			return odelete;
		}
		
	//user3
		@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement odelete3;
		public WebElement deleteu3()
		{
			return odelete;
		}
		
		
		private WebElement userDataLightBox_deleteBtn;
		public WebElement deleteUser1()
		{
			return userDataLightBox_deleteBtn;
		}

} 





