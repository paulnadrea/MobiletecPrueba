package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.IngresarUI;

public class HomeQuestion implements Question {
    private final String validatexto;

    public HomeQuestion(String validatexto) {
        this.validatexto = validatexto;
    }

    @Override
    public Object answeredBy(Actor actor) {
        if(Text.of(IngresarUI.INPUT_VALID).viewedBy(actor).asString().equals(validatexto.toString()))
            return true;
        else
            return false;
    }

    public static HomeQuestion BotonValida(String validatexto){
        return new HomeQuestion(validatexto);
    }
}
