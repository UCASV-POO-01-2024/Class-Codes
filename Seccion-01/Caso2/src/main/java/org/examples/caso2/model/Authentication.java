package org.examples.caso2.model;

import org.examples.caso2.gui.viewers.LoginApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Authentication {
    private static String activeUserType = null;

    public static boolean authenticate(String user, String pass) {
        boolean ans = false;
        File accts = new File(LoginApplication.class.getResource("accounts.txt").getPath());
        try {
            Scanner sc = new Scanner(accts);
            while (sc.hasNextLine()) {
                String[] data = sc.nextLine().split(",");
                if (data[0].equals(user) && data[1].equals(pass)) {
                    activeUserType = data[2];
                    ans = true;
                    break;
                }
            }
            sc.close();
            if(!ans) System.out.println("Usuario o contraseña incorrectos.");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred during the login process.");
            e.printStackTrace();
        }
        return ans;
    }

    public static String getActiveUserType() {
        return activeUserType;
    }
}
