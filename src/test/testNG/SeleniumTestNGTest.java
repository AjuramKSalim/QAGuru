import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTestNGTest {
    public String baseURL = "http://www.qaguru.ca";

    @Test
    public void VerifyHomePageTitle() {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);
        String expTitle = "QA Guru | Home";
        String actTitle = driver.getTitle();
        Assert.assertEquals(expTitle,actTitle);
        driver.quit();
    }

}
