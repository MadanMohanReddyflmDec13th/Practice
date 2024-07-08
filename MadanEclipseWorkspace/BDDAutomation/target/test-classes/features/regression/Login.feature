Feature: To validate login functionality of Adactin Hotel App

@wip3003
Scenario: To validate login using valid credentials

Given user starts "chrome" browser
And user luanch app using url "https://adactinhotelapp.com/"
When user enters text "MadanReddy" into textbox using xpath "//input[@name='username']"
And user enters text "Madan123" into textbox using xpath "//input[@name='password']"
And user clicks on button using xpath "//input[@name='login']"
Then user verify the title to be "Adactin.com - Search Hotel"


@smoke
Scenario Outline: To validate login using Invalid credentials

Given user starts "chrome" browser
And user luanch app using url "https://adactinhotelapp.com/"
When user enters text '<username>' into textbox using xpath "//input[@name='username']"
And user enters text '<password>' into textbox using xpath "//input[@name='password']"
And user clicks on button using xpath "//input[@name='login']"
Then user verify the title to be '<expectedTitle>'

Examples:
| username |password |expectedTitle |
| MadanReddy | Madan111 | Adactin.com - Hotel Reservation System |
| Madan | Madan123 | Adactin.com - Hotel Reservation System |
| Madan | Madan111 | Adactin.com - Hotel Reservation System |
