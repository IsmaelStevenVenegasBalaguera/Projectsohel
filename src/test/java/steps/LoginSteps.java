package steps;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.commonMethods;
import utils.ConfigReader;

public class LoginSteps extends commonMethods {
    //public WebDriver driver;

    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
       // driver=new ChromeDriver();

       // driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        openBrowserAndLaunchApplication();
    }
    @When("user enters admin username and password")
    public void user_enters_admin_username_and_password() throws InterruptedException {
        //LoginPage lp=new LoginPage();
        //WebElement usernameTextField= driver.findElement(By.xpath("//*[@id='txtUsername']"));
        //usernameTextField.sendKeys("admin");
        sendText(loginPage.usernameTextField, ConfigReader.getPropertyValue("username"));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       // WebElement passwordTextField=driver.findElement(By.cssSelector("input#txtPassword"));
        //passwordTextField.sendKeys("Hum@nhrm123");
        sendText(loginPage.passwordTextField, ConfigReader.getPropertyValue("password"));
        // Write code here that turns the phrase above into concrete actions
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
      //WebElement loginButton=driver.findElement(By.xpath("//*[@value='LOGIN']"));
      click(loginPage.loginBtn);

    }
    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("My test passed");
        //assertions to check if the element exists
        Assert.assertTrue(dashboardPage.welcomeAdminLocator.isDisplayed());

    }

}
