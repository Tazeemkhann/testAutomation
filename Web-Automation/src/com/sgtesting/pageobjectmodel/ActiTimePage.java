package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver oBrowser)
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
	
	//Delete User1
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement odelete;
	public WebElement deleteu()
	{
		return odelete;
	}
	
	private WebElement userDataLightBox_deleteBtn;
	public WebElement deleteUser1()
	{
		return userDataLightBox_deleteBtn;
	}
 //modify User1
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement muser;
	public WebElement modUser()
	{
		return muser;
	}
	
	private WebElement userDataLightBox_firstNameField;
	public WebElement modname()
	{
		return userDataLightBox_firstNameField;
	}
	
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement savechan;
	public WebElement savemod()
	{
		return savechan;
	}
	
	// Create Customer
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")
	private WebElement cretecus;
	public WebElement custo()
	{
		return cretecus;
	}
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement createcuser1;
	public WebElement custo1()
	{
		return createcuser1;
	}
	
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement createuser2;
	public WebElement custo2()
	{
		return createuser2;
	}
	
	private WebElement customerLightBox_nameField;
	public WebElement custo3()
	{
		return customerLightBox_nameField;
	}
	
	@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
	private WebElement createuser4;
	public WebElement custo4()
	{
		return createuser4;
	}
	
	//Delete Customer
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement customerd1;
	public WebElement dcusto1()
	{
		return customerd1;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement customerd2;
	public WebElement dcusto2()
	{
		return customerd2;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement customerd3;
	public WebElement dcusto3()
	{
		return customerd3;
	}
	
	@FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")
	private WebElement customerd4;
	public WebElement dcusto4()
	{
		return customerd4;
	}
	
	//modify customer
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement modcustomer1;
	public WebElement modcusto1()
	{
		return modcustomer1;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement modcustomer2;
	public WebElement modcusto2()
	{
		return modcustomer2;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[2]/input")
	private WebElement modcustomer3;
	public WebElement modcusto3()
	{
		return modcustomer3;
	}
	
   // create project
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement projectcre1;
	public WebElement projectcreate1()
	{
		return projectcre1;
	}
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement projectcre2;
	public WebElement projectcreate2()
	{
		return projectcre2;
	}
	
	private WebElement projectPopup_projectNameField;
	public WebElement projectcreate3()
	{
		return projectPopup_projectNameField;
	}
	
	@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
	private WebElement projectcre4;
	public WebElement projectcreate4()
	{
		return projectcre4;
	}
	
	// Modify Project
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement projectmod1;
	public WebElement projectmodif1()
	{
		return projectmod1;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement projectmod2;
	public WebElement projectmodif2()
	{
		return projectmod2;
	}
	
	
	//create Task
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement taskCre1;
	public WebElement taskCrete1()
	{
		return taskCre1;
	}
	
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement taskCre2;
	public WebElement taskCrete2()
	{
		return taskCre2;
	}
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
	private WebElement taskCre3;
	public WebElement taskCrete3()
	{
		return taskCre3;
	}
	@FindBy(xpath="//*[@id=\"createTasksPopup_commitBtn\"]/div/span")
	private WebElement taskCre4;
	public WebElement taskCrete4()
	{
		return taskCre4;
	}
	
	// Delete Task
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")
	private WebElement deltas1;
	public WebElement deltask1()
	{
		return deltas1;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement deltas2;
	public WebElement deltask2()
	{
		return deltas2;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
	private WebElement deltas3;
	public WebElement deltask3()
	{
		return deltas3;
	}
	
	private WebElement  taskPanel_deleteConfirm_submitTitle;
	public WebElement deltask4()
	{
		return taskPanel_deleteConfirm_submitTitle;
	}
	
	// Create User2
		
}






