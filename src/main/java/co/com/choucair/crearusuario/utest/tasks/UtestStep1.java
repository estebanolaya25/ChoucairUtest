package co.com.choucair.crearusuario.utest.tasks;
import co.com.choucair.crearusuario.utest.userinterface.UtestStep1Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
public class UtestStep1 implements Task {
    private String strFistName;
    private String strLastName;
    private String strMonthBirth;
    private String strDayBirth;
    private String strYearBirth;

    public UtestStep1 (String strFistName, String strLastName, String strMonthBirth, String strDayBirth, String strYearBirth  ){
        this.strFistName=strFistName;
        this.strLastName=strLastName;
        this.strMonthBirth=strMonthBirth;
        this.strDayBirth=strDayBirth;
        this.strYearBirth=strYearBirth;
    }
    public static UtestStep1 thePage( ){
        return Tasks.instrumented(UtestStep1.class);
    }

    public static UtestStep1 onThePage(String strFistName, String strLastName, String strMonthBirth, String strDayBirth, String strYearBirth){
        return Tasks.instrumented(UtestStep1.class,strFistName,strLastName,strMonthBirth,strDayBirth,strYearBirth);

    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(strFistName).into(UtestStep1Page.FIRST_NAME),
                Enter.theValue(strLastName).into(UtestStep1Page.LAST_NAME),
                Enter.theValue(strMonthBirth).into(UtestStep1Page.MONTH_BIRTH),
                Enter.theValue(strDayBirth).into(UtestStep1Page.DAY_BIRTH),
                Enter.theValue(strYearBirth).into(UtestStep1Page.YEAR_BIRTH),
                Click.on(UtestStep1Page.NEXT_STEP2));

    }


}
