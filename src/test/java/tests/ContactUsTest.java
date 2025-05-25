package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactUsPage;
import pages.LoginPage;

public class ContactUsTest {

    private static WebDriver driver;
    private static LoginPage loginPage;
    private static ContactUsPage contactUsPage;

    @BeforeAll
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        contactUsPage = new ContactUsPage(driver);
    }

    @Test
    public void testSendContactUsForm() throws InterruptedException {
        driver.get("https://automationteststore.com/index.php?rt=account/login");

        loginPage.loginAs("Toghrul", "3031505tT");

        contactUsPage.clickContactUsLink();

        contactUsPage.fillFirstName("Toghrul");
        contactUsPage.fillEmail("togrlqululu@gmail.com");
        contactUsPage.fillEnquiry("Hello World");

        contactUsPage.submitForm();

        Thread.sleep(3000);  // Ideally replace with explicit wait/assertion
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
