package mediaCenterTest;

import baseScript.CommonAPI;
import brLogin.Authenticate;
import waysToWatchPage.waysToWatch;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestWaysToWatch extends CommonAPI {

    @Test
    public void mediaOptions()throws InterruptedException{

        Authenticate authenticate = PageFactory.initElements(driver, Authenticate.class);
        authenticate.signInToNetflix(driver);
        waysToWatch waysToWatch = PageFactory.initElements(driver, waysToWatch.class);
        waysToWatch.operateOnWaysToWatchLink(driver);
    }
}


