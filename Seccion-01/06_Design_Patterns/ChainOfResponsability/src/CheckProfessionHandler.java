public class CheckProfessionHandler implements Handler{
    private Handler next = null;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public boolean handle(Persona p) {
        if(p.getProfesion().equals("estudiante")){
            if(next == null){
                return true;
            }else return next.handle(p);
        }else return false;
    }
}
