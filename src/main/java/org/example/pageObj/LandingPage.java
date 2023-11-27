package org.example.pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    WebDriver driver;

    private final By siteLogo = By.xpath("//*[@class='tools-qa-header__logo']");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        System.out.println("Get 'Landing Page' title.");
        return driver.getTitle();
    }

    public boolean isTitleLogoDisplayed() {
        System.out.println("Is logo displayed on 'Landing Page'.");
        return driver.findElement(siteLogo).isDisplayed();
    }
}
