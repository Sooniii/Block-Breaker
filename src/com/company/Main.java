package com.company;

import java.util.Random;

import java.util.Scanner;


public class Main {
    //fonction pour éteindre le jeu
    public static void close(){
        System.exit(0);
    }
    //Fonction pour relancer une partie
    public static void startnew(){
        System.out.println("Relancer une partie ? [o] [n]");
        Scanner newGame = new Scanner(System.in);
        String newgame = newGame.next();
        if (newgame.equals("n")){            //si non
            menu.menu();
        }
        if (newgame.equals("o")){            //si oui

        }
        else{                           //si autre
            startnew();
        }
    }

    public static void main(String[] args) {
        System.out.println("Bienvenue dans Block-Breaker :");
        menu.menu();
        boolean play = true;
        while (play) {
            String joueur1;
            String joueur2;
            String[][] plateau;
            Random rd = new Random();
            int premierJoueur;

            System.out.println("Le joueur 1 choisi son pseudo : ");
            joueur1 = Fonction.choisirPseudo();
            System.out.println("Le joueur 2 choisi son pseudo : ");
            joueur2 = Fonction.choisirPseudo();

            plateau = Fonction.lancerPartie(joueur1, joueur2);

            short joueur1Ligne = 5;
            short joueur1Colonne = 6;
            short joueur2Ligne = 6;
            short joueur2Colonne = 6;
            boolean signalVictoire = false;

            //plateau[redColonne][redLigne] = "[]";

            premierJoueur = rd.nextInt(1);
            //if (premierJoueur == 0)

            while (signalVictoire) {

            }
            startnew();
        }
    }
}
