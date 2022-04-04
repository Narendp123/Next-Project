$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:login.feature");
formatter.feature({
  "name": "To Check login functionality of facebook account",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
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
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To open facebook through chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "Definition.to_open_facebook_through_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "login user name valid and invalid pass",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user have enter valid user and  password",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "emailid"
      ]
    },
    {
      "cells": [
        "oracle",
        "java",
        "selenium"
      ]
    },
    {
      "cells": [
        "jdk",
        "python",
        "sql"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Definition.user_have_enter_valid_user_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "invalid password message",
  "keyword": "Then "
});
formatter.match({
  "location": "Definition.invalid_password_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});