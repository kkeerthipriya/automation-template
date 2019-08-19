package com.MMT.testautomation;

import com.MMT.testautomation.util.SerenityVar;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CustomDriver implements DriverSource {
    String ios6ua = "Mozilla/5.0 (iPhone; CPU iPhone OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A5376e Safari/8536.25";
    String winNT6 = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36";

    @Override
    public WebDriver newDriver(){
        WebDriver _driver = null;
        DesiredCapabilities capabilities = null;
        SerenityVar serenityVar = SerenityVar.getInstance();
        EnvironmentVariables variables = serenityVar.getSerenityProps();

        //Jenkins should provide which is the desired browser for the run
        String whichBrowser = variables.getProperty("forevernew.selectedBrowser");
       // String whichBrowser = System.getProperty("browserName").toLowerCase();

        if(whichBrowser.equalsIgnoreCase("chrome")){
            //System.setProperty("webdriver.chrome.driver","C:\\softwares\\chromedriver_win32\\chromedriver.exe");
            System.setProperty("webdriver.chrome.driver","D:\\Users\\d879869\\Desktop\\Selenium\\Drivers\\Drivers\\Chrome\\chromedriver.exe");
            capabilities = DesiredCapabilities.chrome();
            ChromeOptions options = new ChromeOptions();

            options.addArguments("test-type");
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            _driver = new ChromeDriver(capabilities);
        }else if(whichBrowser.equalsIgnoreCase("internet explorer")){
            System.setProperty("webdriver.ie.driver","C:\\Softwares\\IEDriverServer_x64_3.5.1\\IEDriverServer.exe");
            capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability(InternetExplorerDriver.
                    INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
            capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
            _driver = new InternetExplorerDriver(capabilities);
        } else if(whichBrowser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","C:\\Softwares\\geckodriver-v0.18.0-win64 (1)\\geckodriver.exe");/*keerthi added for firefox*/
            capabilities = DesiredCapabilities.firefox();
            _driver = new FirefoxDriver(capabilities);
            //FirefoxOptions options=new FirefoxOptions();/*keerthi added for firefox*/
            //options.addArguments("testing"); /*keerthi added for firefox*/


        }
        return _driver;
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }

}
