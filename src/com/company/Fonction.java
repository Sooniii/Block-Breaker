package com.company;

import java.util.Scanner;

public class Fonction {

    public static String choisirPseudo() {
        Scanner sc = new Scanner(System.in);
        String pseudo = sc.next();
        return pseudo;
    }
}
