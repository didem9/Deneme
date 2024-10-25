package org.etiya.tests;


import org.etiya.pages.LoginPage;
import org.etiya.utils.ConfigReader;
import org.etiya.utils.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class LoginTest {
    LoginPage loginPage;

    @BeforeEach
    public void setUp() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        loginPage = new LoginPage();
    }

    @Test
    public void testLogin() {
        loginPage.enterUsername(ConfigReader.getProperty("validUsername"));
        loginPage.enterPassword(ConfigReader.getProperty("validPassword"));
        loginPage.clickLogin();
    }

    @AfterEach
    public void tearDown() {
        Driver.quitDriver();
    }
}
