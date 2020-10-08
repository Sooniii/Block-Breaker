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
    public static final String ANSI_PURPLE = "\u001B[35m";              // Initialisation de la couleur violette
    public static final String ANSI_YELLOW = "\u001B[33m";              // Initialisation de la couleur jaune
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
    public static String[][] lancerPartie(String joueur1, String joueur2, String joueur3) {

        String[][] plateau = new String[11][12];                        // Creation du plateau
        joueur1 = joueur1.substring(0,1);                               //Prends la premiere lettre du pseudo du J1
        joueur2 = joueur2.substring(0,1);                               //Prends la premiere lettre du pseudo du J2
        joueur3 = joueur3.substring(0,1);

        for (int i = 0; i < plateau.length; i++) {                      //Parcours le tableau à l'horizontal
            for (int j = 0; j < plateau[0].length; j++) {               //Parcours le tableau à la vertical
                plateau[i][j] = "[]";                                   //Creer les cases
                if (i == 0) { plateau[i][j] = Integer.toString(j);}     //Place les index des cases horizontaux
                if (j == 0) { plateau[i][j] = Integer.toString(i);}     //Place les index des cases verticales
                if (i == 5 && j == 6) { plateau[i][j] = (ANSI_RED + joueur1 + ANSI_RESET);}       //Place le joueur 1 et ajoute la couleur rouge
                if (i == 6 && j == 5) { plateau[i][j] = (ANSI_BLUE + joueur2 + ANSI_RESET);}      //Place le joueur 2 et ajoute la couleur bleu
                if (i == 6 && j == 7) { plateau[i][j] = (ANSI_PURPLE + joueur3 + ANSI_RESET);}
                System.out.print(plateau[i][j] + "\t");                 //Affiche le tableau
            }
            System.out.println();                                       //Saute une ligne
        }
        return plateau;                                                 //Renvoie le tableau
    }
    public static String[][] lancerPartie(String joueur1, String joueur2, String joueur3, String joueur4) {

        String[][] plateau = new String[11][12];                        // Creation du plateau
        joueur1 = joueur1.substring(0,1);                               //Prends la premiere lettre du pseudo du J1
        joueur2 = joueur2.substring(0,1);                               //Prends la premiere lettre du pseudo du J2
        joueur3 = joueur3.substring(0,1);                               //Prends la premiere lettre du pseudo du J3
        joueur4 = joueur4.substring(0,1);                               //Prends la premiere lettre du pseudo du J4

        for (int i = 0; i < plateau.length; i++) {                      //Parcours le tableau à l'horizontal
            for (int j = 0; j < plateau[0].length; j++) {               //Parcours le tableau à la vertical
                plateau[i][j] = "[]";                                   //Creer les cases
                if (i == 0) { plateau[i][j] = Integer.toString(j);}     //Place les index des cases horizontaux
                if (j == 0) { plateau[i][j] = Integer.toString(i);}     //Place les index des cases verticales
                if (i == 5 && j == 6) { plateau[i][j] = (ANSI_RED + joueur1 + ANSI_RESET);}       //Place le joueur 1 et ajoute la couleur rouge
                if (i == 6 && j == 5) { plateau[i][j] = (ANSI_BLUE + joueur2 + ANSI_RESET);}      //Place le joueur 2 et ajoute la couleur bleu
                if (i == 6 && j == 7) { plateau[i][j] = (ANSI_PURPLE + joueur3 + ANSI_RESET);}      //Place le joueur 2 et ajoute la couleur bleu
                if (i == 7 && j == 6) { plateau[i][j] = (ANSI_YELLOW + joueur4 + ANSI_RESET);}      //Place le joueur 2 et ajoute la couleur bleu
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

    public static void bougeGauche(String[][] plateau, int x, int y, String player, int color) {
        plateau[x][y] = "[]";
        y -= 1;
        player = player.substring(0,1);
        if (color == 1) {plateau[x][y] = (ANSI_RED + player + ANSI_RESET);}
        if (color == 2) {plateau[x][y] = (ANSI_BLUE + player + ANSI_RESET);}
        if (color == 3) {plateau[x][y] = (ANSI_PURPLE + player + ANSI_RESET);}
        if (color == 4) {plateau[x][y] = (ANSI_YELLOW + player + ANSI_RESET);}

    }
    public static void bougeDroite(String[][] plateau, int x, int y, String player, int color) {
        plateau[x][y] = "[]";
        y += 1;
        player = player.substring(0,1);
        if (color == 1) {plateau[x][y] = (ANSI_RED + player + ANSI_RESET);}
        if (color == 2) {plateau[x][y] = (ANSI_BLUE + player + ANSI_RESET);}
        if (color == 3) {plateau[x][y] = (ANSI_PURPLE + player + ANSI_RESET);}
        if (color == 4) {plateau[x][y] = (ANSI_YELLOW + player + ANSI_RESET);}

    }
    public static void bougeHaut(String[][] plateau, int x, int y, String player, int color) {
        plateau[x][y] = "[]";
        x -= 1;
        player = player.substring(0,1);
        if (color == 1) {plateau[x][y] = (ANSI_RED + player + ANSI_RESET);}
        if (color == 2) {plateau[x][y] = (ANSI_BLUE + player + ANSI_RESET);}
        if (color == 3) {plateau[x][y] = (ANSI_PURPLE + player + ANSI_RESET);}
        if (color == 4) {plateau[x][y] = (ANSI_YELLOW + player + ANSI_RESET);}

    }
    public static void bougeBas(String[][] plateau, int x, int y, String player, int color) {
        plateau[x][y] = "[]";
        x += 1;
        player = player.substring(0,1);
        if (color == 1) {plateau[x][y] = (ANSI_RED + player + ANSI_RESET);}
        if (color == 2) {plateau[x][y] = (ANSI_BLUE + player + ANSI_RESET);}
        if (color == 3) {plateau[x][y] = (ANSI_PURPLE + player + ANSI_RESET);}
        if (color == 4) {plateau[x][y] = (ANSI_YELLOW + player + ANSI_RESET);}

    }
}
