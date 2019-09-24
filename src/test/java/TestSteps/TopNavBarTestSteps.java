package TestSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static projectRelated.DriverInit.getChromeDriver;
import static projectRelated.DriverInit.getWebDriverWait;

public class TopNavBarTestSteps {

    WebDriver driver = getChromeDriver();
    WebDriverWait wait = getWebDriverWait();

        @Given("^I am on the main page$")
            public TopNavBarTestSteps i_am_on_the_main_page()  {
            driver.manage().window().maximize();
            driver.get("https://www.cadillac.com/");

            WebElement mainpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("q-nav-logo-image")));

            boolean status = mainpage.isDisplayed();
            if (status){
                System.out
                        .println("Main page displayed");
             }
            else {
                System.out
                        .println("Main page is not displayed");
            }
            return this;
        }

        @When("^I click on the top section vehicles button$")
            public void i_click_on_the_top_section_vehicles_button() {
            driver.findElement(By
                    .xpath("/html/body/div[2]/div[2]/nav/section/div/ul[1]/li[1]/a"))
                    .click();
        }

        @Then("^The corresponding drop down is presented$")
            public void the_corresponding_drop_down_is_presented () {
            WebElement vehicles = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("ALL")));

            boolean vehiclestatus = vehicles.isDisplayed();
            if (vehiclestatus) {
                System.out
                        .println("Vehicles tab is displayed");
            }
            else {
                System.out
                        .println("Element not displayed");
            }
        }
        @When("^I click the top shopping button$")
            public void i_click_the_top_shopping_button() {
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/nav/section/div/ul[1]/li[2]/a")).click();
            }

        @Then("^The shopping drop down is expanded$")
            public void the_shopping_drop_down_is_expanded() {

            WebElement shopping = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/div/div[3]/div[2]")));

            boolean shoppingstatus = shopping.isDisplayed();

            if (shoppingstatus) {
                System.out
                        .println("Shopping tab is displayed");
            }
            else {
                System.out
                        .println("Shopping not displayed");
            }
        }

        @When("^I click the top ownership button$")
            public void i_click_the_top_ownership_button() {
            driver.findElement(By
                    .xpath("/html/body/div[2]/div[2]/nav/section/div/ul[1]/li[3]/a"))
                    .click();
            }

        @Then("^The ownership drop down is expanded$")
            public void the_ownership_drop_down_is_expanded()  {
            WebElement ownership = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/div/div[3]/div[1]")));

            boolean ownershipstatus = ownership.isDisplayed();
            if(ownershipstatus){
                System.out
                        .println("Ownership tab is displayed");
            }
            else {
                System.out
                        .println("Ownership tab is not displayed");
            }
         }

        @When("^I click the top certified pre-owned button$")
            public void i_click_the_top_certified_pre_owned_button()  {
            driver.findElement(By
                    .xpath("/html/body/div[2]/div[2]/nav/section/div/ul[1]/li[4]/a"))
                    .click();
            }

        @Then("^The certified pre-owned drop down is expanded$")
            public void the_certified_pre_owned_drop_down_is_expanded()  {
            WebElement certified = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("CERTIFIED PRE-OWNED")));

            boolean certpreowned = certified.isDisplayed();
            if(certpreowned){
                System.out
                        .println("Certified pre-owned tab is displayed");
            }
            else {
                System.out
                        .println("Certified pre-owned tab is not displayed");
            }
        }

        @When("^I click the top find a dealer button$")
            public void i_click_the_top_find_a_dealer_button()  {
            driver.findElement(By
                    .xpath("/html/body/div[2]/div[2]/nav/section/div/ul[1]/li[5]/a"))
                    .click();
            }

        @Then("^The find a dealer drop down is expanded$")
            public void the_find_a_dealer_drop_down_is_expanded() {
            WebElement dealer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div[3]/div[1]/label/span")));

            boolean locatedealer = dealer.isDisplayed();
            if(locatedealer){
                System.out
                        .println("Find a dealer tab is displayed");
            }
            else {
                System.out
                        .println("Find a dealer tab is not displayed");
            }
        }

        @Then("^Page URL is updated$")
            public void page_URL_is_updated() {
            String URL = driver.getCurrentUrl();
            Assert.assertEquals(URL, "https://www.cadillac.com/locate-dealer");
            }

        @When("^I click the top world of cadillac button$")
            public void i_click_the_top_world_of_cadillac_button()  {
            driver.findElement(By
                    .xpath("/html/body/div[2]/div[2]/nav/section/div/ul[1]/li[6]/a"))
                    .click();
            }

        @Then("^The world of cadillac drop down is expanded$")
            public void the_world_of_cadillac_drop_down_is_expanded() {
            WebElement caddy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/div/div[3]/div[1]/div[1]/div/div/h1")));

            boolean caddyworld = caddy.isDisplayed();
            if(caddyworld){
                System.out
                        .println("World of Cadillac tab is displayed");
            }
            else {
                System.out
                        .println("World of Cadillac tab is not displayed");
            }
            driver.quit();
        }

    }

