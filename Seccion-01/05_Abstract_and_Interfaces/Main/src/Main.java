public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        Programador p = new Programador();

        System.out.println("El salario del gerente es: "+g.calcularSalario());
        System.out.println("El salario del programador es: "+p.calcularSalario());

        g.obtenerInfo();
        p.calcularSalario();

        PCPart pc = new PCPart();
        pc.setName("Motherboard");
        pc.setBrand("Intel");
        pc.setModel("FD03");

        System.out.println("Datos del componente: "+pc.getName()+" "+pc.getBrand()+" "+pc.getModel());

        System.out.println();
    }
}
