package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import ui.BuscarUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarTask implements Task {
    private final String titulo;

    public BuscarTask(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(titulo).into(BuscarUI.INPUT_TITULO_BUSCAR));
        actor.attemptsTo(Enter.theValue(titulo).into(BuscarUI.INPUT_TITULO_BUSCAR).thenHit(Keys.ENTER));
    }

    public static Performable BuscarTitulo(String titulo){
        return instrumented(BuscarTask.class,titulo);
    }
}
