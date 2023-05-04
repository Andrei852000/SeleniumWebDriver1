
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.Assert;public class IfElsetest {

    @Test
    public void testPageTitle(){
        System.out.println("Launching Chrome browser. .");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to( "http://google.com");

        // verifying the page title
        String expPageTitle = "Google";
        boolean flag = false;
        if (driver.getTitle().equalsIgnoreCase(expPageTitle)) {
            flag = true;
            // This method will return true when the page title matches with specified string
            System.out.println("Page title matched");
        }
        Assert.assertTrue(flag, "Page title is not matching with expected");
        driver.quit();

        }
    }



