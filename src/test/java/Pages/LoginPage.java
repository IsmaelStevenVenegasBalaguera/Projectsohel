package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.commonMethods;

public class LoginPage extends commonMethods {
    @FindBy(id="txtUsername")
    public WebElement usernameTextField;

    @FindBy(id="txtPassword")
    public WebElement passwordTextField;
    @FindBy(id="btnLogin")
    public WebElement loginBtn;

    public LoginPage (){
        PageFactory.initElements(driver,this);
    }
}
