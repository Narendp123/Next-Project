@login
Feature:  To Check login functionality of facebook account

Background:
Given     To open facebook through chrome

Scenario: login user name valid and invalid pass
When      user have enter valid user and  password

| username |password | emailid |
| oracle | java | selenium |
| jdk | python | sql |

Then      invalid password message
