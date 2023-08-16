package Page;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    private final static SelenideElement SearchString = $x("//input[contains(@class, 'input form-search_input')]");//cтрока пошуку
    private final static SelenideElement SearchButton = $x("//input[contains(@class, 'btn btn_search-main')]");//нопка пошуку

    @Step("Набір данних в полі пошуку і клік на піктограму пошуку")
    public void SearchingServices(String services){
        Search(services);
        clickSearchButton();
    }
    public void Search(String services) {
        SearchString.should(Condition.visible).sendKeys(services);
    }
    public void clickSearchButton(){
        SearchButton.should(Condition.visible).click();
    }
    public void VisibilityHomePage(){
        SearchString.should(Condition.visible);
    }
}
