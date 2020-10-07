package com.company;

import java.util.Scanner;
public class Fonction {
    /**
     * Cette fonction sert à choisir le pseudo
     * @return Le pseudo choisi au format String
     */
    public static void menu(){
        System.out.println("Hello menu");
    }
    public static String choisirPseudo() {
            Scanner sc = new Scanner(System.in);
            String pseudo = sc.next();
            return pseudo;
    }

    public static void LancerPartie(String joueur1, String joueur2) {

    }
}
