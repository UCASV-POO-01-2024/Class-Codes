package reservation;

import personas.Cliente;

public class CreditStatusHandler extends Handler {
    @Override
    public boolean handle(Cliente c) {
        if(c.getCreditStatus().equals("good")){
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
