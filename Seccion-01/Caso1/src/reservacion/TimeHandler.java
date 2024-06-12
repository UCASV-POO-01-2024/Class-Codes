package reservacion;

import personas.Client;

import java.time.LocalDateTime;

public class TimeHandler extends Handler {
    @Override
    public boolean handle(Client c) {
        LocalDateTime dt = LocalDateTime.now();

        //Evaluar si es un tiempo válido
        boolean pass = true; //Dependerá de la evaluación anterior

        if(pass){
            if(next != null){
                return next.handle(c);
            }else{
                return true;
            }
        } else {
            return false;
        }
    }
}
