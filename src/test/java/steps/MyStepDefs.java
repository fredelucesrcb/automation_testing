package steps;

import engine.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStepDefs {

    private WebDriver driver;

    private String username;

    public MyStepDefs (Driver driver) {
        this.driver = driver.get();
    }

    @Given("I am on Parabank Home page")
    public void iAmOnParabankHomePage() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        System.out.println("");
    }

    @When("I click on the Register Button")
    public void iClickOnTheRegisterButton() {
        driver.findElement(By.xpath(".//a[contains(@href, 'register.htm')]")).click();
        WebElement RegisterForm = driver.findElement(By.id("customerForm"));
        Assert.assertEquals(true, RegisterForm.isDisplayed());
    }

    @When("I enter {string} on First name field")
    public void iEnterOnFirstNameField(String arg0) {
        driver.findElement(By.id("customer.firstName")).sendKeys(arg0);
        System.out.println("");
    }

    @When("I enter {string} on Last name field")
    public void iEnterOnLastNameField(String arg0) {
        driver.findElement(By.id("customer.lastName")).sendKeys(arg0);
        System.out.println("");
    }

    @When("I enter {string} on Address Field")
    public void iEnterOnAddressField(String arg0) {
        driver.findElement(By.id("customer.address.street")).sendKeys(arg0);
        System.out.println("");
    }

    @When("I enter {string} on City Field")
    public void iEnterOnCityField(String arg0) {
        driver.findElement(By.id("customer.address.city")).sendKeys(arg0);
        System.out.println("");
    }

    @When("I enter {string} on State Field")
    public void iEnterOnStateField(String arg0) {
        driver.findElement(By.id("customer.address.state")).sendKeys(arg0);
        System.out.println("");
    }

    @When("I enter {string} on Zip code Field")
    public void iEnterOnZipCodeField(String arg0) {
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(arg0);
        System.out.println("");
    }

    @When("I enter {string} on Phone number field")
    public void iEnterOnPhoneNumberField(String arg0) {
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(arg0);
        System.out.println("");
    }

    @When("I enter {string} on SSN field")
    public void iEnterOnSSNField(String arg0) {
        driver.findElement(By.id("customer.ssn")).sendKeys(arg0);
        System.out.println("");
    }

    @When("I enter {string} on Username field")
    public void iEnterOnUsernameField(String arg0) {
        driver.findElement(By.id("customer.username")).sendKeys(arg0);
        username = arg0;
        System.out.println("");
    }

    @When("I enter {string} on Password field")
    public void iEnterOnPasswordField(String arg0) {
        driver.findElement(By.id("customer.password")).sendKeys(arg0);
        System.out.println("");
    }

    @When("I enter {string} on Confirm field")
    public void iEnterOnConfirmField(String arg0) {
        driver.findElement(By.id("repeatedPassword")).sendKeys(arg0);
        System.out.println("");
    }

    @When("I submit the form")
    public void iSubmitTheForm() {
        driver.findElement(By.xpath(".//input[@type='submit' and @value='Register']")).click();
        System.out.println("");
    }

    @Then("the registration will be successful and I am Logged in")
    public void theRegistrationWillBeSuccessfulAndIAmLoggedIn() {
        String RegistrationText = driver.findElement(By.xpath(".//h1[contains(@class, 'title')]")).getText();
        Assert.assertTrue(RegistrationText.contains(username));
    }
}
