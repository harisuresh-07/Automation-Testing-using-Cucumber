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
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
    }

    @When("User enters valid username and password")
    public void user_enters_valid_credentials() throws InterruptedException {
    	Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("harisuresh07");
        driver.findElement(By.name("password")).sendKeys("harisureshHa7$");
    }

    @When("clicks the login button")
    public void clicks_login_button() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/section/main/article/div[2]/div[1]/div[2]/div/form/div[1]/div[3]")).click();
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
