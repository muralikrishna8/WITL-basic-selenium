package example.witl;

import org.junit.Assert;
import org.testng.annotations.Test;

public class BrowserTest {
    @Test
    public void shouldLoginToFacebookSuccessfully() throws InterruptedException {
        Browser browser = new Browser();
        String actualProfileName = browser.loginToFacebook("username", "password"); //give valid credentials
        String expectedProfileName = "username";//give you username, which will be displayed on top right of facebook

        System.out.println(actualProfileName);
        Assert.assertEquals("Should login successfully and verify profile name",
                expectedProfileName, actualProfileName);
    }
}