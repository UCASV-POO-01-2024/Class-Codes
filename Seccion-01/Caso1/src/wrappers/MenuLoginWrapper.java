package wrappers;

import hotel.Hotel;
import menufactory.MenuAdministradorFactory;
import menufactory.MenuClientFactory;
import menufactory.MenuFactory;
import personas.Administrador;
import personas.Client;
import personas.Persona;
import util.InteractionUtilities;

import java.util.Scanner;

public class MenuLoginWrapper extends BaseWrapper {

    public MenuLoginWrapper(Component wrappee) {
        super(wrappee);
    }

    public void hacer() {
        boolean flag = true;
        Scanner input = new Scanner(System.in);

        do {
            execute();

            System.out.print("Ingrese la opción deseada: ");
            int op = input.nextInt();

            switch (op) {
                case 1:
                    Persona p = InteractionUtilities.authenticate(input);
                    if (p != null) {
                        MenuFactory mf;
                        BaseWrapper bw;
                        if (p instanceof Administrador) {
                            mf = new MenuAdministradorFactory();
                            bw = new MenuAdministradorWrapper(mf.createMenu());
                            Hotel.getInstance().setActiveUser(((Administrador) p).getUsername());
                        } else {
                            mf = new MenuClientFactory();
                            bw = new MenuClientWrapper(mf.createMenu());
                            Hotel.getInstance().setActiveUser(((Client) p).getUsername());
                        }
                        bw.hacer();
                    } else {
                        System.out.println("Usuario o contraseña incorrecto.");
                    }
                    break;
                case 0:
                    flag = false;
                    Hotel.getInstance().setActiveUser(null);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (flag);
    }
}
