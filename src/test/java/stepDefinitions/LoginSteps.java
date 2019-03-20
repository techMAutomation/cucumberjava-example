package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pom.LoginPage;

import static stepDefinitions.Hooks.driver;

public class LoginSteps {

    private LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    @Given("^I am on the Home page$")
    public void i_am_on_the_Home_page() {
        Assert.assertEquals(loginPage.getContactUsText(), "CONTACT US");
    }

    @When("^I click on the ([^\"]*) link$")
    public void i_click_on_the_signIn_link(String linkName) throws InterruptedException {
        if (linkName.equalsIgnoreCase("SignIn"))
            loginPage.clickSignInButton();
        else if (linkName.equalsIgnoreCase("Join Now"))
            loginPage.clickJoinNowButton();
    }

    @And("^I enter invalid Username ([^\"]*)$")
    public void i_enter_invalid_username(String username) {
        loginPage.enterUsername(username);
    }

    @And("^I enter invalid Password ([^\"]*)$")
    public void i_enter_invalid_password(String pwd) {
        loginPage.enterPassword(pwd);
    }

    @And("^I submit login details$")
    public void i_submit_login_details() {
        loginPage.clickLoginSubmitButton();
    }

    // Join Now

    @Then("^I should see the Join Now page is opened in the same tab$")
    public void i_should_see_the_join_now_page_is_opened_in_the_same_tab() {
        System.out.println(" -- current url :: " + driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl().contains("/register"), true, "Check - current url contains register name");
    }
}
