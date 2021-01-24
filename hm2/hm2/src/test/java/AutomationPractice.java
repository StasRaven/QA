
import org.junit. *;
import org.openqa.selenium. *;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class AutomationPractice extends WebdriverSetup {




    @Test
    public void runDriver() {

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).clear();
        driver.findElement(By.id("customer_firstname")).sendKeys("customer firstname");
        driver.findElement(By.id("customer_lastname")).clear();
        driver.findElement(By.id("customer_lastname")).sendKeys("customer lastname");
        //driver.findElement(By.id("emailCustomer")).sendKeys("customerEmail");
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("customerPassword");
        /*driver.findElement(By.id("days")).sendKeys("5");
        driver.findElement(By.id("months")).sendKeys("March");
        driver.findElement(By.id("years")).sendKeys("1900");*/
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("uniform-optin")).click();
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys("firstname");
        driver.findElement(By.id("lastname")).clear();
        driver.findElement(By.id("lastname")).sendKeys("lastname");
        driver.findElement(By.id("address1")).clear();
        driver.findElement(By.id("address1")).sendKeys("address1");
        driver.findElement(By.id("address2")).clear();
        driver.findElement(By.id("address2")).sendKeys("address2");
        driver.findElement(By.id("city")).clear();
        driver.findElement(By.id("city")).sendKeys("city");
       //driver.findElement(By.id("id_state")).sendKeys("Arizona");
        driver.findElement(By.id("postcode")).clear();
        driver.findElement(By.id("postcode")).sendKeys("00000");
        //driver.findElement(By.id("id_country")).clear();
        //driver.findElement(By.id("id_country")).sendKeys("United States");
        driver.findElement(By.id("phone")).clear();
        driver.findElement(By.id("phone")).sendKeys("0445687896");
        driver.findElement(By.id("phone_mobile")).clear();
        driver.findElement(By.id("phone_mobile")).sendKeys("0666666666");
        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys("alias");
        driver.findElement(By.id("submitAccount")).click();
        driver.findElement(By.className("alert-danger")).getText().equals("There are 1 errors");

    }





}