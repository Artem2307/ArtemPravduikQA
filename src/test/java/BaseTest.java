import Page.ChildbirthAssistancePage;
import Page.HomePage;
import Page.SearchPage;
import Setting.SelenidSetting;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;


public class BaseTest {
    SelenidSetting selenidSetting = new SelenidSetting();
    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    ChildbirthAssistancePage childbirthAssistancePage = new ChildbirthAssistancePage();

    @Before
    public void BeforeTest(){
        selenidSetting.setting();
    }
    @After
    public void AfterTest(){
        Selenide.close();
    }
}
