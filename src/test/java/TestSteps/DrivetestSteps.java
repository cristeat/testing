package TestSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static projectRelated.DriverInit.getChromeDriver;
import static projectRelated.DriverInit.getWebDriverWait;

public class DrivetestSteps {

         private WebDriver driver = getChromeDriver();
         private WebDriverWait wait = getWebDriverWait();

    @Given("^I am on the drive test request page$")
    public DrivetestSteps i_am_on_the_drive_test_request_page() {
        driver.manage().window().maximize();
        driver.get("https://www.chevrolet.com/request-test-drive");
        return this;
    }

   @When("^I fill in the application with my valid data$")
    public DrivetestSteps i_fill_in_the_application_with_my_valid_data() {

       driver.findElement(By
               .id("gmit-gf-model-year"))
               .click();
       driver.findElement(By
               .cssSelector("#gmit-gf-model-year > option:nth-child(2)"))
               .click();

       driver.manage()
               .timeouts()
               .implicitlyWait(5, TimeUnit.SECONDS);
       driver.findElement(By
               .id("gmit-gf-model"))
               .click();
       driver.findElement(By
               .xpath("//*[@id=\"gmit-gf-model\"]/option[6]"))
               .click();

       driver.findElement(By
               .id("trim"))
               .click();
       driver.findElement(By
               .id("trim"))
               .click();
       driver.findElement(By
               .xpath("//*[@id=\"trim\"]/option[3]"))
               .click();

       driver.findElement(By
               .id("gmit-gf-first-name"))
               .sendKeys("Decebal");

       driver.findElement(By
               .id("gmit-gf-last-name"))
               .sendKeys("Popescu");

       driver.findElement(By
               .id("address_1"))
               .sendKeys("1 dell way");
       driver.findElement(By
               .id("cityname"))
               .clear();
       driver.findElement(By
               .id("cityname"))
               .sendKeys("Round Rock");

       driver.findElement(By
               .id("state"))
               .click();
       driver.findElement(By
               .xpath("//*[@id=\"state\"]/option[45]"))
               .click();

       driver.findElement(By
               .id("gmit-gf-postal-code"))
               .sendKeys("78682");
       driver.findElement(By
               .id("telephone_phone_number"))
               .sendKeys("5127238393");
       driver.findElement(By
               .xpath("//*[@id=\"preferred_communication_channel_group\"]/li[2]/label"))
               .click();
       driver.findElement(By
               .xpath("//*[@id=\"disclaimers\"]/div/div[1]/div[3]/div[3]/div[2]/label/div[1]/label"))
               .click();
       driver.findElement(By
               .id("gmit-gf-comments"))
               .sendKeys("something asfdsaf");

       return this;
   }

    @When("^Click submit button$")
    public DrivetestSteps click_submit_button() {
            driver.findElement(By.id("gmit-gf-submit-request-type")).click();
            return this;
    }

    @Then("^I am presented with successful thank you page$")
    public DrivetestSteps i_am_presented_with_successful_thank_you_page() {
        WebElement something = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gmit-gf-thank-you-paragraph")));

        boolean status = something.isDisplayed();

        if (status){
            System.out
                    .println("Thank You is displayed");
        }
        else {
            System.out
                    .println("Thank You not displayed");
        }

       // driver.quit();
        return this;
    }

}
