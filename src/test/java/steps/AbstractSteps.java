package steps;

import basics.BaseUtil;
import com.fasterxml.jackson.databind.ser.Serializers;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by doai.tran on 8/20/2017.
 */
public class AbstractSteps extends BaseUtil{
    private BaseUtil base;
    public AbstractSteps(){
        this.base = base;
    }
    @Before
    public void initialize(){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void teardown(){
        driver.quit();
    }
}
