import Page.ChildbirthAssistancePage;
import com.codeborne.selenide.Selenide;
import jdk.jfr.Description;
import org.junit.Test;

public class TestHome extends BaseTest{

    @Description("Тестове завдання")
    @Test()
    public void Test(){
        homePage.SearchingServices("народження дитини"); //2. В полі пошуку послуги набрати “народження дитини”.3. Натиснути піктограму пошуку.
        searchPage.clickServices();//4. На сторінці, яка відкриється після пошуку
        searchPage.selectChildbirthAssistanceServiceInMaterialTypeSection();//5.в розділі “За типом матеріалу” натиснути “Послуги”.У відфільтрованому списку матеріалів обрати “Допомога при народженні дитини”.
        childbirthAssistancePage.SendEmail("pishi_gdu@ukr.net");
        homePage.VisibilityHomePage();
    }
}
