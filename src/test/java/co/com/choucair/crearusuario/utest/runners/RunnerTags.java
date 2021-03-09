package co.com.choucair.crearusuario.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/createUtestUser.feature",
        tags = "@stories",
        glue = "co.com.choucair.crearusuario.utest/stepdefinitions.CreateUtestUserStepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {

}
