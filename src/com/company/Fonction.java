package com.company;

import java.util.Scanner;
public class Fonction {

    public static void menu(){
        System.out.println("Hello menu");
    }
    public static String choisirPseudo() {
            Scanner sc = new Scanner(System.in);
            String pseudo = sc.next();
            return pseudo;
    }
}
