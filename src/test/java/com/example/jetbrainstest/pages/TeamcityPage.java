package com.example.jetbrainstest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeamcityPage {
    WebDriver driver;

    @FindBy(xpath = "//*[contains(text(), 'Get started free')]")
    private static WebElement ButtonStartForFree;
    @FindBy(css = "[data-test=\"site-header-profile-action\"]")
    private WebElement AuthorizationIcon;


    public static boolean ButtonActivityGetStartedFree() {
        return ButtonStartForFree.isEnabled();
    }

    public TeamcityPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}