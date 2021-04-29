package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.BuscarUI;
import ui.IngresarUI;

public class BuscarQuestion implements Question {
    private final String validatexto;

    public BuscarQuestion(String validatexto) {
        this.validatexto = validatexto;
    }

    @Override
    public Object answeredBy(Actor actor) {
        if(Text.of(BuscarUI.INPUT_TITULO_BUSCAR).viewedBy(actor).asString().equals(validatexto.toString()))
            return true;
        else
            return false;
    }

    public static BuscarQuestion Valida(String validatexto){
        return new BuscarQuestion(validatexto);
    }
}
