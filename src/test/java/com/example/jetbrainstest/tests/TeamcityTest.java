package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.MyExtension;
import com.example.jetbrainstest.pages.AppCodePage;
import com.example.jetbrainstest.pages.TeamcityPage;
import com.example.jetbrainstest.pages.TeamcityPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.URL;

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
        TeamcityPage TeamcityPage = new TeamcityPage(getDriver());
    }

    @Test
    @DisplayName("Проверка, что кнопка Get started free активна")
    public void buttonGetStartedFreeActiv() {
        assertTrue(TeamcityPage.ButtonActivityGetStartedFree(), "Кнопка не активна");
    }

}
