package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarUI {
    public static final Target INPUT_VALID = Target.the("El usuario seleciona el boton mail y cuenta").located(By.cssSelector(".row:nth-child(1) > .col-12:nth-child(5) .d-flex > .d-flex:nth-child(1)"));
}
