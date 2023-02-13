package ThirdChaptor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPageObjectModel {
	
	//Declaration
	@FindBy(id="email") private WebElement usernameTF;
	@FindBy(id="pass") private WebElement passwordTF;
	@FindBy(name="login") private WebElement loginButton;
	@FindBy(linkText="Forgotten password?") private WebElement forgottenpasswordLink;
	@FindBy(linkText="Create new account") private WebElement creatNewAccountLink;
	@FindBy(linkText="Create a Page") private WebElement createAPageLink;
	
	
	//Initialization
	public FacebookLoginPageObjectModel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization 
	
	public void setUserName(String username) {
		usernameTF.sendKeys(username);
	}
	
	public void setPassword(String password) {
		passwordTF.sendKeys(password);
	}
	public void clickLoginButton() {
		loginButton.click();
	}
	public void clickForgetPasswordLink() {
		forgottenpasswordLink.click();
	}
	public void CreatNewAccountLink() {
		creatNewAccountLink.click();
	}
	public void createAPageLink() {
		createAPageLink.click();
	}
	

}
