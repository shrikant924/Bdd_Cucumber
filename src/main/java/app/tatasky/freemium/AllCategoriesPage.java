package app.tatasky.freemium;

import core.uiactions.UiActions;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class AllCategoriesPage extends UiActions {
    public AllCategoriesPage(MobileDriver<MobileElement> driver) {
        super(driver);
    }

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/iv_bg_category"),
    @FindBy(id = "com.tatasky.binge:id/iv_bg_category")})
    private List<MobileElement> AllCategories;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_categories"),
    @FindBy(id = "com.tatasky.binge:id/tv_categories")})
    private List<MobileElement> Dropdown_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/search_icon"),
    @FindBy(id = "com.tatasky.binge:id/search_icon")})
    private MobileElement Search_Icon;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_close"),
    @FindBy(id = "com.tatasky.binge:id/tv_close")})
    private MobileElement categaries_close;


    public void tapOnDanceButton() {
        tap(AllCategories.get(1));
    }

    public void tapOnCategory(String Label) {
        waitToAppear(categaries_close);
        waitTime(5000);
        tap(driver.findElement(By.xpath("//android.widget.TextView[@text='" + Label + "']")));
    }


    public boolean isSelectedCategoryPageOpened(String str) {
       waitToAppear(Dropdown_Btn.get(0));
       return isElementPresent(driver.findElement(By.xpath("//android.widget.TextView[@text='" + str + "']")));
    }


}

