package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.PerfilUI;

public class LoginQuestion implements Question {
    private final String validatexto;

    public LoginQuestion(String validatexto) {
        this.validatexto = validatexto;
    }

    @Override
    public Object answeredBy(Actor actor) {
        if(Text.of(PerfilUI.INPUT_VALID).viewedBy(actor).asString().equals(validatexto.toString()))
            return true;
        else
            return false;

    }

    public static LoginQuestion loginvalidatext(String validatexto){
        return new LoginQuestion(validatexto);
    }
}
