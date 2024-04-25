import Empleado.*;
import Persona.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<Empleado> listaDeEmpleados = new ArrayList<Empleado>();

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        Scanner sn = new Scanner(System.in);
        int opcion;
        while(true){
            try {
                imprimirMenu();
                opcion = sn.nextInt();
                sn.nextLine();

                if(opcion == 0){
                    System.out.println("\nHasta pronto...");
                    break;
                }

                switch (opcion){
                    case 1:
                        agregarEmpleado();
                        break;
                    case 2:
                        modificarSalarioEmpleado();
                        break;
                    case 3:
                        eliminarEmpleado();
                        break;
                    case 4:
                        mostrarEmpleado();
                        break;
                    case 5:
                        mostrarListaEmpleados();
                        break;
                    default:
                        System.out.println("\nPor favor seleccione una opcion del menu\n");
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("\nPor favor ingrese un dato valido\n");
                sn.nextLine();
            }
        }
    }

    private static void mostrarListaEmpleados() {
        System.out.println("\n#\t|Nombre\t\t\t|Telefono\t|Carnet\t|Salario");
        for (int i = 0; i < listaDeEmpleados.size(); i++) {
            Empleado emp = listaDeEmpleados.get(i);
            System.out.println(
                    (i+1)
                    +"\t|"+emp.getNombre()
                    +"\t|"+emp.getTelefono()
                    +"\t|"+emp.getCarnet()
                    +"\t|$"+emp.obtenerSalario()
            );
        }
        System.out.println("\n");
    }

    private static void mostrarEmpleado() {
        Scanner sn = new Scanner(System.in);
        //Pidiendo el carnet del empleado a mostrar
        System.out.println("Ingrese el carnet del empleado a mostrar:");
        String carnet = sn.nextLine();

        //Recorriendo la lista de empleados hasta encontrar el empleado que buscamos
        for (int i = 0; i < listaDeEmpleados.size(); i++) {
            //Evaluando si el empleado actual coincide con el carnet
            if (listaDeEmpleados.get(i).getCarnet().equals(carnet)){
                Empleado emp = listaDeEmpleados.get(i);
                //Imprimiendo los datos

                System.out.println("DUI del empleado: "+emp.getDUI());
                System.out.println("Nombre del empleado: "+emp.getNombre());
                //Formateando la fecha para tener dd/mm/aaaa
                String fechaFormato =
                        emp.getFechaNacimiento().getDate() + "/" +
                                (emp.getFechaNacimiento().getMonth()+1) + "/" + //Date guarda los meses entre 0 y 11, por lo que le sumamos 1
                                (emp.getFechaNacimiento().getYear()+1900); //Date resta 1900 en getYear(), asi que se lo sumamos de nuevo
                System.out.println("Fecha de nacimiento del empleado en formato dd/mm/aaaa: "+fechaFormato);
                System.out.println("Telefono del empleado: "+emp.getDUI());
                System.out.println("Sexo del empleado (H para Hombre y M para Mujer): "+emp.getSexo());
                System.out.println("Carnet del empleado: "+emp.getCarnet());
                System.out.println("Salario base del empleado en USD: $"+emp.getSalarioBase());
                System.out.println("Salario neto del empleado en USD: $"+emp.obtenerSalario()+"\n");

                //Se finaliza la ejecucion ya que no hace falta seguir iterando
                return;
            }
        }
    }

    private static void eliminarEmpleado() {
        Scanner sn = new Scanner(System.in);
        //Pidiendo el carnet del empleado a eliminar
        System.out.println("Ingrese el carnet del empleado a eliminar:");
        String carnet = sn.nextLine();

        //Recorriendo la lista de empleados hasta encontrar el empleado que buscamos
        for (int i = 0; i < listaDeEmpleados.size(); i++) {
            //Evaluando si el empleado actual coincide con el carnet
            if (listaDeEmpleados.get(i).getCarnet().equals(carnet)){
                //Si coincide se elimina de la lista
                listaDeEmpleados.remove(i);
                System.out.println("\nEmpleado eliminado exitosamente...\n");

                //Se finaliza la ejecucion ya que no hace falta seguir iterando
                return;
            }
        }
    }

    private static void modificarSalarioEmpleado() {
        Scanner sn = new Scanner(System.in);
        //Pidiendo el carnet del empleado a modificar
        System.out.println("Ingrese el carnet del empleado a modificar:");
        String carnet = sn.nextLine();

        //Recorriendo la lista de empleados hasta encontrar el empleado que buscamos
        for (int i = 0; i < listaDeEmpleados.size(); i++) {
            //Evaluando si el empleado actual coincide con el carnet
            if (listaDeEmpleados.get(i).getCarnet().equals(carnet)){
                //Si coincide se solicita el nuevo salario concatenando el nombre del empleado
                System.out.print("\nIngrese el nuevo salario de "+listaDeEmpleados.get(i).getNombre()+" en USD: $");
                float nuevoSalario = sn.nextFloat();

                //Se reasigna el salario
                listaDeEmpleados.get(i).setSalarioBase(nuevoSalario);

                //Se imprime
                System.out.println("\nSalario de "+listaDeEmpleados.get(i).getNombre()+" actualizado exitosamente...\n");

                //Se finaliza la ejecucion ya que no hace falta seguir iterando
                return;
            }
        }
    }

    private static void agregarEmpleado() {
        Scanner sn = new Scanner(System.in);
        String DUI;
        String nombre;
        Date fechaNacimiento;
        char sexo;
        String telefono;

        System.out.println("Ingrese el DUI del empleado:");
        DUI = sn.nextLine();
        System.out.println("Ingrese el nombre del empleado:");
        nombre = sn.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del empleado (mm/dd/aaaa):");
        fechaNacimiento = new Date(sn.nextLine());
        System.out.println("Ingrese el sexo del empleado (H si es Hombre o M si es Mujer):");
        sexo = sn.nextLine().toUpperCase().charAt(0);
        System.out.println("Ingrese el telefono del empleado (con guiones):");
        telefono = sn.nextLine();

        Persona persona = new Persona(DUI, nombre, fechaNacimiento, sexo, telefono);

        String carnet;
        float salarioBase;
        System.out.println("Ingrese el carnet del empleado:");
        carnet = sn.nextLine();
        System.out.println("Ingrese el salario base del empleado en USD:");
        System.out.print("$");
        salarioBase = sn.nextFloat();
        sn.nextLine();

        int tipoEmpleado = obtenerTipoEmpleado();
        Empleado empleado = null;

        switch (tipoEmpleado){
            case 1:
                empleado = new ETiempoCompleto(persona, carnet, salarioBase);
                break;
            case 2:
                System.out.println("Ingrese la cantidad de horas de trabajo base del empleado:");
                int horasBase = sn.nextInt();
                empleado = new ETiempoParcial(persona, carnet, salarioBase, horasBase);
                break;
            case 3:
                empleado = new ETemporal(persona, carnet, salarioBase);
                break;
        }

        System.out.println("\nEmpleado agregado exitosamente...\n");

        listaDeEmpleados.add(empleado);
    }

    private static int obtenerTipoEmpleado() {
        Scanner sn = new Scanner(System.in);
        int opcion;
        while (true) {
            try{
                System.out.println("Seleccione una opcion:\n"
                        + "\t1. Empleado a tiempo completo\n"
                        + "\t2. Empleado a tiempo parcial\n"
                        + "\t3. Empleado a temporal"
                );
                System.out.print("Opcion -> ");
                opcion = sn.nextInt();
                if(opcion >= 1 && opcion <= 3) return opcion;
                System.out.println("\nPor favor ingrese una opcion valida\n");
            }catch(Exception e){
                System.out.println("\nPor favor ingrese un dato valido\n");
            }finally {
                sn.nextLine();
            }
        }

    }

    private static void imprimirMenu() {
        System.out.println("Seleccione una opcion:\n"
                + "\t1. Agregar Empleado\n"
                + "\t2. Modificar Salario Base de un Empleado\n"
                + "\t3. Eliminar Empleado\n"
                + "\t4. Mostrar datos de un Empleado\n"
                + "\t5. Mostrar todos los Empleados\n"
                + "\t0. Salir"
        );
        System.out.print("Opcion -> ");
    }
}