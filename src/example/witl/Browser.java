package example.witl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        String basePage = "https://www.facebook.com";
        driver.get(basePage);

        Thread.sleep(5000);
        WebElement userInputBox = driver.findElement(By.id("email"));
        userInputBox.sendKeys("username");

        WebElement passwordBox = driver.findElement(By.id("pass"));
        passwordBox.sendKeys("password");

        WebElement loginButton = driver.findElement(By.id("loginbutton"));
        loginButton.click();

        Thread.sleep(3000);

        WebElement userNameError = driver.findElement(By.cssSelector("div[data-ownerid='email'] .uiContextualLayerRight"));

        String actualMessage = userNameError.getText();

        System.out.println(actualMessage);
        Assert.assertEquals("Should give the username wrong error message",
                "The email address or phone number that you've entered doesn't match any account. Sign up for an account.\n" +
                "Close pop-up and return", actualMessage);

        driver.quit();
    }
}