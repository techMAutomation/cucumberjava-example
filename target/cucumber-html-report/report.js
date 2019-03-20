$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "name": "Verify that Home page is working fine",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Test that Login page functionality is working correctly with Invalid data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on the SignIn link",
  "keyword": "When "
});
formatter.step({
  "name": "I enter invalid Username \u003cusername\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I enter invalid Password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I submit login details",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "",
        ""
      ]
    },
    {
      "cells": [
        "Hi",
        ""
      ]
    },
    {
      "cells": [
        "Hi",
        "hello"
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
  "name": "I am on the Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_on_the_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test that Login page functionality is working correctly with Invalid data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I click on the SignIn link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_click_on_the_signIn_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter invalid Username ",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_enter_invalid_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter invalid Password ",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_enter_invalid_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit login details",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_submit_login_details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "I am on the Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_on_the_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test that Login page functionality is working correctly with Invalid data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I click on the SignIn link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_click_on_the_signIn_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter invalid Username Hi",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_enter_invalid_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter invalid Password ",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_enter_invalid_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit login details",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_submit_login_details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "I am on the Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_on_the_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test that Login page functionality is working correctly with Invalid data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I click on the SignIn link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_click_on_the_signIn_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter invalid Username Hi",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_enter_invalid_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter invalid Password hello",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_enter_invalid_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit login details",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_submit_login_details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "I am on the Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_on_the_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test that Registration page is opened correctly",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I click on the Join Now link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_click_on_the_signIn_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the Join Now page is opened in the same tab",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_should_see_the_join_now_page_is_opened_in_the_same_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});