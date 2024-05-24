import java.util.Scanner;

public class InputReceiver {
    public static int getData(int nops, String[] ops){
        System.out.println("Choose an option:");
        for (int i = 0; i < nops; ++i){
            System.out.println((i+1)+". "+ops[i]);
        }

        Scanner input = new Scanner(System.in);
        return input.nextInt() - 1;
    }
}
