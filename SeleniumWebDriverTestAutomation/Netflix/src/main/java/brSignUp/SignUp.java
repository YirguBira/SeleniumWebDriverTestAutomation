package brSignUp;
import baseScript.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp {

    @FindBy(css = ".cta-wrapper .cta-link-wrapper .btn, .cta-wrapper .outline-btn")
    public WebElement joinFreeForAmonthButton;

    @FindBy(css = ".nf-btn.nf-btn-oversize")
    public WebElement seePlanButton;
    
    @FindBy(css = ".Tappable-inactive cell selected pt-header-with-border")
    public WebElement basicPlanButton;

    @FindBy(name = "button \"CONTINUE\"")
    public WebElement continueButton;

    @FindBy(css = ".selectionLabel")
    public WebElement creditCardButton;

    @FindBy(css = "#id_firstName")
    public WebElement firstNameField;

    @FindBy(css = "#id_lastName")
    public WebElement lastNameField;

    @FindBy(css = "#id_creditZipcode")
    public WebElement zipcodeField;

    @FindBy(css = "#id_creditCardNumber")
    public WebElement cardNumberField;

    @FindBy(css = "#id_creditExpirationMonth")
    public WebElement cardExpireDateField;

    @FindBy(css = "#id_creditCardSecurityCode")
    public WebElement securityCodeField;

    @FindBy(css = ".nf-btn nf-btn-primary nf-btn-solid nf-btn-align-undefined nf-btn-oversize")
    public WebElement startMembershipButton;

    public WebElement getJoinFreeForAmonthButton() {
        return joinFreeForAmonthButton;
    }

    public void setJoinFreeForAmonthButton(WebElement joinFreeForAmonthButton) {
        this.joinFreeForAmonthButton = joinFreeForAmonthButton;
    }

    public WebElement getSeePlanButton() {
        return seePlanButton;
    }

    public void setSeePlanButton(WebElement seePlanButton) { this.seePlanButton = seePlanButton; }

    public WebElement getBasicPlanButton() {
        return basicPlanButton;
    }

    public void setBasicPlanButton(WebElement basicPlanButton) {
        this.basicPlanButton = basicPlanButton;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public void setContinueButton(WebElement continueButton) {
        this.continueButton = continueButton;
    }

    public WebElement getCreditCardButton() {
        return creditCardButton;
    }

    public void setCreditCardButton(WebElement creditCardButton) {
        this.creditCardButton = creditCardButton;
    }

    public WebElement getFirstNameField() {
        return firstNameField;
    }

    public void setFirstNameField(WebElement firstNameField) {
        this.firstNameField = firstNameField;
    }

    public WebElement getLastNameField() {
        return lastNameField;
    }

    public void setLastNameField(WebElement lastNameField) {
        this.lastNameField = lastNameField;
    }

    public WebElement getCardNumberField() {
        return cardNumberField;
    }

    public WebElement getZipcodeField() { return zipcodeField; }

    public void setZipcodeField(WebElement zipcodeField) { this.zipcodeField = zipcodeField; }

    public void setCardNumberField(WebElement cardNumberField) {
        this.cardNumberField = cardNumberField;
    }

    public WebElement getCardExpireDateField() {
        return cardExpireDateField;
    }

    public void setCardExpireDateField(WebElement cardExpireDateField) { this.cardExpireDateField = cardExpireDateField; }

    public WebElement getSecurityCodeField() {
        return securityCodeField;
    }

    public void setSecurityCodeField(WebElement securityCodeField) {
        this.securityCodeField = securityCodeField;
    }

    public WebElement getStartMembershipButton() {
        return startMembershipButton;
    }

    public void setStartMembershipButton(WebElement startMembershipButton) {
        this.startMembershipButton = startMembershipButton;
    }

    public void clickOnJoinFreeForAmonthButton(){
        getJoinFreeForAmonthButton().click();
    }

    public void clickOnSeePlanButton(){
        getSeePlanButton().click();
    }
    public void clickOnbasicPlanButton(){
        getBasicPlanButton().click();}

    public void clickOnContinueButton(){
        getContinueButton().click();
    }
    public void clickOnCreditCardButton(){
        getCreditCardButton().click();
    }
    public void enterFirstName(){
        getFirstNameField().sendKeys("Chloe");
    }
    public void enterLastName(){
        getLastNameField().sendKeys("Mark");
    }
    public void enterZipcode(){
        getZipcodeField().sendKeys("12345");
    }
    public void enterCardNumber(){
        getCardNumberField().sendKeys("123456789012");
    }
    public void enterCardExpireDate(){
        getCardExpireDateField().sendKeys("04/21");
    }
    public void enterSecurityCode(){
        getSecurityCodeField().sendKeys("303");
    }
    public void clickOnStartMembershipButton(){
        getStartMembershipButton().click();
    }

    public void signUpForNetflixAccount(WebDriver driver)throws InterruptedException{
        clickOnJoinFreeForAmonthButton();
        clickOnSeePlanButton();
        clickOnbasicPlanButton();
        clickOnbasicPlanButton();
        clickOnContinueButton();
        clickOnCreditCardButton();
        enterFirstName();
        enterLastName();
        enterZipcode();
        enterCardNumber();
        enterCardExpireDate();
        enterSecurityCode();
        clickOnStartMembershipButton();
    }
}
