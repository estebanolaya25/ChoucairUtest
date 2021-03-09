package co.com.choucair.crearusuario.utest.userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
@DefaultUrl("https://www.utest.com/signup/personal")
public class UtestStep1Page extends PageObject {

    public static final Target FIRST_NAME = Target.the("where do we write out first name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("where do we write our last name")
            .located(By.id("lastName"));
    public static final Target EMMAIL = Target.the("where do we write our email")
            .located(By.id("email"));
    public static final Target MONTH_BIRTH = Target.the("where we choice the month of birth")
            .located(By.id("birthMonth"));
    public static final  Target DAY_BIRTH = Target.the("where we choice the day of birth")
            .located(By.id("birthDay"));
    public static final Target YEAR_BIRTH = Target.the("where we choice the year of birth")
            .located(By.id("birthYear"));
    public static final Target LANGUAGES = Target.the("where do we write our languages")
            .located(By.className("ui-select-search input-xs ng-valid ng-dirty ng-touched ng-empty"));

    public  static  final  Target NEXT_STEP2 = Target.the("botton to go step 2")
            .located(By.xpath("Next step - define your location"));

}
