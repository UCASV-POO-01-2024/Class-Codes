package reservation;

import personas.Cliente;

import java.time.LocalDate;

public class TimeHandler extends Handler {
    @Override
    public boolean handle(Cliente c) {
        LocalDate d = LocalDate.now();
        //Acá se evalúa si se cuenta con suficiente tiempo de antelación
        boolean result = true;
        if(result){
            if(next != null){
                return next.handle(c);
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
}
