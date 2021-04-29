package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.LoginQuestion;
import task.LoginTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDef {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^El usuario ingresa a la pagina web$")
    public void el_usuario_ingresa_a_la_pagina_web(){
        theActorCalled("usuario").attemptsTo(Open.url("https://librerianacional.com/usuario/iniciar-sesion"));
    }

    @When("^El usuario ingresa (.+) y (.+)$")
    public void el_usuario_ingresa_y(String mail, String contrasena) {
        theActorCalled("usuario").attemptsTo(LoginTask.InicioSesion(mail,contrasena));
    }

    @Then("^Debe ingresar al menu (.+)$")
    public void debe_ingresar_al_menu(String validatexto){
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginQuestion.loginvalidatext(validatexto)));
    }

}
