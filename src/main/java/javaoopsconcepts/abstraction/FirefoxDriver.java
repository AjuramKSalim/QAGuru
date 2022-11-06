package javaoopsconcepts.abstraction;

public class FirefoxDriver implements Webdriver{

    @Override
    public void launch() {
        System.out.println("Firefox is launched");
    }

    @Override
    public void close() {
        System.out.println("Firefox is closed");
    }

    @Override
    public void get(String url) {
        System.out.println("Firefox is navigated to" + url);
    }
}
