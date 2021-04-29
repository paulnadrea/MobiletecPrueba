package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {
    public static final Target INPUT_MAIL = Target.the("Ingresa el mail").located(By.name("usuario"));
    public static final Target INPUT_CONTRASENA = Target.the("Ingresa la contraseña").located(By.name("contrasena"));
    public static final Target BUTTON_INICIARSESION = Target.the("Boton iniciar sesion").located(By.xpath("//button[@type='submit']"));
}
