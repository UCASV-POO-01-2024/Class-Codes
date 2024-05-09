import java.util.ArrayList;
import java.util.Iterator;

public class EmpleadoMediator implements Mediator{
    private ArrayList<Empleado> empleados;

    public EmpleadoMediator(){
        empleados = new ArrayList<Empleado>();
    }

    @Override
    public void add(Empleado e) {
        empleados.add(e);
    }

    private Empleado getEmpleado(String ID){
        Iterator<Empleado> iter = empleados.iterator();
        Empleado e = null;
        while(iter.hasNext()){
            e = iter.next();
            if(e.getID().equals(ID)){
                break;
            }
        }
        return e;
    }

    @Override
    public void notify(String msg, String to, String from) {
        /*
            0: CEO
            1: Gerente
            2: Cajero
         */
        String comm = String.valueOf(from.charAt(0)) + String.valueOf(to.charAt(0));
        switch (comm){
            case "00":
                System.out.println("Comunicación errónea, solo puede haber un CEO.");
                break;
            case "01":
                System.out.println("URGENT TRANSMISSION FROM CEO TO MANAGEMENT");
                getEmpleado(to).receiveMessage("From CEO: "+msg);
                break;
            case "02":
                System.out.println("Comunicación errónea, CEO se comunica a través del Management");
                break;
            case "10":
                System.out.println("Executing protocol #4: Management -> CEO");
                getEmpleado(to).receiveMessage("Interaction Request from "+from+": "+msg);
                break;
            case "11":
                System.out.println("Internal mail procedure");
                getEmpleado(to).receiveMessage("From "+from+": "+msg);
                break;
            case "12":
                System.out.println("Direct Order Announcement");
                getEmpleado(to).receiveMessage(msg);
                break;
            case "20":
                System.out.println("Comunicación errónea, mensajes deben ser enviados a Management.");
                break;
            case "21":
                System.out.println("Formal Request Procedure");
                getEmpleado(to).receiveMessage("Request "+from+": "+msg);
                break;
            case "22":
                getEmpleado(to).receiveMessage(msg);
        }
    }
}
