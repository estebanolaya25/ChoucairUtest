package co.com.choucair.crearusuario.utest.sterpdefinitions;
import co.com.choucair.crearusuario.utest.model.UtestCreateUserData;
import co.com.choucair.crearusuario.utest.tasks.*;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

public class CreateUtestUserStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());

    }

    @Given("^user browsed to utest page to create a new utest user$")
    public void userBrowsedToUtestPageToCreateANewUtestUser() {
      OnStage.theActorCalled("user").wasAbleTo(UtestStep1.thePage());
        throw new PendingException();
    }


    @When("^client provide information on the step1$")
    public void clientProvideInformationOnTheStep1(List<UtestCreateUserData> utestCreateUserData) {
        OnStage.theActorInTheSpotlight().attemptsTo(UtestStep1.onThePage(utestCreateUserData.get(0).getStrFistName(), utestCreateUserData.get(0).getStrLastName(),utestCreateUserData.get(0).getStrMonthBirth(), utestCreateUserData.get(0).getStrDayBirth(),utestCreateUserData.get(0).getStrYearBirth()));
        throw new PendingException();
    }

    @When("^client clicks in button next location$")
    public void clientClicksInButtonNextLocation() {
        OnStage.theActorCalled("client").wasAbleTo(UtestStep2.thePage());
        throw new PendingException();
    }

    @Then("^client goes to the step2$")
    public void clientGoesToTheStep2() {
        OnStage.theActorCalled("client").wasAbleTo(UtestStep2.thePage());
        throw new PendingException();
    }

    @When("^client provide information on step2$")
    public void clientProvideInformationOnStep2(List<UtestCreateUserData> utestCreateUserData) {
        OnStage.theActorInTheSpotlight().attemptsTo(UtestStep2.onThePage(utestCreateUserData.get(0).getStrCity(),utestCreateUserData.get(0).getStrZipCode(),utestCreateUserData.get(0).getStrCountry()));
        throw new PendingException();
    }

    @When("^client clicks on next devices button$")
    public void clientClicksOnNextDevicesButton() {
        OnStage.theActorCalled("client").wasAbleTo(UtestStep3.thePage());
        throw new PendingException();
    }

    @Then("^client goes to step3$")
    public void clientGoesToStep3() {
        OnStage.theActorCalled("client").wasAbleTo(UtestStep3.thePage());
        throw new PendingException();
    }

    @When("^client provide information on step3$")
    public void clientProvideInformationOnStep3(List<UtestCreateUserData> utestCreateUserData) {
        OnStage.theActorInTheSpotlight().attemptsTo(UtestStep3.onThePage(utestCreateUserData.get(0).getStrYourComputer(), utestCreateUserData.get(0).getStrVersion(),utestCreateUserData.get(0).getStrLenguage(),utestCreateUserData.get(0).getStrYourMobileDevice(),utestCreateUserData.get(0).getStrModel(),utestCreateUserData.get(0).getStrOperingSystem()));

        throw new PendingException();
    }

    @When("^client clicks on next last step$")
    public void clientClicksOnNextLastStep() {
        OnStage.theActorCalled("client").wasAbleTo(UtestLastStep.thePage());

        throw new PendingException();
    }

    @When("^cliente provide information on last step$")
    public void clienteProvideInformationOnLastStep(List<UtestCreateUserData> utestCreateUserData) {
        OnStage.theActorInTheSpotlight().attemptsTo(UtestLastStep.onThePage(utestCreateUserData.get(0).getStrPassWord(),utestCreateUserData.get(0).getStrConfimPassWord(),utestCreateUserData.get(0).isBoolStayInformed(),utestCreateUserData.get(0).isBoolReadAcceptTerm(),utestCreateUserData.get(0).isBoolReadAcceptPolicy()));

        throw new PendingException();
    }

    @When("^client clicks on complete setup$")
    public void clientClicksOnCompleteSetup() {
        OnStage.theActorCalled("client").wasAbleTo(UtestLogin.thePage());

        throw new PendingException();
    }

    @Then("^client created utest user$")
    public void clientCreatedUtestUser() {
             OnStage.theActorCalled("client").wasAbleTo(UtestLogin.thePage());
        throw new PendingException();
    }

}
