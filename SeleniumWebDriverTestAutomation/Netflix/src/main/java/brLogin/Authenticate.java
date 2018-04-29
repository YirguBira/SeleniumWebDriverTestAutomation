package brLogin;

import baseScript.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Authenticate {

    @FindBy(linkText = "Sign In")
    public WebElement loginButton;

    @FindBy(id = "email")
    public WebElement userNameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(css = ".login-button.btn")
    public WebElement clickButton;

    public WebElement getClickButton() {
        return clickButton;
    }

    public void setClickButtonElement(WebElement clickButton) {
        this.clickButton = clickButton;
    }

    public WebElement getUserNameField() {
        return userNameField;
    }

    public void setUserNameField(WebElement userNameField) {
        this.userNameField = userNameField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(WebElement passwordInputField) {
        this.passwordField = passwordField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(WebElement loginButton) {
        this.loginButton = loginButton;
    }

    public void clickOnLogInButton(){
        getLoginButton().click();
    }

    public void typeUserName(){
        getUserNameField().sendKeys("testa6215@gmail.com");
    }
    public void typePassword(){
        getPasswordField().sendKeys("Pass1234 ");
    }
    public void clickOnAuthenticate(){
        getClickButton().click();
    }

    public void signInToNetflix(WebDriver driver)throws InterruptedException{

        clickOnLogInButton();
        typeUserName();
        typePassword();
        clickOnAuthenticate();
    }

}
