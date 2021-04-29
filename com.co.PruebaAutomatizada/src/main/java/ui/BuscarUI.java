package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscarUI {
    public static final Target INPUT_TITULO_BUSCAR = Target.the("Ingresa el titulo").located(By.xpath("//input[@type='text']"));
}
