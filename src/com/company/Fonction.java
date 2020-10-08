package com.company;

import java.util.Scanner;
public class Fonction {
    public static String couleurs;
    //Fonction pour sauter de ligne
    public static void flush(int a) {
        for (int i = 0; i < a; i = i + 1) {
            System.out.println(" ");
        }
    }


    /**
     * Cette fonction sert à choisir le pseudo
     *
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

    public static String choisirCouleur() {
        Scanner sc = new Scanner(System.in);                        //Appelle l'objet Scanner
        String couleur = sc.next();
        if (couleur.equals("rouge") || couleur.equals("bleu") || couleur.equals("jaune") || couleur.equals("violet")) {
            couleurs = couleur;
            return couleur;
        }
        else {
            System.out.println("La couleur indiquée n'est pas valide");
            System.out.println("Le joueur est de quelle couleur ?");
            choisirCouleur();
        }
        return couleurs;
    }

    //Fonction pour lancer la partie
    public static String[][] lancerPartie(String joueur1, String couleur1, String joueur2, String couleur2) {

        String[][] plateau = new String[11][12];                        // Creation du plateau
        joueur1 = joueur1.substring(0,1);                               //Prends la premiere lettre du pseudo du J1
        joueur2 = joueur2.substring(0,1);                               //Prends la premiere lettre du pseudo du J2

        for (int i = 0; i < plateau.length; i++) {                      //Parcours le tableau à l'horizontal
            for (int j = 0; j < plateau[0].length; j++) {               //Parcours le tableau à la vertical
                plateau[i][j] = "[]";                                   //Creer les cases
                if (i == 0) { plateau[i][j] = Integer.toString(j);}     //Place les index des cases horizontaux
                if (j == 0) { plateau[i][j] = Integer.toString(i);}     //Place les index des cases verticales
                if (i == 5 && j == 6) {
                    if (couleur1.equals("rouge")) {plateau[i][j] = (ANSI_RED + joueur1 + ANSI_RESET);}
                    else if (couleur1.equals("bleu")) {plateau[i][j] = (ANSI_BLUE + joueur1 + ANSI_RESET);}
                    else if (couleur1.equals("violet")) {plateau[i][j] = (ANSI_PURPLE + joueur1 + ANSI_RESET);}
                    else if (couleur1.equals("jaune")) {plateau[i][j] = (ANSI_YELLOW + joueur1 + ANSI_RESET);}
                }
                if (i == 6 && j == 6) {
                    if (couleur2.equals("rouge")) {plateau[i][j] = (ANSI_RED + joueur2 + ANSI_RESET);}
                    else if (couleur2.equals("bleu")) {plateau[i][j] = (ANSI_BLUE + joueur2 + ANSI_RESET);}
                    else if (couleur2.equals("violet")) {plateau[i][j] = (ANSI_PURPLE + joueur2 + ANSI_RESET);}
                    else if (couleur2.equals("jaune")) {plateau[i][j] = (ANSI_YELLOW + joueur2 + ANSI_RESET);}
                }

                System.out.print(plateau[i][j] + "\t");                 //Affiche le tableau
            }
            System.out.println();                                       //Saute une ligne
        }
        return plateau;                                                 //Renvoie le tableau
    }
    public static String[][] lancerPartie(String joueur1, String couleur1, String joueur2, String couleur2, String joueur3, String couleur3) {

        String[][] plateau = new String[11][12];                        // Creation du plateau
        joueur1 = joueur1.substring(0,1);                               //Prends la premiere lettre du pseudo du J1
        joueur2 = joueur2.substring(0,1);                               //Prends la premiere lettre du pseudo du J2
        joueur3 = joueur3.substring(0,1);

        for (int i = 0; i < plateau.length; i++) {                      //Parcours le tableau à l'horizontal
            for (int j = 0; j < plateau[0].length; j++) {               //Parcours le tableau à la vertical
                plateau[i][j] = "[]";                                   //Creer les cases
                if (i == 0) { plateau[i][j] = Integer.toString(j);}     //Place les index des cases horizontaux
                if (j == 0) { plateau[i][j] = Integer.toString(i);}     //Place les index des cases verticales
                if (i == 5 && j == 6) {
                    if (couleur1.equals("rouge")) {plateau[i][j] = (ANSI_RED + joueur1 + ANSI_RESET);}
                    else if (couleur1.equals("bleu")) {plateau[i][j] = (ANSI_BLUE + joueur1 + ANSI_RESET);}
                    else if (couleur1.equals("violet")) {plateau[i][j] = (ANSI_PURPLE + joueur1 + ANSI_RESET);}
                    else if (couleur1.equals("jaune")) {plateau[i][j] = (ANSI_YELLOW + joueur1 + ANSI_RESET);}
                }
                if (i == 6 && j == 5) {
                    if (couleur2.equals("rouge")) {plateau[i][j] = (ANSI_RED + joueur2 + ANSI_RESET);}
                    else if (couleur2.equals("bleu")) {plateau[i][j] = (ANSI_BLUE + joueur2 + ANSI_RESET);}
                    else if (couleur2.equals("violet")) {plateau[i][j] = (ANSI_PURPLE + joueur2 + ANSI_RESET);}
                    else if (couleur2.equals("jaune")) {plateau[i][j] = (ANSI_YELLOW + joueur2 + ANSI_RESET);}
                }
                if (i == 6 && j == 7) {
                    if (couleur3.equals("rouge")) {plateau[i][j] = (ANSI_RED + joueur3 + ANSI_RESET);}
                    else if (couleur3.equals("bleu")) {plateau[i][j] = (ANSI_BLUE + joueur3 + ANSI_RESET);}
                    else if (couleur3.equals("violet")) {plateau[i][j] = (ANSI_PURPLE + joueur3 + ANSI_RESET);}
                    else if (couleur3.equals("jaune")) {plateau[i][j] = (ANSI_YELLOW + joueur3 + ANSI_RESET);}
                }
                System.out.print(plateau[i][j] + "\t");                 //Affiche le tableau
            }
            System.out.println();                                       //Saute une ligne
        }
        return plateau;                                                 //Renvoie le tableau
    }
    public static String[][] lancerPartie(String joueur1, String couleur1, String joueur2, String couleur2, String joueur3, String couleur3, String joueur4, String couleur4) {

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
                if (i == 5 && j == 6) {
                    if (couleur1.equals("rouge")) {plateau[i][j] = (ANSI_RED + joueur1 + ANSI_RESET);}
                    else if (couleur1.equals("bleu")) {plateau[i][j] = (ANSI_BLUE + joueur1 + ANSI_RESET);}
                    else if (couleur1.equals("violet")) {plateau[i][j] = (ANSI_PURPLE + joueur1 + ANSI_RESET);}
                    else if (couleur1.equals("jaune")) {plateau[i][j] = (ANSI_YELLOW + joueur1 + ANSI_RESET);}
                }
                if (i == 6 && j == 5) {
                    if (couleur2.equals("rouge")) {plateau[i][j] = (ANSI_RED + joueur2 + ANSI_RESET);}
                    else if (couleur2.equals("bleu")) {plateau[i][j] = (ANSI_BLUE + joueur2 + ANSI_RESET);}
                    else if (couleur2.equals("violet")) {plateau[i][j] = (ANSI_PURPLE + joueur2 + ANSI_RESET);}
                    else if (couleur2.equals("jaune")) {plateau[i][j] = (ANSI_YELLOW + joueur2 + ANSI_RESET);}
                }
                if (i == 6 && j == 7) {
                    if (couleur3.equals("rouge")) {plateau[i][j] = (ANSI_RED + joueur3 + ANSI_RESET);}
                    else if (couleur3.equals("bleu")) {plateau[i][j] = (ANSI_BLUE + joueur3 + ANSI_RESET);}
                    else if (couleur3.equals("violet")) {plateau[i][j] = (ANSI_PURPLE + joueur3 + ANSI_RESET);}
                    else if (couleur3.equals("jaune")) {plateau[i][j] = (ANSI_YELLOW + joueur3 + ANSI_RESET);}
                }
                if (i == 7 && j == 6) {
                    if (couleur4.equals("rouge")) {plateau[i][j] = (ANSI_RED + joueur4 + ANSI_RESET);}
                    else if (couleur4.equals("bleu")) {plateau[i][j] = (ANSI_BLUE + joueur4 + ANSI_RESET);}
                    else if (couleur4.equals("violet")) {plateau[i][j] = (ANSI_PURPLE + joueur4 + ANSI_RESET);}
                    else if (couleur4.equals("jaune")) {plateau[i][j] = (ANSI_YELLOW + joueur4 + ANSI_RESET);}
                }
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

    public static void bougeGauche(String[][] plateau, int x, int y, String player, String color) {
        plateau[x][y] = "[]";
        y -= 1;
        player = player.substring(0,1);
        if (color.equals("rouge")) {plateau[x][y] = (ANSI_RED + player + ANSI_RESET);}
        if (color.equals("bleu")) {plateau[x][y] = (ANSI_BLUE + player + ANSI_RESET);}
        if (color.equals("violet")) {plateau[x][y] = (ANSI_PURPLE + player + ANSI_RESET);}
        if (color.equals("jaune")) {plateau[x][y] = (ANSI_YELLOW + player + ANSI_RESET);}

    }
    public static void bougeDroite(String[][] plateau, int x, int y, String player, String color) {
        plateau[x][y] = "[]";
        y += 1;
        player = player.substring(0,1);
        if (color.equals("rouge")) {plateau[x][y] = (ANSI_RED + player + ANSI_RESET);}
        if (color.equals("bleu")) {plateau[x][y] = (ANSI_BLUE + player + ANSI_RESET);}
        if (color.equals("violet")) {plateau[x][y] = (ANSI_PURPLE + player + ANSI_RESET);}
        if (color.equals("jaune")) {plateau[x][y] = (ANSI_YELLOW + player + ANSI_RESET);}

    }
    public static void bougeHaut(String[][] plateau, int x, int y, String player, String color) {
        plateau[x][y] = "[]";
        x -= 1;
        player = player.substring(0,1);
        if (color.equals("rouge")) {plateau[x][y] = (ANSI_RED + player + ANSI_RESET);}
        if (color.equals("bleu")) {plateau[x][y] = (ANSI_BLUE + player + ANSI_RESET);}
        if (color.equals("violet")) {plateau[x][y] = (ANSI_PURPLE + player + ANSI_RESET);}
        if (color.equals("jaune")) {plateau[x][y] = (ANSI_YELLOW + player + ANSI_RESET);}

    }
    public static void bougeBas(String[][] plateau, int x, int y, String player, String color) {
        plateau[x][y] = "[]";
        x += 1;
        player = player.substring(0,1);
        if (color.equals("rouge")) {plateau[x][y] = (ANSI_RED + player + ANSI_RESET);}
        if (color.equals("bleu")) {plateau[x][y] = (ANSI_BLUE + player + ANSI_RESET);}
        if (color.equals("violet")) {plateau[x][y] = (ANSI_PURPLE + player + ANSI_RESET);}
        if (color.equals("jaune")) {plateau[x][y] = (ANSI_YELLOW + player + ANSI_RESET);}

    }
    static boolean isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == false)
                return false;

        return true;
    }
}
