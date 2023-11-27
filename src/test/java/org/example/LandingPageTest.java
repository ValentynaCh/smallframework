package org.example;

import org.example.pageObj.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingPageTest extends BaseTest {

    @Test(description = "Verify test title.", groups = "smoke")
    public void titleTest() {
        String testTitle = "Tools QA";
        LandingPage landingPage = new LandingPage(driver);
        Assert.assertEquals(landingPage.getTitle(), testTitle);
    }

    @Test(description = "Verify test title.", groups = "regression")
    public void logoTest() {
        LandingPage landingPage = new LandingPage(driver);
        Assert.assertTrue(landingPage.isTitleLogoDisplayed());
    }
}
