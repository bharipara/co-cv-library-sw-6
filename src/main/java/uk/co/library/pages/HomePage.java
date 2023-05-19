package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//span[text()='Accept All']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitleField;

    @CacheLookup
    @FindBy(id = "location")
    WebElement locationField;

    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDownField;

    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsField;

    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMinField;

    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMaxField;

    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeField;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDownField;

    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtnField;

   public void clickOnAcceptCookies(){
       clickOnElement(acceptCookies);

   }

    public void enterJobTitle(String jobTitle) {

        log.info("Clicking on Job Title" + jobTitle.toString());
        sendTextToElement(jobTitleField, jobTitle);

    }
    public void enterLocation(String location){

        log.info("Enter location" + location.toString());
        sendTextToElement(locationField,location);

    }

   public void selectDistance(String distance){

       log.info("Select Distance" + distance.toString());
       selectByVisibleTextFromDropDown(distanceDropDownField,distance);

   }
   public void clickOnMoreSearchOptionLink(){

       log.info("Clicking on More search option Link" + moreSearchOptionsField.toString());
       clickOnElement(moreSearchOptionsField);

   }
    public void enterMinSalary(String minSalary){

        log.info("Enter Min salary" + salaryMinField.toString());
        sendTextToElement(salaryMinField,minSalary);

    }
    public void enterMaxSalary(String maxSalary){

        log.info("Enter Max salary" + salaryMaxField.toString());
        sendTextToElement(salaryMaxField,maxSalary);

    }
    public void selectSalaryType(String sType){

        log.info("Select salary Type" + salaryTypeField.toString());
        selectByVisibleTextFromDropDown(salaryTypeField,sType);

    }
    public void selectJobType(String jobType){

        log.info("Select Job Type" + jobTitleField.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDownField,jobType);

    }
    public void clickOnFindJobsButton(){

        log.info("Click on Find Jobs Button" + findJobsBtnField.toString());
        clickOnElement(findJobsBtnField);

    }

}
