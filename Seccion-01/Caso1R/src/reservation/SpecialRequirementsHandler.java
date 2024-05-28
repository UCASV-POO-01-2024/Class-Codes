package reservation;

import personas.Cliente;

public class SpecialRequirementsHandler extends Handler {
    @Override
    public boolean handle(Cliente c) {
        String needs = c.getSpecialRequirements();
        //Acá se evalúa si se pueden cumplir los requerimientos adicionales del cliente
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
