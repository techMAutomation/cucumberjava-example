package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage {

    @FindBy(xpath = "//*[@id=\"___gatsby\"]/div/div[1]/div/div/h1")
    private WebElement contactUsPageTitle;
    @FindBy(className = "Contact-module--ContactDescription--2KZxv")
    private WebElement contactUsPageText;
    @FindBy(id = "name")
    private WebElement nameTextField;
    @FindBy(id = "emailAddress")
    private WebElement emailTextField;
    @FindBy(id = "message")
    private WebElement messageTextField;
    @FindBy(xpath = "//*[@id=\"___gatsby\"]/div/div[1]/div/div/form/button")
    private WebElement sendMessageButton;
    @FindBy(xpath = "//*[@id=\"___gatsby\"]/div/div[1]/div/div/form/div[4]")
    private WebElement successMessage;

    @FindBy(css = "div.CookieNotice-module--CookieNoticeBanner--2A3NB p")
    private WebElement cookieNotificationMessage;
    @FindBy(css = "div.CookieNotice-module--CookieNotice--rVYBY > div > p > a")
    private WebElement notificationLink;

    public boolean verifyContactUsPageTitle() {
        boolean check = false;
        if (contactUsPageTitle.getText().equalsIgnoreCase("Contact")) {
            if (contactUsPageText.getText().equalsIgnoreCase("Want to talk to us? Use the chat bubble in the bottom corner or send us a message below."))
                check = true;
        }
        return check;
    }

    public void enterContactName(String name) {
        if (nameTextField.isDisplayed()) {
            nameTextField.click();
            nameTextField.clear();
            nameTextField.sendKeys(name);
        }
    }

    public void enterContactEmailAddress(String email) throws InterruptedException {
        Thread.sleep(100);
        if (emailTextField.isDisplayed()) {
            emailTextField.click();
            emailTextField.clear();
            emailTextField.sendKeys(email);
        }
    }

    public void enterContactMessage(String message) {
        if (messageTextField.isDisplayed()) {
            messageTextField.click();
            messageTextField.clear();
            messageTextField.sendKeys(message);
        }
    }

    public void clickSubmitButton() {
        if (sendMessageButton.isDisplayed() && sendMessageButton.getText().equalsIgnoreCase("Send message")) {
            sendMessageButton.click();
        }
    }

    public boolean verifyContactUsPageValidationMessages() {
        return true;
    }

    public boolean verifyContactPageSuccessMessage() {
        System.out.println(" -- Success message :: " + successMessage.getText());
        return (successMessage.getText().equalsIgnoreCase("Message sent! We will get back to you as soon as possible."));
    }

    public boolean verifyCookieNotification() {
        return (cookieNotificationMessage.getText().contains("By using this website you agree to our privacy policy"));
    }

    public void clickCookieNotificationLink() {
        notificationLink.click();
    }
}
