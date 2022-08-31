package com.yonderland.pages;


import com.yonderland.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.yonderland.base.BasePage.driver;


public class HomePage {


    // Fields: Locators, Webelements,

   // @FindBy(id="header")
    public static WebElement yonderlandLogo;

    // xpath yonderland.com ayacucho logo and menu button
    // /html/body/section[1]/div/div[2]/div/div/a[7]
    @FindBy(xpath="/html/body/section[1]/div/div[2]/div/div/a[7]")
    public static WebElement ayacuchoButton;


    // xpath yonderland.com yuttu logo and menu button
    // /html/body/section[1]/div/div[2]/div/div/a[6]
    // /html/body/section[1]/div/div[2]/div/div/a[6]/img
    @FindBy(xpath="/html/body/section[1]/div/div[2]/div/div/a[6]/img")
    public static WebElement yuttuButton;


    // PageFactory
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    public static String getHomepageTitle(){
        return HelperMethods.doGetPageTitle();
    }
    public static String getHomepageURL(){
        return HelperMethods.getCurrentURL();
    }
    public static String verifyURL(){
        return HelperMethods.getCurrentURL();
    }
    public static void clickYonderlandLogo(){
        HelperMethods.doClick(yonderlandLogo);
    };

    // CLICK AYACUCHO LOGO AND MENU BUTTON
    public static void clickAyacucho() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println(ayacuchoButton.getText());
        HelperMethods.doClick(ayacuchoButton);
    }

    // CLICK YUTTU LOGO AND MENU BUTTON
    public static void clickYuttu() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println(yuttuButton.getText());
        HelperMethods.doClick(yuttuButton);
    }

}
