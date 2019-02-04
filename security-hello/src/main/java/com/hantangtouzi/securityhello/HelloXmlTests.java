package com.hantangtouzi.securityhello;

import com.hantangtouzi.securityhello.page.HomePage;
import com.hantangtouzi.securityhello.page.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * @author WilliamChang.
 * Created on 2019-02-02 00:47:10
 */

public class HelloXmlTests {
    private WebDriver driver;

    private int port;

    @Before
    public void setup() {
        // this.port = Integer.parseInt(System.getProperty("app.httpPort"));
        this.port = Integer.parseInt(System.getProperty("8080"));
        this.driver = new HtmlUnitDriver();
    }

    @After
    public void tearDown() {
        this.driver.quit();
    }

    @Test
    public void accessHomePageWithUnauthenticatedUserSendsToLoginPage() {
        final LoginPage loginPage = HomePage.to(this.driver, this.port);
        loginPage.assertAt();
    }

    @Test
    public void authenticatedUserIsSentToOriginalPage() {
        final HomePage homePage = HomePage.to(this.driver, this.port)
                .loginForm()
                .username("user")
                .password("password")
                .submit();
        homePage
                .assertAt()
                .andTheUserNameIsDisplayed();
    }

    @Test
    public void authenticatedUserLogsOut() {
        LoginPage loginPage = HomePage.to(this.driver, this.port)
                .loginForm()
                .username("user")
                .password("password")
                .submit()
                .logout();
        loginPage.assertAt();

        loginPage = HomePage.to(this.driver, this.port);
        loginPage.assertAt();
    }
}
