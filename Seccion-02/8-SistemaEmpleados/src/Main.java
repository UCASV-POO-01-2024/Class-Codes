import Empleado.*;
import Persona.Persona;

import javax.swing.plaf.synth.SynthUI;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<Empleado> listaDeEmpleados = new ArrayList<Empleado>();

    public static void main(String[] args) {
        menuPrincipal();
    }

    static void menuPrincipal(){

        Scanner sn = new Scanner(System.in);
        int opcion;
        while(true){
            mostrarMenuPrincipal();
            try{
                opcion = sn.nextInt();
                sn.nextLine();

                if(opcion == 0) {
                    System.out.println("Hasta pronto...");
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
                        mostrarDatosEmpleado();
                        break;
                    case 5:
                        mostrarReportesDeEmpleados();
                        break;
                    default:
                        System.out.println("\nPor favor, ingrese una opcion valida.\n");
                        break;
                }
            }catch (InputMismatchException e){
                sn.nextLine();
                System.out.println("\nPor favor, ingrese una opcion valida.\n");
            }
        }

    }

    private static void mostrarReportesDeEmpleados() {
        //Imprimiendo encabezado de la tabla
        System.out.println("\n#\t| Nombre\t\t| DUI\t\t\t| Salario");

        //Recorriendo la lista de empleados
        for (int i = 0; i < listaDeEmpleados.size(); i++) {
            Empleado emp = listaDeEmpleados.get(i);
            //Imprimiendo los datos del empleado actual
            System.out.println((i+1)+"\t| "+emp.getNombre()+"\t| "+emp.getDUI()+"\t| $"+emp.obtenerSalario());
        }
        System.out.println("\n");
    }

    private static void mostrarDatosEmpleado() {
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

    private static void agregarEmpleado(){
        int tipoEmpleado = obtenerTipoEmpleado();
        Empleado empleado = null;
        Scanner sn = new Scanner(System.in);

        //Pidiendo todos los datos personales
        System.out.println("Ingrese el DUI del empleado (incluyendo guiones):");
        String DUI = sn.nextLine();
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = sn.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del empleado en formato mm/dd/aaaa:");
        Date fechaNacimiento = new Date(sn.nextLine());
        System.out.println("Ingrese el telefono del empleado:");
        String telefono = sn.nextLine();
        System.out.println("Ingrese el sexo del empleado (H para Hombre y M para Mujer):");
        char sexo = sn.nextLine().charAt(0);

        Persona persona = new Persona(DUI, nombre, fechaNacimiento, telefono, sexo);

        //Pidiendo los datos del empleado
        System.out.println("Ingrese el carnet del empleado:");
        String carnet = sn.nextLine();
        System.out.print("Ingrese el salario base del empleado en USD: $");
        float salario = sn.nextFloat();
        //Limpiando buffer
        sn.nextLine();

        //Condicional para las rutinas por cada tipo de empleado
        switch (tipoEmpleado){
            case 1:
                empleado = new ETiempoCompleto(persona, carnet, salario);
                break;
            case 2:
                //Pidiendo el dato adicional del empleado a tiempo parcial
                System.out.println("Ingrese las horas de trabajo del empleado:");
                int horas = sn.nextInt();

                empleado = new ETiempoParcial(persona, carnet, salario, horas);
                break;
            case 3:
                empleado = new ETemporal(persona, carnet, salario);
                break;
        }

        //Agregando el empleado a la lista de empleados
        listaDeEmpleados.add(empleado);
    }

    private static int obtenerTipoEmpleado() {
        Scanner sn = new Scanner(System.in);
        int opcion;
        while(true) {
            try {
                System.out.println("Seleccione el tipo de empleado:\n"
                        + "\t1. Empleado a tiempo completo\n"
                        + "\t2. Empleado a tiempo parcial\n"
                        + "\t3. Empleado temporal"
                );
                System.out.print("Opcion > ");
                opcion = sn.nextInt();
                if(opcion >= 1 && opcion <= 3) return opcion;
                System.out.println("Ingrese una opcion valida");
            } catch (Exception e) {
                System.out.println("Ingrese una opcion valida");
            }
            sn.nextLine();
        }

    }

    static void mostrarMenuPrincipal(){
        System.out.println("Seleccione una opcion:\n"
            + "\t1. Agregar Empleado\n"
            + "\t2. Modificar Salario de Empleado\n"
            + "\t3. Eliminar Empleado\n"
            + "\t4. Mostrar reporte de Empleado\n"
            + "\t5. Mostrar reporte de todos los Empleado\n"
            + "\t0. Salir\n"
        );
        System.out.print("Opcion > ");
    }
}