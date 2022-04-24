package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    WebDriver webDriver;

    public MainPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    // FindBy elements on page

    // search
    @FindBy(how= How.CLASS_NAME, using="ion-ios-search") WebElement searchIcon;
    @FindBy(how=How.ID, using = "search-form-label") WebElement searchField;
    @FindBy(className = "search-text") WebElement searchFieldButton;

    // main menu
    @FindBy(xpath = "//*[@id=\"navigation-menu\"]/div[1]/div[1]/span") WebElement menuInsights;
    @FindBy(xpath = "//*[@id=\"navigation-menu\"]/div[2]/div[1]/span") WebElement menuServices;
    @FindBy(xpath = "//*[@id=\"navigation-menu\"]/div[3]/div[1]/span") WebElement menuIndustries;
    @FindBy(xpath = "//*[@id=\"navigation-menu\"]/div[4]/div[1]/span") WebElement menuCareers;
    @FindBy(xpath = "//*[@id=\"navigation-menu\"]/div[5]/div[1]/span") WebElement menuAboutAccenture;

    // site navigation panel
    @FindBy(xpath = "//*[@id=\"brandpurpose-main\"]/div[1]/div/div[2]") WebElement siteNavIdeas;
    @FindBy(xpath = "//*[@id=\"brandpurpose-main\"]/div[1]/div/div[3]") WebElement siteNavJoin;
    @FindBy(xpath = "//*[@id=\"brandpurpose-main\"]/div[1]/div/div[4]") WebElement siteNavCase;
    @FindBy(xpath = "//*[@id=\"brandpurpose-main\"]/div[1]/div/div[5]") WebElement siteNavLeading;

    // footer
    @FindBy(xpath = "//*[@id=\"footer-block\"]/div/div/div/div/div[2]/div[1]/div/div[1]/div/a") WebElement footerAboutUs;
    @FindBy(xpath = "//*[@id=\"footer-block\"]/div/div/div/div/div[4]/div[1]/div/div[2]/div/a") WebElement footerContactUs;
    @FindBy(xpath = "//*[@id=\"footer-block\"]/div/div/div/div/div[4]/div[1]/div/div[3]/div/a") WebElement footerCareers;
    @FindBy(xpath = "//*[@id=\"footer-block\"]/div/div/div/div/div[4]/div[1]/div/div[4]/div/a") WebElement footerLocations;

    // subscribe
    @FindBy(className="bp-cta-footer-circle") WebElement subscribeButton;

    // All methods on Main page

    // search
    public void clickSearchIcon() {searchIcon.click();}
    public void setNewSearchPhrase(String searchPhrase){
        searchField.sendKeys(searchPhrase);
    }
    public void clickSearchFieldButton(){searchFieldButton.click();}

    public void findSearchPhrase (String searchPhrase){
        searchIcon.click();
        searchField.sendKeys(searchPhrase);
        searchFieldButton.click();
    }

    // main menu
    public void clickMenuInsights() { menuInsights.click(); }
    public void clickMenuServices() {
        menuServices.click();
    }
    public void clickMenuIndustries() {
        menuIndustries.click();
    }
    public void clickMenuCareers() {
        menuCareers.click();
    }
    public void clickMenuAboutAccenture() {
        menuAboutAccenture.click();
    }

    // site navigation panel
    public void clickSiteNavIdeas() { siteNavIdeas.click(); }
    public void clickSiteNavJoin() { siteNavJoin.click(); }
    public void clickSiteNavCase() { siteNavCase.click(); }
    public void clickSiteNavLeading() { siteNavLeading.click(); }

    // footer
    public void clickFooterAboutUs() { footerAboutUs.click(); }
    public void clickFooterContactUs() { footerContactUs.click(); }
    public void clickFooterCareers() { footerCareers.click(); }
    public void clickFooterLocations() { footerLocations.click(); }

    // subscribe
    public void clickSubscribeButton() { subscribeButton.click(); }
}
