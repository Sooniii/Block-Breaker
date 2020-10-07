package com.company;

import java.util.Random;

import java.util.Scanner;


public class Main {

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";                 // Initialisation de la couleur rouge
    public static final String ANSI_BLUE = "\u001B[34m";                // Initialisation de la couleur bleu
    public static final String ANSI_RESET = "\u001B[0m";                // Initialisation des couleurs

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
        while (true) {
            String joueur1;
            String joueur2;
            String joueur3 = "null";
            String joueur4 = "null";
            int joueur1Ligne ;
            int joueur1Colonne ;
            int joueur2Ligne;
            int joueur2Colonne;
            int joueur3Ligne = 0;
            int joueur3Colonne = 0;
            int joueur4Ligne = 0;
            int joueur4Colonne = 0;
            String[][] plateau;
            Random rd = new Random();
            Scanner sc = new Scanner(System.in);
            int nombreJoueur;
            int tourJoueur;
            boolean signalVictoire = true;
            boolean choixJoueur = false;
            String bouton;

            System.out.print("Combien de joueurs ? Entre 2 et 4 joueurs : ");
            nombreJoueur = sc.nextInt();

            if ((nombreJoueur >= 2 && nombreJoueur <= 4)) {

                if (nombreJoueur == 2) {
                    joueur1Ligne = 5;
                    joueur1Colonne = 6;
                    joueur2Ligne = 6;
                    joueur2Colonne = 6;
                } else if (nombreJoueur == 3) {
                    joueur1Ligne = 5;
                    joueur1Colonne = 6;
                    joueur2Ligne = 6;
                    joueur2Colonne = 5;
                    joueur3Ligne = 6;
                    joueur3Colonne = 7;
                } else {
                    joueur1Ligne = 5;
                    joueur1Colonne = 6;
                    joueur2Ligne = 6;
                    joueur2Colonne = 5;
                    joueur3Ligne = 6;
                    joueur3Colonne = 7;
                    joueur4Ligne = 7;
                    joueur4Colonne = 6;
                }

                System.out.print("Le joueur 1 choisi son pseudo (rouge): ");
                joueur1 = Fonction.choisirPseudo();
                System.out.print("Le joueur 2 choisi son pseudo (bleu) : ");
                joueur2 = Fonction.choisirPseudo();
                if (nombreJoueur == 3) {
                    System.out.print("Le joueur 3 choisi son pseudo (blanc) : ");
                    joueur3 = Fonction.choisirPseudo();
                    plateau = Fonction.lancerPartie(joueur1, joueur2, joueur3);
                } else if (nombreJoueur == 4) {
                    System.out.print("Le joueur 3 choisi son pseudo (blanc) : ");
                    joueur3 = Fonction.choisirPseudo();
                    System.out.print("Le joueur 4 choisi son pseudo (noir) : ");
                    joueur4 = Fonction.choisirPseudo();
                    plateau = Fonction.lancerPartie(joueur1, joueur2, joueur3, joueur4);
                } else {
                    plateau = Fonction.lancerPartie(joueur1, joueur2);
                }

                tourJoueur = rd.nextInt(nombreJoueur);

                while (signalVictoire) {
                    if (tourJoueur % nombreJoueur == 0) {
                        System.out.print("C'est à " + joueur1 + " (rouge) de jouer, utilise z,q,s,d pour te déplacer (si tu te trompe de touche ou que tu choisi une direction impossible ca passe ton tour !) : ");
                        bouton = sc.next();
                        if (bouton.equals("z") && joueur1Ligne > 1) {
                            Fonction.bougeHaut(plateau, joueur1Ligne, joueur1Colonne, joueur1, 1);
                            joueur1Ligne -= 1;
                        }
                        if (bouton.equals("s")) {
                            Fonction.bougeBas(plateau, joueur1Ligne, joueur1Colonne, joueur1, 1);
                            joueur1Ligne += 1;
                        }
                        if (bouton.equals("q")) {
                            Fonction.bougeGauche(plateau, joueur1Ligne, joueur1Colonne, joueur1, 1);
                            joueur1Colonne -= 1;
                        }
                        if (bouton.equals("d")) {
                            Fonction.bougeDroite(plateau, joueur1Ligne, joueur1Colonne, joueur1, 1);
                            joueur1Colonne += 1;
                        }
                        Fonction.afficherPlateau(plateau);
                        //System.out.println();
                        tourJoueur += 1;
                    } else if (tourJoueur % nombreJoueur == 1){
                        System.out.print("C'est à " + joueur2 + " (bleu) de jouer, utilise z,q,s,d pour te déplacer (si tu te trompe de touche ou que tu choisi une direction impossible ca passe ton tour !) : ");
                        bouton = sc.next();
                        if (bouton.equals("z") && joueur2Ligne > 1) {
                            Fonction.bougeHaut(plateau, joueur2Ligne, joueur2Colonne, joueur2, 2);
                            joueur2Ligne -= 1;
                        }
                        if (bouton.equals("s")) {
                            Fonction.bougeBas(plateau, joueur2Ligne, joueur2Colonne, joueur2, 2);
                            joueur2Ligne += 1;
                        }
                        if (bouton.equals("q")) {
                            Fonction.bougeGauche(plateau, joueur2Ligne, joueur2Colonne, joueur2, 2);
                            joueur2Colonne -= 1;
                        }
                        if (bouton.equals("d")) {
                            Fonction.bougeDroite(plateau, joueur2Ligne, joueur2Colonne, joueur2, 2);
                            joueur2Colonne += 1;
                        }
                        Fonction.afficherPlateau(plateau);
                        tourJoueur += 1;
                    } else if (tourJoueur % nombreJoueur == 2){
                        System.out.print("C'est à " + joueur3 + " (blanc) de jouer, utilise z,q,s,d pour te déplacer (si tu te trompe de touche ou que tu choisi une direction impossible ca passe ton tour !) : ");
                        bouton = sc.next();
                        if (bouton.equals("z") && joueur3Ligne > 1) {
                            Fonction.bougeHaut(plateau, joueur3Ligne, joueur3Colonne, joueur3, 3);
                            joueur3Ligne -= 1;
                        }
                        if (bouton.equals("s")) {
                            Fonction.bougeBas(plateau, joueur3Ligne, joueur3Colonne, joueur3, 3);
                            joueur3Ligne += 1;
                        }
                        if (bouton.equals("q")) {
                            Fonction.bougeGauche(plateau, joueur3Ligne, joueur3Colonne, joueur3, 3);
                            joueur3Colonne -= 1;
                        }
                        if (bouton.equals("d")) {
                            Fonction.bougeDroite(plateau, joueur3Ligne, joueur3Colonne, joueur3, 3);
                            joueur3Colonne += 1;
                        }
                        Fonction.afficherPlateau(plateau);
                        tourJoueur += 1;
                    } else if (tourJoueur % nombreJoueur == 3){
                        System.out.print("C'est à " + joueur4 + " (blanc) de jouer, utilise z,q,s,d pour te déplacer (si tu te trompe de touche ou que tu choisi une direction impossible ca passe ton tour !) : ");
                        bouton = sc.next();
                        if (bouton.equals("z") && joueur4Ligne > 1) {
                            Fonction.bougeHaut(plateau, joueur4Ligne, joueur4Colonne, joueur4, 3);
                            joueur4Ligne -= 1;
                        }
                        if (bouton.equals("s")) {
                            Fonction.bougeBas(plateau, joueur4Ligne, joueur4Colonne, joueur4, 3);
                            joueur4Ligne += 1;
                        }
                        if (bouton.equals("q")) {
                            Fonction.bougeGauche(plateau, joueur4Ligne, joueur4Colonne, joueur4, 3);
                            joueur4Colonne -= 1;
                        }
                        if (bouton.equals("d")) {
                            Fonction.bougeDroite(plateau, joueur4Ligne, joueur4Colonne, joueur4, 3);
                            joueur4Colonne += 1;
                        }
                        Fonction.afficherPlateau(plateau);
                        tourJoueur += 1;
                    }
                }
                startnew();
            }
            else {
                System.out.println("J'ai dit entre 2 et 4 joueurs...");
                menu.menu();
            }
        }
    }
}
