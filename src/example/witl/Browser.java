package example.witl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
    public String loginToFacebook(String username, String password) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
//        System.setProperty("webdriver.chrome.driver", "/path/to/the/downloaded/chromedriver");
//        WebDriver driver = new ChromeDriver();
        String basePage = "https://www.facebook.com";
        driver.get(basePage);

        Thread.sleep(3000);
        WebElement userInputBox = driver.findElement(By.xpath(".//input[@id='email']"));
        userInputBox.sendKeys(username);

        WebElement passwordBox = driver.findElement(By.xpath(".//input[@id='pass']"));
        passwordBox.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath(".//*[@id='loginbutton']"));
        loginButton.click();

        Thread.sleep(3000);

        WebElement profile = driver.findElement(By.xpath(".//*[@data-click='profile_icon']/a/span"));

        String actualProfileName = profile.getText();
        driver.quit();
        return  actualProfileName;
    }
}