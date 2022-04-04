package org.pojo;

import org.baseclass.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgettenPojo extends HelperClass {

	public ForgettenPojo() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//a[text()='Forgotten password?']")
		
private WebElement forgpass;
   
    @FindAll({
    	@FindBy(id="identify_email"),
    	@FindBy(name="email")  	
    })
private WebElement txtbox;
    @FindAll({ 
    		@FindBy(xpath="//button[@value='1']"),
    	    @FindBy(name="did_submit")})
   
private WebElement srch;
	public WebElement getForgpass() {
		return forgpass;
	}
	public WebElement getTxtbox() {
		return txtbox;
	}
	public WebElement getSrch() {
		return srch;
	}	
}
