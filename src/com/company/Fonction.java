package com.company;

import java.util.Scanner;
public class Fonction {
    //Fonction pour sauter de ligne
    public static void flush(int a){
        for (int i = 0; i < a; i = i + 1) {
            System.out.println(" ");
        }
    }


    /**
     * Cette fonction sert à choisir le pseudo
     * @return Le pseudo choisi au format String
     */

    //Fonction pour choisir les pseudo
    public static String choisirPseudo() {

            Scanner sc = new Scanner(System.in);                        //Appelle l'objet Scanner
            String pseudo = sc.next();                                  //Le joueur tape son pseudo
            return pseudo;                                              //Renvoie le pseudo du joueur
    }
    public static final String ANSI_RESET = "\u001B[0m";                // Initialisation des couleurs
    public static final String ANSI_BLACK = "\u001B[30m";               // Initialisation de la couleur noir
    public static final String ANSI_RED = "\u001B[31m";                 // Initialisation de la couleur rouge
    public static final String ANSI_BLUE = "\u001B[34m";                // Initialisation de la couleur bleu

    //Fonction pour lancer la partie
    public static String[][] lancerPartie(String joueur1, String joueur2) {

        String[][] plateau = new String[11][12];                        // Creation du plateau
        joueur1 = joueur1.substring(0,1);                               //Prends la premiere lettre du pseudo du J1
        joueur2 = joueur2.substring(0,1);                               //Prends la premiere lettre du pseudo du J2

        for (int i = 0; i < plateau.length; i++) {                      //Parcours le tableau à l'horizontal
            for (int j = 0; j < plateau[0].length; j++) {               //Parcours le tableau à la vertical
                plateau[i][j] = "[]";                                   //Creer les cases
                if (i == 0) { plateau[i][j] = Integer.toString(j);}     //Place les index des cases horizontaux
                if (j == 0) { plateau[i][j] = Integer.toString(i);}     //Place les index des cases verticales
                if (i == 5 && j == 6) { plateau[i][j] = (ANSI_RED + joueur1 + ANSI_RESET);}       //Place le joueur 1 et ajoute la couleur rouge
                if (i == 6 && j == 6) { plateau[i][j] = (ANSI_BLUE + joueur2 + ANSI_RESET);}      //Place le joueur 2 et ajoute la couleur bleu
                System.out.print(plateau[i][j] + "\t");                 //Affiche le tableau
            }
            System.out.println();                                       //Saute une ligne
        }
        return plateau;                                                 //Renvoie le tableau
    }

    //Fonction qui affiche le plateau
    public static void afficherPlateau(String[][] plateau) {
        flush(3);
        for (int i = 0; i < plateau.length; i++) {                      //Boucle pour afficher le plateau
            for (int j = 0; j < plateau[0].length; j++) {
                System.out.print(plateau[i][j] + "\t");
            }
            System.out.println();
        }


    }

    public static void move(short playerX, short playerY) {
        Scanner sc = new Scanner(System.in);
    }
}
