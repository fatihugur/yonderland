Feature: Home Page Test

  Scenario: Test Home Page URL
    Given User is on the home page
    When get home page url
    And verify if url is expected
    And get home page title
    And verify if title is expected
    Then User click bolcomLogo button
    And Test Ayacucho logo page button
    Then User sees Ayacucho page
    And Test Jutto logo page button
    Then User sees Jutto page




 # YONDERLAND UI Test Checking Lijst
    # HOMEPAGE TEST -- FIRST
#1. Open de site https://www.yonderland.com/ test home page url, home page title, click and yonderland hero logo and controller als de logo aanwezig is
#2. Controleer Ayacucho page and "Ayacucho logo" aanwezig is en click het
#3. Controleer Jutto page and  "Jutto logo" aanwezig is en click het
# SNOWANDROCK PAGE TEST -- SECOND
#4. Open de pagina snowandrock.com
#5. Controleer als de 3 menu buttons en hun links aanwezig zijn kids, snowboard, ski
#6. Zie dat het stores button and page aanwezig is
#7. Druk dan op explore more button
#8. zie dat deze page aanwezig is