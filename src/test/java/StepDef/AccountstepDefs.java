package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

import java.time.Duration;


public class AccountstepDefs {
    private WebDriver driver;


    @Given("the valid date of birth and firstname and lastname and email")
    public void theValidDateOfBirthAndUsernameAndEmail() {
        driver = new ChromeDriver();

        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");
        WebElement date = driver.findElement(By.id("dp"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        date.click();
        date.sendKeys("15-04-1992");

        WebElement firstname = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[5]/div[1]/div/input"));

        firstname.sendKeys("Eva");

        WebElement lastname = driver.findElement(By.id("member_lastname"));
        lastname.sendKeys("berg");

        WebElement email = driver.findElement(By.id("member_emailaddress"));
        email.sendKeys("evabezawad@gmail.com");

        WebElement conformEmail = driver.findElement(By.id("member_confirmemailaddress"));
        conformEmail.sendKeys("evabezawad@gmail.com");

    }

    @When("i enter password and conform password")
    public void iEnterPasswordAndConformPassword() {
        WebElement password = driver.findElement(By.id("signupunlicenced_password"));
        password.sendKeys("Regul0405@");
        WebElement conformPassword = driver.findElement(By.id("signupunlicenced_confirmpassword"));
        conformPassword.sendKeys("Regul0405@");
    }

        @And("i check on required boxes")
        public void iCheckOnRequiredBoxes () {

            WebElement checkBox1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[10]/div/div/div[4]/div/label/span[3]"));
            checkBox1.click();
            WebElement checkBox2 = driver.findElement(By.cssSelector("label[for='sign_up_25']"));
            checkBox2.click();
            WebElement checkBox3 = driver.findElement(By.cssSelector("label[for='sign_up_26']"));
            checkBox3.click();
            WebElement checkBox4 = driver.findElement(By.cssSelector("label[for='sign_up_27']"));
            checkBox4.click();
            WebElement checkBox5 = driver.findElement(By.cssSelector("label[for='sign_up_28']"));
            checkBox5.click();
            WebElement checkBox6 = driver.findElement(By.cssSelector("label[for='fanmembersignup_agreetocodeofethicsandconduct']"));
            checkBox6.click();


    }

    @Then("the account is created")
    public void theAccountIsCreated() {
        WebElement button = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[12]/input"));
        button.click();
        WebElement text = driver. findElement(By.xpath("/html/body/div/div[2]/div/h2"));
        String expected = text.getText();

        String actual = "THANK YOU FOR CREATING AN ACCOUNT WITH BASKETBALL ENGLAND";
        assertEquals(expected,actual);


    }

    @Given("the valid date of birth and firstname and email")
    public void theValidDateOfBirthAndFirstnameAndEmail() {
        driver = new ChromeDriver();

        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");
        WebElement date = driver.findElement(By.id("dp"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        date.click();
        date.sendKeys("15-04-1993");

        WebElement firstname = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[5]/div[1]/div/input"));

        firstname.sendKeys("hann");

       /* WebElement error = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[5]/div[2]/div/span/span"));
        String actual = error.getText();
        System.out.println(actual);
        String expected = "Last Name is required";
        assertEquals(expected,actual);*/

        WebElement email = driver.findElement(By.id("member_emailaddress"));
        email.sendKeys("hannbezaw@gmail.com");


        WebElement conformEmail = driver.findElement(By.id("member_confirmemailaddress"));
        conformEmail.sendKeys("hannbezaw@gmail.com");


    }

    @When("i enter the password and conform password")
    public void iEnterThePasswordAndConformPassword() {
        WebElement password = driver.findElement(By.id("signupunlicenced_password"));
        password.sendKeys("Regul0405@");
        WebElement conformPassword = driver.findElement(By.id("signupunlicenced_confirmpassword"));
        conformPassword.sendKeys("Regul0405@");

    }


    @And("i check on  the required boxes and click on create account")
    public void iCheckOnTheRequiredBoxes() {
        WebElement checkBox1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[10]/div/div/div[4]/div/label/span[3]"));
        checkBox1.click();
        WebElement checkBox2 = driver.findElement(By.cssSelector("label[for='sign_up_25']"));
        checkBox2.click();
        WebElement checkBox3 = driver.findElement(By.cssSelector("label[for='sign_up_26']"));
        checkBox3.click();
        WebElement checkBox4 = driver.findElement(By.cssSelector("label[for='sign_up_27']"));
        checkBox4.click();
        WebElement checkBox5 = driver.findElement(By.cssSelector("label[for='sign_up_28']"));
        checkBox5.click();
        WebElement checkBox6 = driver.findElement(By.cssSelector("label[for='fanmembersignup_agreetocodeofethicsandconduct']"));
        checkBox6.click();
        WebElement button = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[12]/input"));
        button.click();

    }


    @Then("i get missing lastname error")
    public void iGetMissingLastnameError() {
        WebElement error = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[5]/div[2]/div/span/span"));
        String actual = error.getText();
        System.out.println(actual);
        String expected = "Last Name is required";
        assertEquals(expected,actual);


    }


    @Given("i enter date of birth and firstname and lastname")
    public void iEnterDateOfBirthAndFirstnameAndLastname() {
        driver = new ChromeDriver();

        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");
        WebElement date = driver.findElement(By.id("dp"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        date.click();
        date.sendKeys("15-04-1992");

        WebElement firstname = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[5]/div[1]/div/input"));

        firstname.sendKeys("emma");

        WebElement lastname = driver.findElement(By.id("member_lastname"));
        lastname.sendKeys("berger");
    }

    @And("i enter email and conform email")
    public void iEnterEmailAndConformEmail() {
        WebElement email = driver.findElement(By.id("member_emailaddress"));
        email.sendKeys("emmaemma@gmail.com");


        WebElement conformEmail = driver.findElement(By.id("member_confirmemailaddress"));
        conformEmail.sendKeys("emmaemma@gmail.com");


    }

    @When("i enter the password and conform wrong password")
    public void iEnterThePasswordAndConformWrongPassword() {
        WebElement password = driver.findElement(By.id("signupunlicenced_password"));
        password.sendKeys("emmaemma");
        WebElement conformPassword = driver.findElement(By.id("signupunlicenced_confirmpassword"));
        conformPassword.sendKeys("emmaemmm");


    }

    @And("i check on all the required boxes and click on create account")
    public void iCheckOnAllTheRequiredBoxesAndClickOnCreateAccount() {
        WebElement checkBox1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[10]/div/div/div[4]/div/label/span[3]"));
        checkBox1.click();
        WebElement checkBox2 = driver.findElement(By.cssSelector("label[for='sign_up_25']"));
        checkBox2.click();
        WebElement checkBox3 = driver.findElement(By.cssSelector("label[for='sign_up_26']"));
        checkBox3.click();
        WebElement checkBox4 = driver.findElement(By.cssSelector("label[for='sign_up_27']"));
        checkBox4.click();
        WebElement checkBox5 = driver.findElement(By.cssSelector("label[for='sign_up_28']"));
        checkBox5.click();
        WebElement checkBox6 = driver.findElement(By.cssSelector("label[for='fanmembersignup_agreetocodeofethicsandconduct']"));
        checkBox6.click();
        WebElement button = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[12]/input"));
        button.click();
    }

    @Then("i get password did not match message")
    public void iGetPasswordDidNotMatchMessage() {
        WebElement errorMessage = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[8]/div/div[2]/div[2]/div/span"));
        String actual = errorMessage.getText();
        System.out.println(actual);
        String expected = "Password did not match";
        assertEquals(expected,actual);
    }

    @Given("i enter the date of birth and firstname and lastname")
    public void iEnterTheDateOfBirthAndFirstnameAndLastname() {
        driver = new ChromeDriver();

        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");
        WebElement date = driver.findElement(By.id("dp"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        date.click();
        date.sendKeys("15-04-1999");

        WebElement firstname = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[5]/div[1]/div/input"));

        firstname.sendKeys("emmaemily");

        WebElement lastname = driver.findElement(By.id("member_lastname"));
        lastname.sendKeys("bergman");
    }

    @And("i enter the email and then conform email")
    public void iEnterTheEmailAndThenConformEmail() {
        WebElement email = driver.findElement(By.id("member_emailaddress"));
        email.sendKeys("emmaemily@gmail.com");


        WebElement conformEmail = driver.findElement(By.id("member_confirmemailaddress"));
        conformEmail.sendKeys("emmaemily@gmail.com");

    }

    @When("i enter the password and conform the password")
    public void iEnterThePasswordAndConformThePassword() {
        WebElement password = driver.findElement(By.id("signupunlicenced_password"));
        password.sendKeys("emmaemma");
        WebElement conformPassword = driver.findElement(By.id("signupunlicenced_confirmpassword"));
        conformPassword.sendKeys("emmaemma");
    }

    @And("i check on all the required boxes except terms and conditions checkbox and click on create account")
    public void iCheckOnAllTheRequiredBoxesExceptTermsAndConditionsCheckboxAndClickOnCreateAccount() {
        WebElement checkBox1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[10]/div/div/div[4]/div/label/span[3]"));
        checkBox1.click();
        /*WebElement checkBox2 = driver.findElement(By.cssSelector("label[for='sign_up_25']"));
        checkBox2.click();*/
        WebElement checkBox3 = driver.findElement(By.cssSelector("label[for='sign_up_26']"));
        checkBox3.click();
        WebElement checkBox4 = driver.findElement(By.cssSelector("label[for='sign_up_27']"));
        checkBox4.click();
        WebElement checkBox5 = driver.findElement(By.cssSelector("label[for='sign_up_28']"));
        checkBox5.click();
        WebElement checkBox6 = driver.findElement(By.cssSelector("label[for='fanmembersignup_agreetocodeofethicsandconduct']"));
        checkBox6.click();
        WebElement button = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[12]/input"));
        button.click();

    }

    @Then("i get You must confirm that you have read and accepted our Terms and Conditions")
    public void iGetYouMustConfirmThatYouHaveReadAndAcceptedOurTermsAndConditions() {
        WebElement Errormessage = driver.findElement(By.cssSelector("span[class='warning field-validation-error']"));
        String actual = Errormessage.getText();
        //System.out.println(actual);
        String expected = "You must confirm that you have read and accepted our Terms and Conditions";
        assertEquals(expected,actual);

    }
}
