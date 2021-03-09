package co.com.choucair.crearusuario.utest.tasks;
import co.com.choucair.crearusuario.utest.userinterface.UtestLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class UtestLastStep implements Task {
    private String strPassWord;
    private String strConfimPassWord;
    private boolean boolStayInformed;
    private boolean boolReadAcceptTerm;
    private boolean boolReadAcceptPolicy;


    public boolean isBoolStayInformed() {
        return boolStayInformed;
    }

    public void setBoolStayInformed(boolean boolStayInformed) {
        this.boolStayInformed = boolStayInformed;
    }

    public boolean isBoolReadAcceptTerm() {
        return boolReadAcceptTerm;
    }

    public void setBoolReadAcceptTerm(boolean boolReadAcceptTerm) {
        this.boolReadAcceptTerm = boolReadAcceptTerm;
    }

    public boolean isBoolReadAcceptPolicy() {
        return boolReadAcceptPolicy;
    }

    public void setBoolReadAcceptPolicy(boolean boolReadAcceptPolicy) {
        this.boolReadAcceptPolicy = boolReadAcceptPolicy;
    }

    public UtestLastStep (String strPassWord, String strConfimPassWord, boolean boolStayInformed, boolean boolReadAcceptTerm, boolean boolReadAcceptPolicy) {
        this.strPassWord = strPassWord;
        this.strConfimPassWord = strConfimPassWord;
        this.boolStayInformed = boolStayInformed;
        this.boolReadAcceptTerm = boolReadAcceptTerm;
        this.boolReadAcceptPolicy = boolReadAcceptPolicy;
    }
    public static UtestLastStep thePage( ){
        return Tasks.instrumented(UtestLastStep.class);

    }


    public  static UtestLastStep onThePage(String strPassWord, String strConfimPassWord, boolean boolStayInformed, boolean boolReadAcceptTerm, boolean boolReadAcceptPolicy){
        return Tasks.instrumented(UtestLastStep.class, strPassWord,  strConfimPassWord,  boolStayInformed,  boolReadAcceptTerm,  boolReadAcceptPolicy);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(strPassWord).into(UtestLastStepPage.PASSWORD),
                Enter.theValue(strConfimPassWord).into(UtestLastStepPage.CONFIRM_PASSWORD),
               // Enter.theValue(boolStayInformed).into(UtestLastStepPage.STAY_INFORMED),
                //Enter.theValue(boolReadAcceptTerm).toString().into(UtestLastStepPage.READ_AND_ACCEPT_TERMS),
                //Enter.theValue(boolReadAcceptPolicy).into(UtestLastStepPage.READ_AND_ACCEPT_PRIVACY_SECURITY_POLICY),
                Click.on(UtestLastStepPage.COMPLETE_SETUP));
    }


}
