package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.MyExtension;
import com.example.jetbrainstest.pages.TeamcityPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MyExtension.class)
public class TeamcityTest extends BaseTest {

    private TeamcityPage teamcityPage;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/teamcity/");
        teamcityPage = new TeamcityPage(getDriver());
    }

    @Test
    @DisplayName("Проверка, что кнопка Get started free активна")
    public void buttonGetStartedFreeActiv() {
        assertTrue(teamcityPage.buttonActivityGetStartedFree(), "Кнопка не активна");
    }

    @Test
    @DisplayName("Переход на страницу авторизации по иконке")
    public void switchoAuthorization() {
        teamcityPage.clickAuthorizationIcon();
        assertEquals("https://account.jetbrains.com/login", getDriver().getCurrentUrl());
    }
}