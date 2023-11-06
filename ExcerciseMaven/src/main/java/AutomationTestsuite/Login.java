package AutomationTestsuite;

import AutomationCommon.CommonBase;
import org.testng.annotations.*;

public class Login extends CommonBase {

    @BeforeTest
    public void openChrome(){
        driver = initChromeDriver("https://bepantoan.vn/");
    }

    @Test
    public void TestsEx(){
        System.out.println("Hello my first project!");
    }
}
