package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.HomeQuestion;
import question.LoginQuestion;
import task.HomeTask;
import task.LoginTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HomeStepDef {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^El usuario ingresa al home de la pagina web$")
    public void el_usuario_ingresa_al_home_de_la_pagina_web(){
        theActorCalled("usuario").attemptsTo(Open.url("https://librerianacional.com"));
    }

    @When("^El usuario da clic en mi (.+) y luego en (.+)$")
    public void el_usuario_da_clic_en_mi_y_luego_en(String cuenta, String iniciarsesion) {
        theActorCalled("usuario").attemptsTo(HomeTask.Iniciar());
    }

    @Then("^ Debe aparecer la pagina de ingresar credenciales (.+)$")
    public void debe_aparecer_la_pagina_de_ingresar_credenciales(String validaboton){
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(HomeQuestion.BotonValida(validaboton)));
    }

}
