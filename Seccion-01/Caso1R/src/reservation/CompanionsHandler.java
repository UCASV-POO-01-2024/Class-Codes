package reservation;

import personas.Cliente;

public class CompanionsHandler extends Handler{
    @Override
    public boolean handle(Cliente c) {
        if(c.getCompanions() <= 5){
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
