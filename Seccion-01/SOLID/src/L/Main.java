package L;

public class Main {
    public static void main(String[] args) {
        Empleado e = new Empleado("Gary","Moppins",47,"magic land","451","jardinero",900);
        Empleado g = new Gerente("Mary","Poppins",47,"magic land","451",9000,"magic",15,5);

        System.out.println(e.superior().getNombre());
        System.out.println(g.superior().getNombre());
    }
}
