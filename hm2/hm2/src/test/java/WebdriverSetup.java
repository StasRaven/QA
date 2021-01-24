import org.junit. *;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.math. *;
import java.util.Random;


import java.util.Random;
import java.util.concurrent.TimeUnit;


public abstract class WebdriverSetup {

    protected ChromeDriver driver;

    public static int randomInt(){
        Random rn = new Random();
        return rn.nextInt(100);
    }

    @Before
    public void startCondition() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Stas\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        String web = "http://automationpractice.com/";
        driver.manage().window().maximize();
        driver.navigate().to(web);
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email_create")).clear();
        driver.findElement(By.id("email_create")).sendKeys("registration" + randomInt() +"@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();

    }


    /*@After
    public void endCondition() {
        System.out.println("The test is end!");
        driver.close();
    }*/



}
