package co.com.choucair.crearusuario.utest.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class UtestStep2Page {
    public static final Target CITY = Target.the("where we do write the city actually we are")
            .located(By.id("city"));
    public static final Target ZIP_CODE= Target.the("where we do write our zip or postal code")
            .located(By.id("zip"));
    public static final Target COUNTRY= Target.the("where we choice our country")
            .located((By.className("ui-select-match-text pull-left")));
    public  static  final  Target NEXT_STEP3 = Target.the("botton to go step 3")
            .located(By.xpath("Next: Devices"));

}
