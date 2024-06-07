package org.examples.caso2.models;

import org.examples.caso2.gui.viewers.LoginApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Authentication {
    private static String userType = null;

    public static boolean authenticate(String user, String pass){
        try {
            File accts = new File(LoginApplication.class.getResource("accounts.txt").getPath());
            Scanner myReader = new Scanner(accts);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] parts = data.split(",");
                if(user.equals(parts[0]) && pass.equals(parts[1])) {
                    userType = parts[2];
                    return true;
                }
            }
            System.out.println("Usuario o contraseña incorrectos.");
            myReader.close();
            return false;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }
    }

    public static String getUserType() {
        return userType;
    }
}
