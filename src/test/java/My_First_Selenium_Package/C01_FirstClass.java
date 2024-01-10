package My_First_Selenium_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) {
        /*
        setProperty(1,2) metoduyla 1'inci parametrede kütüphane yolunu,
        2'nci parametrede driver dosyası yolunu belirtiyoruz.
         */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");//Bu işleme Selenium 4.6 sonrası gerek yoktur

        WebDriver driver = new ChromeDriver();//ChromeDriver clasından oluşturduğum objeyi WebDriver interface'ine assign ettik.

        driver.get("https://google.com");//get() metodu ile istediğimiz adrese gidiyoruz

//        driver.close();//açılan son penceyi kapatır
        driver.quit(); //quit() metodu açılan tüm pecreleri kapatır.
    }
}
