package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMOfSnapChat {

	@FindBy(id="username") private WebElement userName;
	@FindBy(id="loginTrigger") private WebElement nextbutt;
	@FindBy(id = "password") private WebElement passWord;
	@FindBy(partialLinkText = "/accounts/password_") private WebElement fpassword;
	@FindBy(xpath = "//button[text()='Phone Number']") private WebElement phno;
	@FindBy(xpath="//a[text()='Use phone number instead']") private WebElement instphoneno;
	
	public POMOfSnapChat(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void username(String username) {
		userName.sendKeys(username);
	}
	public void password(String password) {
		passWord.sendKeys(password);
	}
	public void Next() {
		nextbutt.click();
	}
	public void InstPhonNo() {
		instphoneno.click();
	}
	
	}
	

