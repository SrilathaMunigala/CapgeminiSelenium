package com.actitime.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.utillibrary.SuperTestScript;

public class Actitime_EditCustomerInfo {
@FindBy(xpath="//input[@value='Delete This Customer']")
	private WebElement deleteThisCustomer;
public Actitime_EditCustomerInfo()
{
	PageFactory.initElements(SuperTestScript.driver, this);
	}
public void clickOnDeleteCustomer()
{
	deleteThisCustomer.click();
	SuperTestScript.driver.switchTo().alert().accept();
	}
}
