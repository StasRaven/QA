import org.openqa.selenium. *;


public class RegistrationPage {

            private WebDriver driver;

            private By firstCustomerName = By.id("customer_firstname");
            private By lastCustomerName = By.id("customer_lastname");
            private By emailCustomer = By.id("email");

            RegistrationPage (WebDriver driver) {
                this.driver = driver;
            }

            public void customerGender (String customerGender) {
                if (customerGender.equals("Mr.")) { driver.findElement(By.id("id_gender1")).click(); }
                else { driver.findElement(By.id("id_gender2")).click(); }
            }
            public void fillCustomerFirstName (String customerFirstName) { driver.findElement(firstCustomerName).sendKeys(customerFirstName); }
            public void fillCustomerLastName (String customerLastName) { driver.findElement(lastCustomerName).sendKeys(customerLastName); }
            public void customerEmail (String customerEmail) { driver.findElement(emailCustomer).sendKeys(customerEmail); }
            public void customerPassword (String customerPassword) { driver.findElement(By.id("password")).sendKeys(customerPassword); }
            public void newsLetterCheckbox (String newsLetter) { driver.findElement(By.id("newsletter")).click();}
            public void specialOffersCheckbox (String specialOffers) { driver.findElement(By.id("uniform-newsletter")).click();}
            public void accountCreatingCustomerFistName (String firstname) { driver.findElement(By.id("firstname")).sendKeys(firstname);}
            public void accountCreatingCustomerLastName (String lastname) { driver.findElement(By.id("lastname")).sendKeys(lastname);}
            public void accountCreatingCustomerAddress (String address) { driver.findElement(By.id("address")).sendKeys(address);}
            public void accountCreatingCustomerAddress2 (String address2) { driver.findElement(By.id("address2")).sendKeys(address2);}
            public void accountCreatingCustomerCity (String city) { driver.findElement(By.id("city")).sendKeys(city);}
            public void accountCreatingCustomerPostcode (String postcode) { driver.findElement(By.id("postcode")).sendKeys(postcode);}
            public void accountCreatingCustomerPhone (String phone) { driver.findElement(By.id("phone")).sendKeys("0445687896");}
            public void accountCreatingCustomerPhoneMobile (String phone_mobile) { driver.findElement(By.id("phone_mobile")).sendKeys("0666666666");}
            public void accountCreatingCustomerAddressAlias (String alias) { driver.findElement(By.id("alias.form-control")).sendKeys(alias);}



}
