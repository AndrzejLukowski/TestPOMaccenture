package helperMethods;

import jdk.javadoc.doclet.Reporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class EvidenceGenerator {

    WebDriver webDriver;

    public EvidenceGenerator(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void getScreenshot(String testName) throws IOException {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        String fileName = testName + "_" + timeStamp;
        File screenshotFile1 = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile1, new File("C:/Users/a.lukowski/Documents/" + fileName + ".png"));
    }

    public void getScreenshotReporter(String result) throws  IOException {
    }
}
