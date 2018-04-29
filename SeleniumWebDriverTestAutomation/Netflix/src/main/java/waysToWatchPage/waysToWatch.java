package waysToWatchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class waysToWatch {

    @FindBy(linkText = "Ways to Watch")
    WebElement waysToWatch;


    @FindBy(css = "li.hdtvs-icon.active")
    WebElement hdtv;

    @FindBy(css = "")
    WebElement TVDescriptionsContainer;

    public WebElement getTVDescriptionsContainer() {
        return TVDescriptionsContainer;
    }
    public void setTVDescriptionsContainer(WebElement TVDescriptionsContainer) {
        this.TVDescriptionsContainer = TVDescriptionsContainer;
    }






    public WebElement getHdtv() {
        return hdtv;
    }

    public void setHdtv(WebElement hdtv) {
        this.hdtv = hdtv;
    }

    public WebElement getWaysToWatch() {
        return waysToWatch;
    }
    public void setWaysToWatch(WebElement getWaysToWatch) {
        this.waysToWatch = getWaysToWatch;
    }
    public void clickOnWaysToWatchLink() {
        getWaysToWatch().click();
    }
    public void clickOnHdtvLink() {
        getHdtv().click();
    }
    public void TVDescriptionsContainerElements(){
        getTVDescriptionsContainer();
    }
    public void operateOnWaysToWatchLink(WebDriver driver)throws InterruptedException{

        clickOnWaysToWatchLink();
        clickOnHdtvLink();
        getTVDescriptionsContainer();

    }
}