package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage {
    private WebDriver driver;

    // Locators
    private By firstNameInput = By.id("ContactUsFrm_first_name");
    private By emailInput = By.id("ContactUsFrm_email");
    private By enquiryInput = By.id("ContactUsFrm_enquiry");
    private By submitButton = By.xpath("//button[@title='Submit']");

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillFirstName(String firstName) {
        driver.findElement(firstNameInput).clear();
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    public void fillEmail(String email) {
        driver.findElement(emailInput).clear();
        driver.findElement(emailInput).sendKeys(email);
    }

    public void fillEnquiry(String enquiry) {
        driver.findElement(enquiryInput).clear();
        driver.findElement(enquiryInput).sendKeys(enquiry);
    }

    public void submitForm() {
        driver.findElement(submitButton).click();
    }

    // Scroll to "Contact Us" link and click it
    public void clickContactUsLink() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll down to bottom first
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        // Wait a moment for page to scroll (optional)

        // Locate the Contact Us link (usually text = "Contact Us")
        WebElement contactUsLink = driver.findElement(By.linkText("Contact Us"));
        contactUsLink.click();
    }
}