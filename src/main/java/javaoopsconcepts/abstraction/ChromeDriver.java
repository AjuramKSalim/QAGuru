package javaoopsconcepts.abstraction;

public class ChromeDriver implements Webdriver {


    @Override
    public void launch() {
        System.out.println("Chrome is launched");
    }

    @Override
    public void close() {
        System.out.println("Chrome is closed");
    }

    @Override
    public void get(String url) {
        System.out.println("Chrome is navigated to" + url);
    }
}
