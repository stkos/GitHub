package HomeWork_ChMP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Lenovo on 27.03.2016.
 */
public class SimpleTest {
    @Test
    public void navigateToRozetkaWebSiteAndSerchForIPhone(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://rozetka.com.ua/");

        WebElement closeNotification = driver.findElement(By.cssSelector(".notificationPanelCross"));
        closeNotification.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //WebElement searchField = driver.findElement(By.xpath(".//*[@id='search']/form/div[1]/div[2]/input"));
		WebElement searchField = driver.findElement(By.cssSelector(".header-search-input-text.passive"));
        searchField.clear();
        searchField.sendKeys("iPhone 6s");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement searchButton = driver.findElement(By.cssSelector(".btn-link-i"));
        searchButton.click();


    }
}
