
import org.junit. *;
import org.openqa.selenium. *;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class AutomationPractice extends WebdriverSetup {


  //  String web = "http://automationpractice.com/";


    @Test
    public void runDriver() {

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.id("customer_firstname")).clear();
        driver.findElement(By.id("customer_firstname")).sendKeys("customer firstname");
        driver.findElement(By.id("customer_lastname")).clear();
        driver.findElement(By.id("customer_lastname")).sendKeys("customer lastname");


    }





}