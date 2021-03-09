package co.com.choucair.crearusuario.utest.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class UtestLastStepPage {
    public static final Target PASSWORD =Target.the("where we write the password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD=Target.the("where we write the password confirmation")
            .located(By.id("confirmPassword"));
    public static final Target STAY_INFORMED =Target.the("where we check to by informed through mail")
            .located(By.xpath("checkmark signup-consent__checkbox signup-consent__checkbox--highlight"));
    public static final Target READ_AND_ACCEPT_TERMS=Target.the("where we check to accept the terms of use and conduct code")
            .located(By.xpath("{error: userForm.termOfUse.$error.required}"));
    public static final Target READ_AND_ACCEPT_PRIVACY_SECURITY_POLICY=Target.the("where we check to accept de privacy and security policy")
            .located(By.xpath("{error: userForm.privacySetting.$error.required}"));
    public static  final Target COMPLETE_SETUP=Target.the("button to complete setup")
            .located(By.xpath("Complete Setup"));
}
