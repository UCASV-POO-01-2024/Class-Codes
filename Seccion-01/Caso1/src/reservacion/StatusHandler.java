package reservacion;

import personas.Client;

public class StatusHandler extends Handler{
    @Override
    public boolean handle(Client c) {
        if(c.getCreditStatus().equals("good")){
            if(next != null){
                return next.handle(c);
            }else return true;
        }else return false;
    }
}
