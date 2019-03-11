$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/contactUs.feature");
formatter.feature({
  "name": "Verify that ContactUs page is working as expected",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test that User is able to submit the form Successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "I enter Valid contact \u003cName\u003e \u003cEmail\u003e \u003cMessage\u003e details in the Contact page",
  "keyword": "And "
});
formatter.step({
  "name": "I submit the contact details",
  "keyword": "When "
});
formatter.step({
  "name": "I should see the Contact Page Success message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "Email",
        "Message"
      ]
    },
    {
      "cells": [
        "Hi",
        "hello@test.com",
        "Test Message"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the Contact page",
  "keyword": "Given "
});
formatter.match({
  "location": "ContactUsSteps.I_navigate_to_the_Contact_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the Contact page title",
  "keyword": "And "
});
formatter.match({
  "location": "ContactUsSteps.I_should_see_the_Contact_page_title()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test that User is able to submit the form Successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "I enter Valid contact Hi hello@test.com Test Message details in the Contact page",
  "keyword": "And "
});
formatter.match({
  "location": "ContactUsSteps.I_enter_contact_details_in_the_Contact_page(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit the contact details",
  "keyword": "When "
});
formatter.match({
  "location": "ContactUsSteps.I_submit_the_contact_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the Contact Page Success message",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsSteps.I_should_see_the_Contact_Page_Success_message()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//*[@id\u003d\"___gatsby\"]/div/div[1]/div/div/form/div[4]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Pavanis-MBP.connect\u0027, ip: \u0027fe80:0:0:0:14fd:a50f:9659:5ca2%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.1\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy17.getText(Unknown Source)\n\tat pom.ContactUsPage.verifyContactPageSuccessMessage(ContactUsPage.java:73)\n\tat stepDefinitions.ContactUsSteps.I_should_see_the_Contact_Page_Success_message(ContactUsSteps.java:51)\n\tat ✽.I should see the Contact Page Success message(src/test/resources/features/contactUs.feature:22)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});