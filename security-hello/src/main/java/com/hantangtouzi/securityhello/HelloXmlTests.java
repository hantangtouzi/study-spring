package com.hantangtouzi.securityhello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * @author WilliamChang.
 * Created on 2019-02-02 00:47:10
 */

public class HelloXmlTests {
    private WebDriver driver;

    private int port;

    public void setup() {
        this.port = Integer.parseInt(System.getProperty("app.httpPort"));
        this.driver = new HtmlUnitDriver();
    }

    public void tearDown() {
        this.driver.quit();
    }


}
