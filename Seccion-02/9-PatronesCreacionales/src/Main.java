import AbstractFactory.AbstractFactoryClient;
import Builder.*;
import Enums.Materiales;
import Factory.*;
import Singleton.*;

import java.util.ArrayList;
import java.util.Scanner;

import static Enums.Materiales.*;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        //-----------Singleton---------------------
        //No existen instancias de Singleton (instance = null)
        SingletonLazy.getInstance().printMessage("Hola Mundo");
        //Ya existe una instancia de Singleton
        SingletonLazy.getInstance().printMessage("Soy un programador Java");

        //Demostrando que no se crean instancias de SingletonEager durante la ejecucion
        //System.out.print("\nPresione Enter para generar Singleton Eager...");
        //sn.nextLine();
        //SingletonEager.getInstance().printMessage("Soy un programador Eager");

        //-----------SimpleFactory---------------------
        System.out.println("\n----------------------------------\n");
        ArrayList<Padre> hijos = new ArrayList<Padre>();
        String[] atributos = {"Hola", "Mundo"};
        try {
            hijos.add(SimpleFactory.getInstance().getHijo("1", atributos));
            System.out.println(hijos.get(0).getAttr1());
        }catch (Exception e){
            System.out.println(e);
        }

        //-----------FactoryMethod---------------------
        System.out.println("\n----------------------------------\n");
        FactoryMethodClient cliente = new FactoryMethodClient();
        Padre hijo2 = cliente.obtenerPadre("2", atributos);
        System.out.println(hijo2.getAttrH()[1]);

        //-----------AbstractFactory 😪---------------------
        System.out.println("\n----------------------------------\n");

        AbstractFactoryClient cliente2 = new AbstractFactoryClient(MADERA);
        System.out.println(cliente2.createArmario().getMaterial());
        cliente2.setCurrentFactory(METAL);
        System.out.println(cliente2.createArmario().getMaterial());

        //-----------Builder---------------------
        PCBuilder zonaDigital = new PCBuilder();

    }
}