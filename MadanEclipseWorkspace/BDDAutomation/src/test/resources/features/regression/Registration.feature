Feature: To validate registration functionality

@abcd
Scenario: To validate registration functionality using valid data

Given user starts "chrome" browser
And user luanch app using url "https://adactinhotelapp.com/"
When user clicks link using linktext "New User Register Here"
And user enters details in New User Registration Form 
|ravi3003|ravi123|ravi123|ravikumar|ravi@gmail.com|india|
And user clicks on checkbox using xpath "//input[@name='tnc_box']"
And user clicks on button using xpath "//input[@name='Submit']"



@xyz
Scenario: To validate registration functionality using valid data dataTable with mapping

Given user starts "chrome" browser
And user luanch app using url "https://adactinhotelapp.com/"
When user clicks link using linktext "New User Register Here"
And user enters details in New User Registration Form2
| username | password | confirm password | fullname | email | captcha |
|ravi3003|ravi123|ravi123|ravikumar|ravi@gmail.com|india|
And user clicks on checkbox using xpath "//input[@name='tnc_box']"
And user clicks on button using xpath "//input[@name='Submit']"
