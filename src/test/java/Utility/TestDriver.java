package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.Locale;

public class Driver {

    private static ThreadLocal<WebDriver> threadDriver=new ThreadLocal<>();

    public static ThreadLocal<String> threadBrowserName=new ThreadLocal<>();

    public static WebDriver getDriver() {

        // extend report türkçe bilg çalışmaması sebebiyle eklendi
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language","EN");

        if(threadBrowserName.get()==null)
            threadBrowserName.set("chrome");

        if (threadDriver.get()==null){

            switch (threadBrowserName.get())
            {
                case "firefox": threadDriver.set(new FirefoxDriver()); break;
                case "safari" :threadDriver.set(new SafariDriver()); break;
                case "edge":threadDriver.set(new EdgeDriver()); break;
                default:threadDriver.set(new ChromeDriver());
            }
        }
        threadDriver.get().manage().window().maximize();
        threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        return threadDriver.get(); //bulunduğum threade driver ver
    }

    public static void quitDriver() {
        //test sonucu ekranı bir miktar beklesin diye
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //driver kapat
        if (threadDriver.get()!=null) { //driver var ise
            threadDriver.get().quit();

            WebDriver driver= threadDriver.get(); // direk eşitleme yapamadığım için, içindekini al
            driver=null;  // null a eşitle

            threadDriver.set(driver); // kendisine null olarak ver, bu hatta bir dolu driver yok
        }
    }
}