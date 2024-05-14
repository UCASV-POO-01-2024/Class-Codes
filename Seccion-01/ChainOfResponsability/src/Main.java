import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Persona p = new Persona("Mary Poppins","carpintera",3,1,LocalDate.of(1994,5,14),LocalDate.of(2020,3,7));

        Handler chain = makeChain(new CheckProfessionHandler(), new CheckWFHandler(), new CheckRegHandler(), new CheckAgeHandler(), new CheckStudyYearsHandler());

        if(chain.handle(p)){
            System.out.println("Puedes participar :)");
        }else{
            System.out.println("No puedes participar :(");
        }
    }

    private static Handler makeChain(Handler first, Handler... theRest){
        Handler aux = first;
        for(Handler next: theRest){
            aux.setNext(next);
            aux = next;
        }

        return first;
    }
}
