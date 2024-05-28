package wrappers;

import java.util.Scanner;

public class MenuLoginWrapper extends BaseWrapper {
    public MenuLoginWrapper(Component wrappee) {
        super(wrappee);
    }

    @Override
    public void hacer() {
        boolean flag = true;
        do {
            execute();

            Scanner input = new Scanner(System.in);
            int op = input.nextInt();

            switch (op) {
                case 1:

                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Opción inválida! ");
            }
        }while(flag);
    }
}
