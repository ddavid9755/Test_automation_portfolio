package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Helper {
    private WebDriver driver;

    public Helper(WebDriver driver){
        this.driver = driver;
    }

    public void checkLinks() {
            List<WebElement> links = driver.findElements(By.tagName("a"));
            System.out.println("Total Link Size: " + links.size());
            for (int i = 0; i < links.size(); i++) {
                WebElement element = links.get(i);
                String url = element.getAttribute("href");
                try {
                    URL link = new URL(url);
                    HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
                    httpConn.connect();
                    int code = httpConn.getResponseCode();
                    if (code >= 400) {
                        System.out.println("Broken Link: " + url);
                    } else {
                        System.out.println("Valid Link: " + url);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    public HomePage checkImages() {
            List<WebElement> images = driver.findElements(By.tagName("img"));
            System.out.println("Total Images number: " + images.size());
            for (int i = 0; i < images.size(); i++) {
                WebElement element = images.get(i);
                String url = element.getAttribute("src");
                try {
                    URL link = new URL(url);
                    HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
                    httpConn.connect();
                    int code = httpConn.getResponseCode();
                    if (code >= 400) {
                        System.out.println("Broken Image: " + url);
                    } else {
                        System.out.println("Valid Image: " + url);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            driver.navigate().back();
            return new HomePage(driver);
    }
}
