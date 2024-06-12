package reservacion;

import personas.Client;

public class SpecialNeedsHandler extends Handler {
    @Override
    public boolean handle(Client c) {
        String needs = c.getSpecialNeeds();
        //Evaluar si se pueden cumplir
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
