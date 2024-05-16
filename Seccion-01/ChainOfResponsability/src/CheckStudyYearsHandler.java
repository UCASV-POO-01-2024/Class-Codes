import java.time.LocalDate;

public class CheckStudyYearsHandler implements Handler{
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public boolean handle(Persona p) {
        LocalDate d = p.getFechaInicioEstudios();
        int studyYears = LocalDate.now().getYear() - d.getYear();
        if(studyYears <= 5){
            if(next == null){
                return true;
            }else return next.handle(p);
        }else return false;
    }
}
