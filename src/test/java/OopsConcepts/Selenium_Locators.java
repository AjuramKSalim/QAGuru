package OopsConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Selenium_Locators {

    @Test
    public void test1() throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS) ;
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        String Actual_Title= driver.getTitle();
        System.out.println(Actual_Title);
        //Assert.assertEquals(Actual_Title, "QA Guru | Home");
        Thread.sleep(1000);
        WebElement username=driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("admin123");
//        WebDriverWait wait = new WebDriverWait(driver,10);
//       WebElement txtUsername =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

        List<WebElement> allLinks =driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());
        for (int i=0;i<allLinks.size();i++ )
        {
            System.out.println(allLinks.get(i).getText());
            if (allLinks.get(i).getText().equals("Employee List"))
            {
                System.out.println("Employee List Found ");
                break;
            }
        }
        Thread.sleep(5000);
        driver.findElement(By.linkText("Admin")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(3000);
        driver.close();



    }

}
