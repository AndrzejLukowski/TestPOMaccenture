package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndustriesPage {

    WebDriver webDriver;

    public IndustriesPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    // FindBy elements on page

    @FindBy(linkText = "Aerospace and Defense") WebElement pageAerospaceAndDefense;
    @FindBy(linkText = "Automotive") WebElement pageAutomotive;
    @FindBy(linkText = "Chemicals") WebElement pageChemicals;
    @FindBy(linkText = "Travel") WebElement pageTravel;
    @FindBy(linkText = "High Tech") WebElement pageHighTech;

    // All methods on Main page

    public void clickPageAerospaceAndDefense() {
        pageAerospaceAndDefense.click();
    }
    public void clickPageAutomotive() {
        pageAutomotive.click();
    }
    public void clickPageChemicals() {
        pageChemicals.click();
    }
    public void clickPageTravel() {
        pageTravel.click();
    }
    public void clickPageHighTech() {
        pageHighTech.click();
    }

}
