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

    //Fonction pour choisir les pseudo
    public static String choisirPseudo() {

        Scanner sc = new Scanner(System.in);
        String pseudo = sc.next();
        return pseudo;
    }

    // Initialisation des couleurs
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static String[] creationTableau() {
        String [] tabResultat = new String[10];
        for (int i = 0; i < tabResultat.length;i++ ){
            tabResultat[i] = "";
        } return tabResultat;
    }

    // Choisir la couleur
    public static String choisirCouleur(String joueur) {
        Scanner sc = new Scanner(System.in);
        String couleur = sc.next();
        if (couleur.equals("rouge") || couleur.equals("bleu") || couleur.equals("jaune") || couleur.equals("violet")) {
            couleurs = couleur;
            return couleur;
        }
        else { //Repose la question si la couleur n'existe pas
            System.out.println("La couleur indiquée n'est pas valide");
            System.out.println(joueur + " est de quelle couleur ?");
            choisirCouleur(joueur);
        }
        return couleurs;
    }

    //Fonction pour lancer la partie a 2 joueurs
    public static String[][] lancerPartie(String joueur1, String couleur1, String joueur2, String couleur2) {

        //Creer le tableau et tronque le pseudo
        String[][] plateau = new String[12][13];
        joueur1 = joueur1.substring(0,1);
        joueur2 = joueur2.substring(0,1);

        //Rempli le tableau et place les joueurs
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau[0].length; j++) {
                plateau[i][j] = "[]";
                if (i == 0) { plateau[i][j] = Integer.toString(j);}
                if (j == 0) { plateau[i][j] = Integer.toString(i);}
                if (i == (plateau.length -1)) { plateau[i][j] = "";}
                if (j == (plateau[0].length -1)) { plateau[i][j] = "";}
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
                //Affiche le plateau
                System.out.print(plateau[i][j] + "\t");
            }
            System.out.println();
        }
        return plateau;
    }

    //Fonction pour lancer la partie a 3 joueurs
    public static String[][] lancerPartie(String joueur1, String couleur1, String joueur2, String couleur2, String joueur3, String couleur3) {

        //Creer le tableau et tronque le pseudo
        String[][] plateau = new String[12][13];
        joueur1 = joueur1.substring(0,1);
        joueur2 = joueur2.substring(0,1);
        joueur3 = joueur3.substring(0,1);

        //Rempli le tableau et place les joueurs
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau[0].length; j++) {
                plateau[i][j] = "[]";
                if (i == 0) { plateau[i][j] = Integer.toString(j);}
                if (j == 0) { plateau[i][j] = Integer.toString(i);}
                if (i == (plateau.length -1)) { plateau[i][j] = "";}
                if (j == (plateau[0].length -1)) { plateau[i][j] = "";}
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
                //Affiche le plateau
                System.out.print(plateau[i][j] + "\t");
            }
            System.out.println();
        }
        return plateau;
    }

    //Fonction pour lancer la partie a 4 joueurs
    public static String[][] lancerPartie(String joueur1, String couleur1, String joueur2, String couleur2, String joueur3, String couleur3, String joueur4, String couleur4) {

        //Creer le tableau et tronque le pseudo
        String[][] plateau = new String[12][13];
        joueur1 = joueur1.substring(0,1);
        joueur2 = joueur2.substring(0,1);
        joueur3 = joueur3.substring(0,1);
        joueur4 = joueur4.substring(0,1);

        //Rempli le tableau et place les joueurs
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau[0].length; j++) {
                plateau[i][j] = "[]";
                if (i == 0) { plateau[i][j] = Integer.toString(j);}
                if (j == 0) { plateau[i][j] = Integer.toString(i);}
                if (i == (plateau.length -1)) { plateau[i][j] = "";}
                if (j == (plateau[0].length -1)) { plateau[i][j] = "";}
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
                System.out.print(plateau[i][j] + "\t");
            }
            //Affiche le plateau
            System.out.println();
        }
        return plateau;
    }

    //Fonction qui affiche le plateau
    public static void afficherPlateau(String[][] plateau) {
        flush(3);
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau[0].length; j++) {
                System.out.print(plateau[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //Fonction pour bouger vers la gauche
    public static void bougeGauche(String[][] plateau, int x, int y, String player, String color) {
        plateau[x][y] = "[]";
        y -= 1;
        player = player.substring(0,1);
        if (color.equals("rouge")) {plateau[x][y] = (ANSI_RED + player + ANSI_RESET);}
        if (color.equals("bleu")) {plateau[x][y] = (ANSI_BLUE + player + ANSI_RESET);}
        if (color.equals("violet")) {plateau[x][y] = (ANSI_PURPLE + player + ANSI_RESET);}
        if (color.equals("jaune")) {plateau[x][y] = (ANSI_YELLOW + player + ANSI_RESET);}

    }
    //Fonction pour bouger vers la droite
    public static void bougeDroite(String[][] plateau, int x, int y, String player, String color) {
        plateau[x][y] = "[]";
        y += 1;
        player = player.substring(0,1);
        if (color.equals("rouge")) {plateau[x][y] = (ANSI_RED + player + ANSI_RESET);}
        if (color.equals("bleu")) {plateau[x][y] = (ANSI_BLUE + player + ANSI_RESET);}
        if (color.equals("violet")) {plateau[x][y] = (ANSI_PURPLE + player + ANSI_RESET);}
        if (color.equals("jaune")) {plateau[x][y] = (ANSI_YELLOW + player + ANSI_RESET);}

    }
    //Fonction pour bouger vers le haut
    public static void bougeHaut(String[][] plateau, int x, int y, String player, String color) {
        plateau[x][y] = "[]";
        x -= 1;
        player = player.substring(0,1);
        if (color.equals("rouge")) {plateau[x][y] = (ANSI_RED + player + ANSI_RESET);}
        if (color.equals("bleu")) {plateau[x][y] = (ANSI_BLUE + player + ANSI_RESET);}
        if (color.equals("violet")) {plateau[x][y] = (ANSI_PURPLE + player + ANSI_RESET);}
        if (color.equals("jaune")) {plateau[x][y] = (ANSI_YELLOW + player + ANSI_RESET);}

    }
    //Fonction pour bouger vers le bas
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