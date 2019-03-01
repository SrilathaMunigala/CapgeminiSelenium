package com.actitime.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.utillibrary.SuperTestScript;

public class ActiveProjects_Customers {
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addNewCustomer;
	@FindBy(xpath="//input[@value='Add New Project']")
	private WebElement addNewProject;
	@FindBy(className="successmsg")
	private WebElement successMsg;
	
	public ActiveProjects_Customers()
	{
		PageFactory.initElements(SuperTestScript.driver,this);
	}
	public void addNewCustomer()
	{
		addNewCustomer.click();
	}
	public String getSuccessMsgOfCreatingCustomer()
	{
		String msg=successMsg.getText();
		return msg;
	}
	public void selectCustomer(String customerName)
	{
		SuperTestScript.driver.findElement(By.linkText(customerName)).click();
	}
	public String getSuccessMsgofDeletingCustomer()
	{
	String msg=successMsg.getText();
	return msg;
	}
	public void clickOnAddNewProject()
	{
		addNewProject.click();
	}
	public String getSuccessMsgOfAddnewProject()
	{
		String data=successMsg.getText();
	return data;	
	}
}
