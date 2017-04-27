package ebay;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 24/04/2017.
 */
public class MyStepdefs {

            WebDriver driver;

  @Given("^The user is on home page$")
    public void theUserIsOnHomePage()
    {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://www.ebay.co.uk/");
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @When("^The user is clicking on sign in page button on top left hand side$")
    public void The_user_is_clicking_on_sign_in_page_button_on_top_left_hand_side() {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @Then("^The user should nevigate to sign in page sucessfully$")
    public void The_user_should_nevigate_to_sign_in_page_sucessfully() {
        Assert.assertEquals("user is not on sign in page","Sign in",
                driver.findElement(By.cssSelector("span.ml53.tx")).getText());
    }


}
