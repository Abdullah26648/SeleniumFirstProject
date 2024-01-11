package My_First_Selenium_Package;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_GetPosition_SetPosition {
    /*
     Go to the Amazon URL : https://www.clarusway.com/
     Print the position and size of the page.
     Adjust the position and size of the page as desired.
     Test that the page is in the position and size you want.
     Close the page.
    */
    public static void main(String[] args) throws InterruptedException {
        //     Go to the Amazon URL : https://www.clarusway.com/
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.clarusway.com/");

        //     Print the position and size of the page.
        System.out.println("Position: " + driver.manage().window().getPosition());
        System.out.println("Size: " + driver.manage().window().getSize());

        //     Adjust the position and size of the page as desired.
        Point targetposition = new Point(500,200);
        Dimension targetsize = new Dimension(300,300);

        driver.manage().window().setPosition(targetposition);
        driver.manage().window().setSize(targetsize);

        //     Test that the page is in the position and size you want.
        int x = driver.manage().window().getPosition().getX();
        int y = driver.manage().window().getPosition().getY();

        int height = driver.manage().window().getSize().getHeight();
        int width = driver.manage().window().getSize().getWidth();

        if (x == 500 && y == 200 && height == 300 && width == 516){
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAİLED");
        }
        //     Close the page.
        Thread.sleep(3000);

        driver.quit();
    }
}