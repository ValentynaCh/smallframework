package org.example.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

    private static final String BASE_URL = "https://www.toolsqa.com/";

    public static WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        ChromeDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.get(BASE_URL);
        return chromeDriver;
    }
}
