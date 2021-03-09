package co.com.choucair.crearusuario.utest.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class UtestStep3Page {
    public static final Target SELECT_OS = Target.the("where we choice operaty system")
            .located(By.xpath("Select OS"));
    public static final  Target SELECT_VERSION = Target.the("where we choice the operaty system version")
            .located(By.xpath("Select a Version"));
    public static final Target SELECT_OS_LANGUAGE = Target.the("where we choice the operaty system language")
            .located(By.xpath("Select OS language"));
    public static final Target YOUR_MOBILE_DEVICE= Target.the("where we choice the mobile brand")
            .located(By.xpath("Select Brand"));
    public static final Target MODEL_DEVICE=Target.the("where we choice the mobile model")
            .located(By.xpath("Select a Model"));
    public static final Target OPERATING_SYSTEM=Target.the("where we choice the device operating system ")
            .located(By.xpath("Select OS"));
    public static  final  Target LAST_STEP=Target.the("botton to go  last step ")
            .located(By.xpath("Next: Last Step"));
}
