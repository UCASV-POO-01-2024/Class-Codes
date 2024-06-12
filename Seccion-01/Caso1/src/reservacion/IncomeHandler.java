package reservacion;

import personas.Client;

public class IncomeHandler extends Handler {
    @Override
    public boolean handle(Client c) {
        if(c.getIncome() >= 1000){
            if(next != null){
                return next.handle(c);
            }else return true;
        }else return false;
    }
}
