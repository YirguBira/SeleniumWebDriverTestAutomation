package brSignIn;

import baseScript.CommonAPI;
import brLogin.Authenticate;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAuthenticate extends CommonAPI  {

    @Test
    public void logIn()throws InterruptedException {
        Authenticate authenticate = PageFactory.initElements(driver, Authenticate.class);
        authenticate.signInToNetflix(driver);
    }
}
