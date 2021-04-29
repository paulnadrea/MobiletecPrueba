package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class HomeUI {
    public static final Target BUTTON_CUENTA = Target.the("Boton cuenta").located(By.id("dropdownMenuLogin"));
    public static final Target BUTTON_INICIAR_SESION = Target.the("Boton iniciar sesion").located(By.cssSelector(".show > .dropdown-item:nth-child(1)"));
}
