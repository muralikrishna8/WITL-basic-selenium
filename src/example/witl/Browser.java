package example.witl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        String basePage = "https://www.facebook.com";
        driver.get(basePage);

        Thread.sleep(5000);

        driver.quit();
    }
}