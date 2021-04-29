package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PerfilUI {
    public static final Target INPUT_VALID = Target.the("El usuario valida su perfil y cuenta").located(By.xpath("//app-datos-personales/div/div"));
}
