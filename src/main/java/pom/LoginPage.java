package pom;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(css = "a.btn.btn-primary.btn-inverse.btn-sm.btn-ajax-login")
    private WebElement signInButton;
    @FindBy(id = "username")
    private WebElement usernameTextField;
    @FindBy(id = "password")
    private WebElement passwordTextField;
    @FindBy(css = "button.btn.btn-primary.ajaxLogIn")
    private WebElement loginSubmitButton;

    @FindBy(css = "a[href='/register']")
    private WebElement joinNowButton;

    @FindBy(css = "a[href='/contact']")
    private WebElement contactUsButton;

    private Logger log = Logger.getLogger(LoginPage.class.getName());

    public String getContactUsText() {
        return contactUsButton.getText();
    }

    public void clickSignInButton() throws InterruptedException {
        if (signInButton.getText().equalsIgnoreCase("SIGN IN")) {
            signInButton.click();
            log.info(" -- Clicked on 'SignIn' button -- ");
            Thread.sleep(500);
        }
    }

    public void enterUsername(String username) {
        if (usernameTextField.isDisplayed()) {
            usernameTextField.click();
            usernameTextField.clear();
            usernameTextField.sendKeys(username);
            log.info(" -- Entered Username {} " + username);
        }
    }

    public void enterPassword(String pwd) {
        if (passwordTextField.isDisplayed()) {
            passwordTextField.click();
            passwordTextField.clear();
            passwordTextField.sendKeys(pwd);
            log.info(" -- Entered Password {} " + pwd);
        }
    }

    public void clickLoginSubmitButton() {
        log.info(loginSubmitButton.getText());
        if (loginSubmitButton.getText().equalsIgnoreCase("Log-In")) {
            loginSubmitButton.click();
            log.info(" -- Clicked on 'Log-In' submit button -- ");
        }
    }

    // Join Now Button

    public void clickJoinNowButton() {
        if (joinNowButton.getText().equalsIgnoreCase("JOIN NOW")) {
            joinNowButton.click();
            log.info(" -- Clicked on 'JOIN NOW' button -- ");
        }
    }
}
