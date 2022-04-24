package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPage {

    WebDriver webDriver;

    public ServicesPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    // FindBy elements on page

    @FindBy(linkText = "Application Services") WebElement pageApplicationServices;
    @FindBy(linkText = "Artificial Intelligence") WebElement pageArtificialIntelligence;
    @FindBy(linkText = "Business Strategy") WebElement pageBusinessStrategy;
    @FindBy(linkText = "Cloud") WebElement pageCloud;
    @FindBy(linkText = "Cybersecurity") WebElement pageCybersecurity;

    // All methods on Main page

    public void clickPageArtificialIntelligence() {
        pageArtificialIntelligence.click();
    }
    public void clickPageApplicationServices() {
        pageApplicationServices.click();
    }
    public void clickPageCloud() {
        pageCloud.click();
    }
    public void clickPageBusinessStrategy() {
        pageBusinessStrategy.click();
    }
    public void clickPageCybersecurity() {
        pageCybersecurity.click();
    }

}
