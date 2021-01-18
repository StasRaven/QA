import org.junit. *;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebdriverExample extends WebdriverSetup {


    String web = "https://rozetka.com.ua/";



    @Test
    public void runDriver() {

        driver.navigate().to(web);
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Интернет-магазин ROZETKA™: официальный сайт самого популярного онлайн-гипермаркета в Украине"));
        }

}
