package reservation;

import personas.Cliente;

public class IncomeHandler extends Handler {
    @Override
    public boolean handle(Cliente c) {
        if(c.getIncome() >= 1000){
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
