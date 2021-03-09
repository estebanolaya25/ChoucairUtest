package co.com.choucair.crearusuario.utest.tasks;
import co.com.choucair.crearusuario.utest.userinterface.UtestStep2Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
public class UtestStep2 implements Task{
    private String strCity;
    private String strZipCode;
    private String strCountry;

    public UtestStep2 (String strCity,String strZipCode,String strCountry){
        this.strCity=strCity;
        this.strZipCode=strZipCode;
        this.strCountry=strCountry;
    }
    public static UtestStep2 thePage( ){
        return Tasks.instrumented(UtestStep2.class);
    }


    public  static UtestStep2 onThePage(String strCity,String strZipCode,String strCountry){
        return Tasks.instrumented(UtestStep2.class,strCity,strZipCode,strCountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(strCity).into(UtestStep2Page.CITY),
                Enter.theValue(strZipCode).into(UtestStep2Page.ZIP_CODE),
                Enter.theValue(strCountry).into(UtestStep2Page.COUNTRY),
                Click.on(UtestStep2Page.NEXT_STEP3));
    }


}
