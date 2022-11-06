package OopsConcepts;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownSelect {

    @Test
    public void dropdownSelection() throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS) ;
        driver.get("https://output.jsbin.com/osebed/2");
        WebElement selectList = driver.findElement(By.id("fruits"));
        System.out.println(selectList.getTagName());
        System.out.println(selectList.getLocation());
        System.out.println(selectList.getText());
        System.out.println(selectList.getSize());
        System.out.println(selectList.getClass());
        System.out.println(selectList.isSelected());
        System.out.println(selectList.isDisplayed());

        Select selectItem = new Select(selectList);
        selectItem.selectByIndex(2);  //Index always starts from zero
        selectItem.selectByVisibleText("Apple");

    }


}
