package co.com.choucair.crearusuario.utest.tasks;
import co.com.choucair.crearusuario.utest.userinterface.UtestStep3Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
public class UtestStep3 implements Task{
    private String strYourComputer;
    private String strVersion;
    private String strLenguage;
    private String strYourMobileDevice;
    private String strModel;
    private String strOperingSystem;

    public UtestStep3(String strYourComputer, String strVersion, String strLenguage, String strYourMobileDevice, String strModel, String strOperingSystem) {
        this.strYourComputer = strYourComputer;
        this.strVersion = strVersion;
        this.strLenguage = strLenguage;
        this.strYourMobileDevice = strYourMobileDevice;
        this.strModel = strModel;
        this.strOperingSystem = strOperingSystem;
    }
    public static UtestStep3 thePage( ){
        return Tasks.instrumented(UtestStep3.class);
    }

    public  static UtestStep3 onThePage(String strYourComputer, String strVersion, String strLenguage, String strYourMobileDevice, String strModel, String strOperingSystem){
        return Tasks.instrumented(UtestStep3.class, strYourComputer,  strVersion,  strLenguage,  strYourMobileDevice,  strModel,  strOperingSystem);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(strYourComputer).into(UtestStep3Page.SELECT_OS),
                Enter.theValue(strVersion).into(UtestStep3Page.SELECT_VERSION),
                Enter.theValue(strLenguage).into(UtestStep3Page.SELECT_OS_LANGUAGE),
                Enter.theValue(strYourMobileDevice).into(UtestStep3Page.MODEL_DEVICE),
                Enter.theValue(strModel).into(UtestStep3Page.YOUR_MOBILE_DEVICE),
                Enter.theValue(strOperingSystem).into(UtestStep3Page.OPERATING_SYSTEM),
                Click.on(UtestStep3Page.LAST_STEP));
    }


}
