public class Main {
    public static void main(String[] args){
        Gerente g = new Gerente();
        Cajero c = new Cajero();

        g.setCodigo(123);
        c.setCodigo(125);

        System.out.println("El salario del gerente es "+g.calcularSalario());
        System.out.println("El salario del cajero es "+c.calcularSalario());

        Motherboard m = new Motherboard();
        m.setBrand("Intel");
        m.setModel("TK1000");

        System.out.println(m.getBrand()+", "+m.getModel());
    }
}
