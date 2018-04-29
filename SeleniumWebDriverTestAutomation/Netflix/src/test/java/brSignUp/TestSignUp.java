package brSignUp;

import baseScript.CommonAPI;
import brSignUp.SignUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSignUp extends CommonAPI {

    @Test
    public void signUpForNetflix()throws InterruptedException{

        SignUp signUp = PageFactory.initElements(driver, SignUp.class);
        signUp.signUpForNetflixAccount(driver);
    }
}

