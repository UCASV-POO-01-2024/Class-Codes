import banca.Banco;
import banca.Sucursal;
import banca.cuentas.Tarjeta;
import personas.Empleado;
import personas.Persona;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private static Banco banco; //En un caso real deberá ser una colección de bancos, no solamente uno

    public static void main(String[] args){
        banco = new Banco(1, "Banco Cuscatlán");

        //Sucursal
        Empleado gerente = new Empleado("05987412-8","Frederick","Martínez","03-07-1975","fmartinez@cusca.com","7399-6696","La Rábida",1,2000,"30","gerente");
        Empleado cajero = new Empleado("04487412-9","Michelle","Alfaro","14-08-1991","malfaro@cusca.com","7399-6696","Santa Tecla",2,950,"30","cajero");
        Empleado recepcionista = new Empleado("04545412-0","Mikhael","Ludemberg","03-03-1999","mludemberg@cusca.com","7399-6696","Merliot",3,500,"30","recepcionista");
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(cajero);
        empleados.add(recepcionista);
        Sucursal sucursal = new Sucursal(1,"Blvd. Los Próceres","2212-2000",gerente,empleados);
        banco.addSede(sucursal);

        run();
    }

    private static void run(){
        while(true){
            showMainMenu();
            int opt = readInteger();
            if(opt == 0) {
                System.out.println("Muchas gracias por preferirnos, hasta la próxima!");
                break;
            }else{
                branch(); //Acá deberían indicarse las sucursales de un banco específico
            }
        }
    }

    private static void branch(){
        while(true){
            showBranchMenu(banco.getSucursales());
            int opt = readInteger();
            if(opt == 0) break;
            else categories();
        }
    }

    private static void categories(){
        while(true){
            showCatMenu();
            int opt = readInteger();
            if(opt == 0) break;
            switch(opt){
                case 1: products(); break;
                case 2: operations(); break;
            }
        }
    }

    private static void products(){
        while(true){
            showProdMenu();
            int opt = readInteger();
            if(opt == 0) break;
            switch(opt){
                //Adquirir cuenta
                case 1:
                    /*
                        - Registrar cliente(s) que estarán asociados a la cuenta en la Sucursal.
                           -> Pedir los datos personales de cada uno de los clientes
                        - Crear cuenta y registrarla en el banco.
                     */
                    break;
                //Adquirir tarjeta
                case 2:
                    /*
                        - Pedir los datos de la persona
                        - Crear tarjeta, registrar el propietario, y registrarla en el banco
                     */
                    Tarjeta card = new Tarjeta(Tarjeta.createCardNumber(),"25-08-2030","433", Persona.crearPersona(),"credito","03-04-2024",2000);
                    banco.addTarjeta(card);
                    System.out.println("Felicidades! Tiene usted una nueva tarjeta :)");
                    System.out.println("El número de su nueva tarjeta es: "+card.getNumero());
                    System.out.println("Tenga un buen día.");
                    break;
            }
        }
    }

    private static void operations(){
        while(true){
            showOpsMenu();
            int opt = readInteger();
            if(opt == 0) break;
            switch(opt){
                //Abonar a cuenta
                case 1:
                    /*
                        - Pedir datos de la cuenta
                        - Pedir monto a depositar
                        - Crear una transacción solo con cuenta destino
                        - Registrar la transacción en la cuenta
                        - Actualizar saldo de la cuenta
                     */
                    break;
                //Retirar de cuenta
                case 2:
                    /*
                        - Pedir datos de la cuenta
                        - Pedir monto a retirar
                        - Crear una transacción solo con cuenta fuente
                        - Registrar la transacción en la cuenta
                        - Actualizar saldo de la cuenta
                     */
                    break;
                //Pagar tarjeta
                case 3:
                    /*
                        - Pedir datos de la tarjeta
                        - Pedir monto a pagar
                        - Utilizar método pagar() de la tarjeta.
                     */
                    System.out.println("Ingrese el número de la tarjeta:");
                    Tarjeta card = banco.getTarjeta(readString());
                    System.out.println("Ingrese el monto a pagar:");
                    card.pagar(readInteger());
                    System.out.println("Pago realizado con éxito! :)");
                    System.out.println("El nuevo saldo de su tarjeta es: "+card.getSaldo());
                    break;
                //Hacer transferencia
                case 4:
                    /*
                        - Pedir datos de la cuenta fuente
                        - Pedir datos de la cuenta destino
                        - Pedir monto a transferir
                        - Crear una nueva transacción
                        - Registrar la transacción en ambas cuentas
                        - Actualizar el saldo de ambas cuentas
                     */
                    break;
            }
        }
    }

    private static int readInteger(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static String readString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private static void showMainMenu(){
        System.out.println("Bienvenido al Sistema Bancario Nacional en Línea");
        System.out.println("*************************************************");
        System.out.println("Seleccione el banco al que desea acceder:");
        System.out.println("1. Banco Cuscatlán"); //Esto debería ser dinámico
        System.out.println("0. Salir");
    }

    private static void showBranchMenu(ArrayList<Sucursal> sucursales){
        System.out.println("Seleccione la sucursal que desea visitar:");
        Iterator<Sucursal> iter = sucursales.iterator();
        int cont = 1;
        while (iter.hasNext()) {
            System.out.println(cont+". "+iter.next().getDireccion());
        }
        System.out.println("0. Regresar al menú principal");
    }

    private static void showCatMenu(){
        System.out.println("Seleccione la opción de su interés:");
        System.out.println("1. Adquirir producto");
        System.out.println("2. Operación de caja");
        System.out.println("0. Regresar al menú anterior");
    }

    private static void showProdMenu(){
        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1. Adquirir cuenta");
        System.out.println("2. Adquirir Tarjeta");
        System.out.println("0. Regresar al menú anterior");
    }

    private static void showOpsMenu(){
        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1. Abonar a cuenta");
        System.out.println("2. Retirar de cuenta");
        System.out.println("3. Pagar tarjeta");
        System.out.println("4. Hacer una transferencia");
        System.out.println("0. Regresar al menú anterior");
    }
}
