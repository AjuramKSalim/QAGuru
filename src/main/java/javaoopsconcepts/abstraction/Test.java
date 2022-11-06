package javaoopsconcepts.abstraction;

public class Test {

    public static void main(String[] args) {
        Webdriver chromedriver = new ChromeDriver();
        Webdriver firefoxdriver = new FirefoxDriver();
        chromedriver.launch();
        chromedriver.get("https://www.google.com");
        chromedriver.close();
        firefoxdriver.launch();
        firefoxdriver.get("https://www.google.com");
        firefoxdriver.close();
    }
}
