package com.example.jetbrainstest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.example.jetbrainstest.tests.BaseTest.getDriver;

public class TeamcityPage {
    WebDriver driver;

    @FindBy(xpath = "//*[contains(text(), 'Get started free')]")
    private WebElement ButtonStartForFree;
    @FindBy(css = "[data-test=\"site-header-profile-action\"]")
    private WebElement AuthorizationIcon;

    public boolean ButtonActivityGetStartedFree (){
        return ButtonStartForFree.isEnabled();
    }

    public void clickAuthorizationIcon(){
        AuthorizationIcon.click();
    }

    public TeamcityPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}