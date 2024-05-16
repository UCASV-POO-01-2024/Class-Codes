public class CheckRegHandler implements Handler{
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public boolean handle(Persona p) {
        if(p.getTimesReg() <= 5){
            if(next == null){
                return true;
            }else return next.handle(p);
        }else return false;
    }
}
