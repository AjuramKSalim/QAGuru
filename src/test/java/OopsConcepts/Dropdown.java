package OopsConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

    public void test1() throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://trytestingthis.netlify.app/");
        driver.manage().window().maximize();
        WebElement dropdown= driver.findElement(By.id("option"));
        Select s=new Select(dropdown);
        s.selectByIndex(3);
    }
}
