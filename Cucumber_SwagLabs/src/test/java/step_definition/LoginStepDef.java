package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	WebDriver driver;

    @Given("User is on the login page")
    public void user_is_on_login_page() {

		System.setProperty("webdriver.gecko.driver","F:\\seleniumweb_driver\\FirefoxDriver\\geckodriver.exe");
		driver=new FirefoxDriver();

		driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
    }

    @When("User enters valid username and password")
    public void user_enters_valid_credentials() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @When("clicks the login button")
    public void clicks_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("User should see the student homepage")
    public void user_should_see_homepage() {
        boolean isSuccess = driver.getPageSource().contains("Logged In Successfully");
        if (isSuccess) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
        driver.quit();

}
}
