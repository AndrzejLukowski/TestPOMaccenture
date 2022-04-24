package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BaseTestWebDriver {

    public static WebDriver webDriver;
    private final String urlACN = "https://www.accenture.com/pl-pl";

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.navigate().to(urlACN);
    }

    @AfterMethod
    public void after(ITestResult result) throws IOException {
        Reporter.setCurrentTestResult(result);

        File img = new File(System.getProperty("user.dir") + "/test-output/test-screenshots/screen_" + result.getMethod().getMethodName() + ".png");

        FileOutputStream screenshotStream = new FileOutputStream(img);
        screenshotStream.write(((TakesScreenshot)webDriver).getScreenshotAs(OutputType.BYTES));
        screenshotStream.close();

        Reporter.log("<a href=\'" + img.getAbsolutePath() + "\'> <img src=\'" + img.getAbsolutePath() + "\' height='200' width='200'/> </a>");
        Reporter.log("Close Browser - End Test");

        webDriver.close();
        webDriver.quit();
    }
}
