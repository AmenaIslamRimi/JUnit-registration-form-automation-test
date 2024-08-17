import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MyJunit2 {
    WebDriver driver;
    @BeforeAll
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30 ));
    }
    @Test
    public void registrationForm() throws InterruptedException{
        driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
        Thread.sleep(2000);
        driver.findElement(By.id("first_name")).sendKeys("John");
        Thread.sleep(1000);
        driver.findElement(By.id("last_name")).sendKeys("Doe");
        Thread.sleep(1000);
        driver.findElement(By.id("user_email")).sendKeys("johndoetealblue12345@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("user_pass")).sendKeys("jhondoe@1234");
        Thread.sleep(1000);

        driver.findElement(By.id("radio_1665627729_Male")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input[data-label='Date of Birth']")).click();
        Thread.sleep(1000);

        WebElement yearInput = driver.findElement(By.className("numInputWrapper"));
        WebElement yearData = yearInput.findElement(By.cssSelector("input[type='number']"));
        yearData.click();
        yearData.sendKeys(Keys.BACK_SPACE);
        yearData.sendKeys("1999");
        Thread.sleep(1000);

        Select selectMonth = new Select(driver.findElement(By.className("flatpickr-monthDropdown-months")));
        selectMonth.selectByVisibleText("May");
        Thread.sleep(1000);

        List <WebElement> dates = driver.findElements(By.cssSelector(".flatpickr-day:not(.prevMonthDay):not(.nextMonthDay)"));
        dates.get(15).click();
        Thread.sleep(1000);

        driver.findElement(By.id("input_box_1665629217")).sendKeys("Bangladeshi");
        Thread.sleep(1000);

        WebElement phoneNumberContainer = driver.findElement(By.id("phone_1665627880"));
        WebElement phoneNumberInput = phoneNumberContainer.findElement(By.xpath(".//*[@id=\"phone_1665627880\"]"));
        phoneNumberInput.sendKeys("(999) 999-9999");
        Thread.sleep(1000);

        Select select = new Select(driver.findElement(By.id("country_1665629257")));
        select.selectByVisibleText("Bangladesh");
        Thread.sleep(1000);

        Utils.scroll(driver);
        Thread.sleep(1000);

        driver.findElement(By.id("privacy_policy_1665633140")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(2000);

        WebElement messageContainer = driver.findElement((By.id("ur-submit-message-node")));
        WebElement messageActual = messageContainer.findElement(By.tagName("ul"));
        String messageExpected = "User successfully registered.";
        Assertions.assertTrue(messageActual.getText().contains(messageExpected));
        Thread.sleep(2000);
    }
@AfterAll
    public void closure(){

        driver.quit();
    }


}
