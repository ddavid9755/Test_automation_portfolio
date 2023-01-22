package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Helper {
    private WebDriver driver;

    public Helper(WebDriver driver){
        this.driver = driver;
    }

    public int checkLinks() {
        int count = 0;
        List<WebElement> links = driver.findElements(By.tagName("a"));
            System.out.println("Links count: " + links.size());
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
                        count++;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Broken links count: " + count);
            return count;
        }

    public int checkImages() {
            int count = 0;
            List<WebElement> images = driver.findElements(By.tagName("img"));
            System.out.println("Images count: " + images.size());
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
                        count++;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Broken images count: " + count);
        return count;
    }
}
