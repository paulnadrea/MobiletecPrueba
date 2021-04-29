package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.LoginUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {
    private final String mail;
    private final String contrasena;

    public LoginTask(String mail, String contrasena) {
        this.mail = mail;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(mail).into(LoginUI.INPUT_MAIL));
        actor.attemptsTo(Enter.theValue(contrasena).into(LoginUI.INPUT_CONTRASENA));
        actor.attemptsTo(Click.on(LoginUI.BUTTON_INICIARSESION));
    }

    public static Performable InicioSesion(String mail, String contrasena){
        return instrumented(LoginTask.class,mail,contrasena);
    }
}
