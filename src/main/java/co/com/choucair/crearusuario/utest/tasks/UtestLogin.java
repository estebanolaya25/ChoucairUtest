package co.com.choucair.crearusuario.utest.tasks;
import co.com.choucair.crearusuario.utest.userinterface.UtestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
public class UtestLogin implements Task{
    private String strUser;
    private String strPassword;

    public UtestLogin(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    public static UtestLogin thePage( ){
        return Tasks.instrumented(UtestLogin.class);

    }

    public  static UtestLogin onThePage(String strUser, String srtPassword) {
        return Tasks.instrumented(UtestLogin.class, strUser, srtPassword);
    }

        @Override
        public <T extends Actor> void performAs(T actor){
            actor.attemptsTo(Enter.theValue(strUser).into(UtestLoginPage.INPUT_USER),
                    Enter.theValue(strPassword).into(UtestLoginPage.INPUT_PASSWORD),
                    Click.on(UtestLoginPage.ENTER_BUTTON));
        }
}
