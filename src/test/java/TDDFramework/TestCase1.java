package TDDFramework;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TDDFrameworkmain.TestPage;

public class TestCase1 {

    TestPage tp;

    @BeforeMethod
    public void openBrowser() {
        tp = new TestPage();
        tp.initializer();  // Corrected method name
    }
    
    @Test
    public void test() {
        String actTitle = tp.getPageTitle();
        String expTitle = "OrangeHRM";
        Assert.assertEquals(expTitle, actTitle);
    }
    
    @Test
    public void LoginValidate() {
        String url = tp.ValidateLogin();
        Assert.assertTrue(url.contains("dashboard"));
    }
    
    @AfterMethod
    public void closeBrowser() {
        tp.tearDown();
    }
}
