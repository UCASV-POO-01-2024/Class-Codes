package reservation;

import personas.Cliente;

public class SpecialNeedsHandler extends Handler {
    @Override
    public boolean handle(Cliente c) {
        String needs = c.getSpecialNeeds();
        //Acá se evalúa si se puede asistir al cliente en todo momento
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
