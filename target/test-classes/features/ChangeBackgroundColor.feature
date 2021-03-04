@BackgroundColorChange
Feature: Application Background Color Change


Background:
    Given  User is on the techfios page
 
@Scenario1   
Scenario: User should be able to find the "Set SkyBlue Background" button exists
When I click on the SetSkyBlueBackground button 
Then the background color will change to sky blue

  
@Scenario2
Scenario: User should be able to find the "Set White Background" button exists
When I click on the SetWhiteBackground button 
Then the background color will change to white