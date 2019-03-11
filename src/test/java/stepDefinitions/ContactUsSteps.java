package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pom.ContactUsPage;

import static stepDefinitions.Hooks.driver;

public class ContactUsSteps {

    private ContactUsPage contactusPage = PageFactory.initElements(driver, ContactUsPage.class);

    @Given("^I navigate to the Contact page$")
    public void I_navigate_to_the_Contact_page() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl().contains("/contact"), true, "Check for Contact page");
        Thread.sleep(200);
    }


    @And("^I should see the Contact page title$")
    public void I_should_see_the_Contact_page_title() {
        Assert.assertEquals(contactusPage.verifyContactUsPageTitle(), true, "Verify Contact Us page title");
    }

    @And("I enter ([^\"]*) contact ([^\"]*) ([^\"]*) ([^\"]*) details in the Contact page$")
    public void I_enter_contact_details_in_the_Contact_page(String validOrInvalid,String name,String email,String message) throws InterruptedException {
        if (validOrInvalid.equalsIgnoreCase("Invalid") || validOrInvalid.equalsIgnoreCase("Valid")) {
            contactusPage.enterContactName(name);
            contactusPage.enterContactEmailAddress(email);
            contactusPage.enterContactMessage(message);
        }
    }

    @When("^I submit the contact details$")
    public void I_submit_the_contact_details() {
        contactusPage.clickSubmitButton();
    }

    @Then("^I should see the Contact Page Validation message ([^\"]*)$")
    public void I_should_see_the_Contact_Page_Validation_message(String type) {
        Assert.assertEquals(contactusPage.verifyContactUsPageValidationMessages(), true, "Check - validation messages");
    }

    @Then("^I should see the Contact Page Success message$")
    public void I_should_see_the_Contact_Page_Success_message() {
        Assert.assertEquals(contactusPage.verifyContactPageSuccessMessage(), true, "Check - Success message");
    }

    @Then("^I should see the Cookie Notification message$")
    public void I_should_see_the_Cookie_Notification_message() {
        Assert.assertEquals(contactusPage.verifyCookieNotification(), true, "Check - Cookie Notification");
    }

    @When("^I click on the Privacy Policy link$")
    public void I_click_on_the_Privacy_Policy_link() {
        contactusPage.clickCookieNotificationLink();
    }

    @Then("^the Privacy Policy page should be opened in the same tab$")
    public void the_Privacy_Policy_page_should_be_opened_in_the_same_tab() {
        Assert.assertEquals(driver.getCurrentUrl().contains("/privacy-policy"), true, "Check - current url contains privacy policy");
    }
}
