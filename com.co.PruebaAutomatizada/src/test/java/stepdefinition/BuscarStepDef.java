package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BuscarStepDef {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^El usuario busca un titulo$")
    public void el_usuario_busca_un_titulo() {
    }

    @When("^ El usuario ingresa el (.+) a buscar$")
    public void el_usuario_ingresa_el_a_buscar(String titulo)  {
    }

    @Then("^Debe validar el resultado (.+)$")
    public void debe_validar_el_resultado(String validaresultado)  {
    }
}
