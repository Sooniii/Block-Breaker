package com.company;

import java.util.Scanner;
public class Fonction {
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
                if (i == 5 && j == 6) { plateau[i][j] = joueur1;}       //Place le joueur 1
                if (i == 6 && j == 6) { plateau[i][j] = joueur2;}       //Place le joueur 2
                System.out.print(plateau[i][j] + "\t");                 //Affiche le tableau
            }
            System.out.println();                                       //Saute une ligne
        }
        return plateau;                                                 //Renvoie le tableau
    }

    //Fonction qui affiche le plateau
    public static void afficherPlateau(String[][] plateau) {
        for (int k = 0; k < 3; k++) {                                   //Boucle pour sauter des lignes
            System.out.println();
        }
        for (int i = 0; i < plateau.length; i++) {                      //Boucle pour afficher le plateau
            for (int j = 0; j < plateau[0].length; j++) {
                System.out.print(plateau[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
