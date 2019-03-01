package com.actitime.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.actitime.utillibrary.SuperTestScript;

public class Actitime_AddNewProject {
@FindBy(name="customerId")
private WebElement selectCustomerdd;
@FindBy(name="name")
private WebElement projectName;
@FindBy(xpath="//input[@value='Create Project']")
private WebElement createProject;
public Actitime_AddNewProject() 
{
PageFactory.initElements(SuperTestScript.driver, this);	
}
public void SelectCustomerDropDown()
{
	Select s1=new Select(selectCustomerdd);
	s1.selectByVisibleText("vivek malyala");
	}
public void enterProjectName(String projectname)
{
	projectName.sendKeys(projectname);
	}
public void clickOnCreateProject()
{
	createProject.click();
	}

}
