Feature: To validate login functionality of Adactin Hotel App

Background: preconditions steps
Given user starts "chrome" browser
And user luanch app using url "https://adactinhotelapp.com/"


@wip3003 @smoke @regression
Scenario: To validate login using valid credentials

When user enters text "MadanReddy" into textbox using xpath "//input[@name='username']"
And user enters text "Madan123" into textbox using xpath "//input[@name='password']"
And user clicks on button using xpath "//input[@name='login']"
Then user verify the title to be "Adactin.com - Search Hotel"


@regression
Scenario Outline: To validate login using Invalid credentials

When user enters text '<username>' into textbox using xpath "//input[@name='username']"
And user enters text '<password>' into textbox using xpath "//input[@name='password']"
And user clicks on button using xpath "//input[@name='login']"
Then user verify the title to be '<expectedTitle>'

Examples:
| username |password |expectedTitle |
| MadanReddy | Madan111 | Adactin.com - Hotel Reservation System |
| Madan | Madan123 | Adactin.com - Hotel Reservation System |
| Madan | Madan111 | Adactin.com - Hotel Reservation System |
