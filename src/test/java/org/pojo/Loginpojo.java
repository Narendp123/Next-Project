package org.pojo;

import org.baseclass.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Loginpojo extends HelperClass{
	
 public Loginpojo() {
	PageFactory.initElements(driver, this);
}	
    @CacheLookup
	@FindBys({
		@FindBy(id="e.mail"),
		@FindBy(xpath="//input[@type='text']")
	})	
private WebElement txtuser;
    @CacheLookup
    @FindBys({
    	@FindBy(id="pass"),
    	@FindBy(xpath="//input[@type='password']")  	
    })
private WebElement txtpass;
    @CacheLookup
    @FindBy(name="login")
private WebElement btnclick;
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnclick() {
		return btnclick;
	}







}
