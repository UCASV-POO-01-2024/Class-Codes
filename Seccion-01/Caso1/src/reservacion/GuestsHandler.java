package reservacion;

import personas.Client;

import java.time.LocalDateTime;

public class GuestsHandler extends Handler {
    @Override
    public boolean handle(Client c) {
        if(c.getCompanions() <= 5){
            if(next != null){
                return next.handle(c);
            }else return true;
        }else return false;
    }
}
