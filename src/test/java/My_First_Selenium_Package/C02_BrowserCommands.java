package My_First_Selenium_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_BrowserCommands {
    public static void main(String[] args) {
        //WebDriver'ı başlatmak için gerekli Chrome driverını belirtelim
        System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");

        //WebDriver objesi oluştuşturalım
        WebDriver driver = new ChromeDriver();

        //Sayfayı tam ekran yapalım
        driver.manage().window().maximize();
        //driver.manage().window().minimize();
        //driver.manage().window().fullscreen();

        // Clarusway sayfasına gidelim
        driver.get("https://clarusway.com");

        // Google sayfasına gidelim
        String googleUrl = "https://google.com";

        driver.get(googleUrl);

        //Tarayıcıyı kapat
        driver.quit();
    }
}
