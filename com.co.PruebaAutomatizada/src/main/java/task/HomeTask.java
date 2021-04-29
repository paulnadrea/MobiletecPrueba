package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.HomeUI;
import ui.LoginUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomeUI.BUTTON_CUENTA));
        actor.attemptsTo(Click.on(HomeUI.BUTTON_INICIAR_SESION));
    }

    public static Performable Iniciar(){
        return instrumented(HomeTask.class);
    }
}
