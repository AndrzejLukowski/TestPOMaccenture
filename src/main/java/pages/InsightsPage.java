package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsightsPage {

    WebDriver webDriver;

    public InsightsPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    // FindBy elements on page

    @FindBy(linkText = "Artificial Intelligence") WebElement pageArtificialIntelligence;
    @FindBy(linkText = "Blockchain") WebElement pageBlockchain;
    @FindBy(linkText = "Cloud") WebElement pageCloud;
    @FindBy(linkText = "Competitive Agility") WebElement pageCompetitiveAgility;
    @FindBy(linkText = "Cybersecurity") WebElement pageCybersecurity;

    // All methods on Main page

    public void clickPageArtificialIntelligence() {
        pageArtificialIntelligence.click();
    }
    public void clickPageBlockchain() {
        pageBlockchain.click();
    }
    public void clickPageCloud() {
        pageCloud.click();
    }
    public void clickPageCompetitiveAgility() {
        pageCompetitiveAgility.click();
    }
    public void clickPageCybersecurity() {
        pageCybersecurity.click();
    }
}
