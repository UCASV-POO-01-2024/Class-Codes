package util;

import java.util.Scanner;

public class GeneralUtilities {
    public static int readInteger(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static String readString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
