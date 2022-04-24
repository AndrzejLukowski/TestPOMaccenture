package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.MainPage;

public class TestMainPage extends BaseTestWebDriver{

    @Test (priority = 0)
    public void testPageInfo(){
        System.out.println("Test - Main Page - Page Info");
        Reporter.log("TS - Main Page - Page Info");

        Reporter.log("TC - Check current Url");
        String currentUrl = webDriver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.accenture.com/en-en");

        Reporter.log("TC - Check page title");
        String pageTitle = webDriver.getTitle();
        Assert.assertFalse(pageTitle.contains("accenture"));
    }

    @Test (priority = 1)
    public void testSearchFunctionality(){
        System.out.println("Test - Main Page - Search Functionality");
        Reporter.log("TS - Main Page - Search Functionality");

        Reporter.log("TC - Check search func");
        MainPage mainPage = new MainPage(webDriver);
        mainPage.findSearchPhrase("Blockchain");
    }

    @Test
    public void testMainMenu(){
        System.out.println("Test - Main Page - Main Menu");
        Reporter.log("TS - Main Page - Main Menu");

        MainPage mainPage = new MainPage(webDriver);
        Reporter.log("Step 1 : clickMenuInsights");
        mainPage.clickMenuInsights();
        Reporter.log("Step 2 : clickMenuServices");
        mainPage.clickMenuServices();
        Reporter.log("Step 3 : clickMenuIndustries");
        mainPage.clickMenuIndustries();
        Reporter.log("Step 4 : clickMenuCareers");
        mainPage.clickMenuCareers();
        Reporter.log("Step 5 : clickMenuAboutAccenture");
        mainPage.clickMenuAboutAccenture();
    }

    @Test (priority = -1)
    public void testSiteNavigation(){
        System.out.println("Test - Main Page - Site Navigation");
        Reporter.log("TS - Main Page - Site Navigation");

        MainPage mainPage = new MainPage(webDriver);
        Reporter.log("Step 1 : clickSiteNavIdeas");
        mainPage.clickSiteNavIdeas();
        Reporter.log("Step 2 : clickSiteNavJoin");
        mainPage.clickSiteNavJoin();
        Reporter.log("Step 3 : clickSiteNavCase");
        mainPage.clickSiteNavCase();
        Reporter.log("Step 4 : clickSiteNavLeading");
        mainPage.clickSiteNavLeading();
    }

    @Test (priority = 2)
    public void testFooter(){
        System.out.println("Test - Main Page - Footer");
        Reporter.log("TS - Main Page - Footer");

        MainPage mainPage = new MainPage(webDriver);
        Reporter.log("Step 1 : clickFooterAboutUs");
        mainPage.clickFooterAboutUs();
        Reporter.log("Step 2 : clickFooterContactUs");
        mainPage.clickFooterContactUs();
        Reporter.log("Step 3 : clickFooterCareers");
        mainPage.clickFooterCareers();
        Reporter.log("Step 4 : clickFooterLocations");
        mainPage.clickFooterLocations();
    }

    @Test (priority = 2)
    public void testSubscribeFooter(){
        System.out.println("Test - Main Page - Subscribe");
        Reporter.log("TS - Main Page - Subscribe");

        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickSubscribeButton();
        Reporter.log("Step 1 : clickSubscribeButton");
    }

}
