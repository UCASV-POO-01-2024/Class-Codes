package reservacion;

import personas.Client;

public class SpecialRequirementsHandler extends Handler {
    @Override
    public boolean handle(Client c) {
        String reqs = c.getSpecialRequirements();
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
