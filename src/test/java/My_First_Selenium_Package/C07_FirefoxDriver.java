package My_First_Selenium_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C07_FirefoxDriver {
/*
     Invoke FireFox Driver
     Go to https://www.youtube.com/
     Verify the page title contains the word video.
     Close the driver.
 */

    public static void main(String[] args) throws InterruptedException {

//     Invoke FireFox Driver
        System.setProperty("webdriver.firefox.driver", "Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

//     Go to https://www.youtube.com/
        driver.get("https://www.youtube.com/");

//     Verify the page title contains the word video.
        if (driver.getTitle().contains("YouTube")){
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAİLED");
        }

//     Close the driver.

        Thread.sleep(3000);
        driver.quit();
    }
}
