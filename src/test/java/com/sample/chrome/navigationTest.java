package com.sample.chrome;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Daniel on 7/15/2014.
 */

public class navigationTest {

    @Test

    public void runChromeDriver() {

        //Create crome driver and replace path with wherver chromedriver.exe is located
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Daniel\\Downloads\\chromedriver.exe");

        //Create a new instance of ChromeDriver
        WebDriver cd = new ChromeDriver();

        cd.navigate().to("https://github.com/DanFerrer");
        Assert.assertTrue("Should include DanFerrer in url", cd.getCurrentUrl().contains("DanFerrer"));

        cd.close(); //close browser
        cd.quit(); //exit ChromeDriver
    }
}
