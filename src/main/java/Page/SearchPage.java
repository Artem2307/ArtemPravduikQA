package Page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    private final static SelenideElement Services = $x("//div[contains(text(), 'Послуги')]");
    private final static SelenideElement ASSISTANCE_AT_THE_BIRTH_OF_A_CHILD = $x("//a[contains(text(),'Допомога при народженні дитини')]");

    @Step("розділі “За типом матеріалу” натиснути “Послуги” и Вибрати “Допомога при народженні дитини”")
    public void selectChildbirthAssistanceServiceInMaterialTypeSection(){
        clickServices();
        clickAssistanceAtTheBirthOfAChild();
    }

    public void clickServices(){
        Services.should(Condition.visible).click();
    }
    public void clickAssistanceAtTheBirthOfAChild(){
        ASSISTANCE_AT_THE_BIRTH_OF_A_CHILD.should(Condition.visible).click();
    }


}
