package com.example.jetbrainstest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TeamcityPage {
    WebDriver driver;
    private final Logger LOG = LoggerFactory.getLogger(TeamcityPage.class);

    @FindBy(xpath = "//div//div/a/span[contains(text(), 'Get started free')]")
    private WebElement ButtonStartForFree;
    @FindBy(css = "[data-test=\"site-header-profile-action\"]")
    private WebElement AuthorizationIcon;

    public boolean buttonActivityGetStartedFree() {
        LOG.info("Проверка видимости текста GetStartedFree");
        return ButtonStartForFree.isEnabled();
    }

    public void clickAuthorizationIcon() {
        LOG.info("Клик на иконку авторизации");
        AuthorizationIcon.click();
    }

    public TeamcityPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}