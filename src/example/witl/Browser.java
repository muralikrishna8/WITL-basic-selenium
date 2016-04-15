package example.witl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
    public String loginToFacebook(String username, String password) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        String basePage = "https://www.facebook.com";
        driver.get(basePage);

        Thread.sleep(5000);
        WebElement userInputBox = driver.findElement(By.id("email"));
        userInputBox.sendKeys(username);

        WebElement passwordBox = driver.findElement(By.id("pass"));
        passwordBox.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("loginbutton"));
        loginButton.click();

        Thread.sleep(3000);

        WebElement profile = driver.findElement(By.cssSelector("div[data-click='profile_icon']"));

        String actualProfileName = profile.getText();
        driver.quit();
        return  actualProfileName;
    }
}