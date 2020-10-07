package com.company;

import java.util.Random;

import java.util.Scanner;


public class Main {
    //fonction pour éteindre le jeu
    public static void close(){
        System.exit(0);
    }
    //Fonction pour relancer une partie
    public static void startnew() throws InterruptedException {
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

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Bienvenue dans Block-Breaker :");
        menu.menu();
        boolean play = true;
        while (play) {
            String joueur1;
            String joueur2;
            String[][] plateau;
            Random rd = new Random();
            int premierJoueur;

            System.out.println("Le joueur 1 choisi son pseudo (rouge): ");
            joueur1 = Fonction.choisirPseudo();
            System.out.println("Le joueur 2 choisi son pseudo (bleu) : ");
            joueur2 = Fonction.choisirPseudo();

            if (joueur2.equals(joueur1)) {
                System.out.println("Les deux joueurs ne peuvent pas avoir le même pseudo");
                menu.menu();
            }

            plateau = Fonction.lancerPartie(joueur1, joueur2);

            short joueur1Ligne = 5;
            short joueur1Colonne = 6;
            short joueur2Ligne = 6;
            short joueur2Colonne = 6;
            boolean signalVictoire = true;
            boolean choixJoueur = true;
            boolean valideDeplacement;
            Scanner sc = new Scanner(System.in);

            //plateau[redColonne][redLigne] = "[]";

            premierJoueur = rd.nextInt(1);
            //if (premierJoueur == 0)

            while (signalVictoire){
                String bouton = sc.next();
                if (bouton.equals("z")) {
                    Fonction.bougeHaut(plateau,joueur1Ligne,joueur1Colonne,joueur1);
                    joueur1Ligne -=1;
                }
            }
            startnew();
        }
    }
}
