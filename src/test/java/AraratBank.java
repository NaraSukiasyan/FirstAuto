import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AraratBank {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver 2");
        driver = new ChromeDriver();
        driver.get("https://www.araratbank.am/hy/");
}
    @Test
    public void test() {
        driver.findElement(By.id("80")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}