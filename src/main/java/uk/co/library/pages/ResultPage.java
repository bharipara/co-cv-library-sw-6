package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import uk.co.library.utility.Utility;


public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }



    @CacheLookup
    @FindBy(xpath = "//h1[@class ='search-header__title']")
    WebElement resultText;


    public void verifyTheResults(String expected) {

        log.info("Verify the results" + resultText.toString());
        String  actual= getTextFromElement(resultText);
        Assert.assertEquals(expected,actual);
    }

//    public String verifyTheResults(String expected){
//        Assert.assertEquals(resultText,expected);
//        CustomListeners.test.log(Status.PASS, "Verify the Results ");
//        Reporter.log("Verify the Results" + resultText.toString());
//        return getTextFromElement(resultText);

}
