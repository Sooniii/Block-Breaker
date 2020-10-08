package com.company;

import java.util.Random;

import java.util.Scanner;


public class Main {
    public static int caseToDestructX;
    public static int caseToDestructY;
    public static int playerAlive;

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
        Fonction.flush(1);
        System.out.println("Bienvenue dans Block-Breaker :");
        menu.menu();
        while (true) {
            String joueur1;
            String joueur2;
            String joueur3 = "null";
            String joueur4 = "null";
            String couleur1;
            String couleur2;
            String couleur3 = "null";
            String couleur4 = "null";
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
            String bouton;

            System.out.print("Combien de joueurs ? Entre 2 et 4 joueurs : ");
            nombreJoueur = sc.nextInt();


            if ((nombreJoueur >= 2 && nombreJoueur <= 4)) {

                if (nombreJoueur == 2) {
                    joueur1Ligne = 5;
                    joueur1Colonne = 6;
                    joueur2Ligne = 6;
                    joueur2Colonne = 6;
                    playerAlive = 2;
                } else if (nombreJoueur == 3) {
                    joueur1Ligne = 5;
                    joueur1Colonne = 6;
                    joueur2Ligne = 6;
                    joueur2Colonne = 5;
                    joueur3Ligne = 6;
                    joueur3Colonne = 7;
                    playerAlive = 3;
                } else {
                    joueur1Ligne = 5;
                    joueur1Colonne = 6;
                    joueur2Ligne = 6;
                    joueur2Colonne = 5;
                    joueur3Ligne = 6;
                    joueur3Colonne = 7;
                    joueur4Ligne = 7;
                    joueur4Colonne = 6;
                    playerAlive = 4;
                }

                System.out.print("Le joueur 1 choisi son pseudo : ");
                joueur1 = Fonction.choisirPseudo();
                System.out.print(joueur1 + " est de quelle couleur (rouge, bleu, violet, jaune) ? : ");
                couleur1 = Fonction.choisirCouleur();
                System.out.print("Le joueur 2 choisi son pseudo : ");
                joueur2 = Fonction.choisirPseudo();
                System.out.print(joueur2 + " est de quelle couleur (rouge, bleu, violet, jaune) ? : ");
                couleur2 = Fonction.choisirCouleur();
                if (nombreJoueur == 3) {
                    System.out.print("Le joueur 3 choisi son pseudo : ");
                    joueur3 = Fonction.choisirPseudo();
                    System.out.print(joueur3 + " est de quelle couleur (rouge, bleu, violet, jaune) ? : ");
                    couleur3 = Fonction.choisirCouleur();
                    plateau = Fonction.lancerPartie(joueur1, couleur1, joueur2, couleur2, joueur3, couleur3);
                } else if (nombreJoueur == 4) {
                    System.out.print("Le joueur 3 choisi son pseudo : ");
                    joueur3 = Fonction.choisirPseudo();
                    System.out.print(joueur3 + " est de quelle couleur (rouge, bleu, violet, jaune) ? : ");
                    couleur3 = Fonction.choisirCouleur();
                    System.out.print("Le joueur 4 choisi son pseudo : ");
                    joueur4 = Fonction.choisirPseudo();
                    System.out.print(joueur4 + " est de quelle couleur (rouge, bleu, violet, jaune) ? : ");
                    couleur4 = Fonction.choisirCouleur();
                    plateau = Fonction.lancerPartie(joueur1, couleur1, joueur2, couleur2, joueur3, couleur3, joueur4, couleur4);
                } else {
                    plateau = Fonction.lancerPartie(joueur1, couleur1, joueur2, couleur2);
                }

                tourJoueur = rd.nextInt(nombreJoueur);

                while (signalVictoire) {
                    if(playerAlive==1){
                        signalVictoire = false;
                        System.out.println("##########################################################");
                        Fonction.flush(2);
                        System.out.println("La partie est finie ! Victoire de ");
                        Fonction.flush(1);
                    }
                    else if (tourJoueur % nombreJoueur == 0) {
                        System.out.print("C'est à " + joueur1 + " (rouge) de jouer, utilise z,q,s,d pour te déplacer (si tu te trompe de touche ou que tu choisi une direction impossible ca passe ton tour !) : ");
                        bouton = sc.next();
                        if (bouton.equals("z") && joueur1Ligne > 1) {
                            Fonction.bougeHaut(plateau, joueur1Ligne, joueur1Colonne, joueur1, couleur1);
                            joueur1Ligne -= 1;
                        }
                        if (bouton.equals("s")) {
                            Fonction.bougeBas(plateau, joueur1Ligne, joueur1Colonne, joueur1, couleur1);
                            joueur1Ligne += 1;
                        }
                        if (bouton.equals("q")) {
                            Fonction.bougeGauche(plateau, joueur1Ligne, joueur1Colonne, joueur1, couleur1);
                            joueur1Colonne -= 1;
                        }
                        if (bouton.equals("d")) {
                            Fonction.bougeDroite(plateau, joueur1Ligne, joueur1Colonne, joueur1, couleur1);
                            joueur1Colonne += 1;
                        }
                        Fonction.afficherPlateau(plateau);
                        Scanner tourX = new Scanner(System.in);
                        System.out.println("Quelle case détruire (Abscisse)");
                        String caseToDestructXstring = tourX.next();
                        System.out.println("Quelle case détruire (Ordonnée)");
                        Scanner tourY = new Scanner(System.in);
                        String caseToDestructYstring = tourX.next();
                        boolean numberX = Fonction.isNumber(caseToDestructXstring);
                        boolean numberY = Fonction.isNumber(caseToDestructYstring);
                        if(numberX && numberY){
                            caseToDestructX = Integer.parseInt(caseToDestructXstring);
                            caseToDestructY = Integer.parseInt(caseToDestructYstring);
                        }
                        if ((plateau[joueur1Ligne][joueur1Colonne] != plateau[caseToDestructY][caseToDestructX])
                                && (plateau[joueur2Ligne][joueur2Colonne] != plateau[caseToDestructY][caseToDestructX])
                                && (plateau[joueur3Ligne][joueur3Colonne] != plateau[caseToDestructY][caseToDestructX])
                                && (plateau[joueur4Ligne][joueur4Colonne] != plateau[caseToDestructY][caseToDestructX])
                                && ("X" != plateau[caseToDestructY][caseToDestructX])) {
                            plateau[caseToDestructY][caseToDestructX] = "X";
                        }
                        Fonction.afficherPlateau(plateau);
                        //System.out.println();
                        tourJoueur += 1;
                    } else if (tourJoueur % nombreJoueur == 1){
                        System.out.print("C'est à " + joueur2 +  " (" + couleur2 + ") de jouer, utilise z,q,s,d pour te déplacer (si tu te trompe de touche ou que tu choisi une direction impossible ca passe ton tour !) : ");
                        bouton = sc.next();
                        if (bouton.equals("z") && joueur2Ligne > 1) {
                            Fonction.bougeHaut(plateau, joueur2Ligne, joueur2Colonne, joueur2, couleur2);
                            joueur2Ligne -= 1;
                        }
                        if (bouton.equals("s")) {
                            Fonction.bougeBas(plateau, joueur2Ligne, joueur2Colonne, joueur2, couleur2);
                            joueur2Ligne += 1;
                        }
                        if (bouton.equals("q")) {
                            Fonction.bougeGauche(plateau, joueur2Ligne, joueur2Colonne, joueur2, couleur2);
                            joueur2Colonne -= 1;
                        }
                        if (bouton.equals("d")) {
                            Fonction.bougeDroite(plateau, joueur2Ligne, joueur2Colonne, joueur2, couleur2);
                            joueur2Colonne += 1;
                        }
                        Fonction.afficherPlateau(plateau);
                        Scanner tourX = new Scanner(System.in);
                        System.out.println("Quelle case détruire (Abscisse)");
                        String caseToDestructXstring = tourX.next();
                        System.out.println("Quelle case détruire (Ordonnée)");
                        Scanner tourY = new Scanner(System.in);
                        String caseToDestructYstring = tourX.next();
                        boolean numberX = Fonction.isNumber(caseToDestructXstring);
                        boolean numberY = Fonction.isNumber(caseToDestructYstring);
                        if(numberX && numberY){
                            caseToDestructX = Integer.parseInt(caseToDestructXstring);
                            caseToDestructY = Integer.parseInt(caseToDestructYstring);
                        }
                        if ((plateau[joueur1Ligne][joueur1Colonne] != plateau[caseToDestructY][caseToDestructX])
                                && (plateau[joueur2Ligne][joueur2Colonne] != plateau[caseToDestructY][caseToDestructX])
                                && (plateau[joueur3Ligne][joueur3Colonne] != plateau[caseToDestructY][caseToDestructX])
                                && (plateau[joueur4Ligne][joueur4Colonne] != plateau[caseToDestructY][caseToDestructX])
                                && ("X" != plateau[caseToDestructY][caseToDestructX])) {
                            plateau[caseToDestructY][caseToDestructX] = "X";
                        }
                        Fonction.afficherPlateau(plateau);
                        tourJoueur += 1;
                    } else if (tourJoueur % nombreJoueur == 2){
                        System.out.print("C'est à " + joueur3 +  " (" + couleur3 + ") de jouer, utilise z,q,s,d pour te déplacer (si tu te trompe de touche ou que tu choisi une direction impossible ca passe ton tour !) : ");
                        bouton = sc.next();
                        if (bouton.equals("z") && joueur3Ligne > 1) {
                            Fonction.bougeHaut(plateau, joueur3Ligne, joueur3Colonne, joueur3, couleur3);
                            joueur3Ligne -= 1;
                        }
                        if (bouton.equals("s")) {
                            Fonction.bougeBas(plateau, joueur3Ligne, joueur3Colonne, joueur3, couleur3);
                            joueur3Ligne += 1;
                        }
                        if (bouton.equals("q")) {
                            Fonction.bougeGauche(plateau, joueur3Ligne, joueur3Colonne, joueur3, couleur3);
                            joueur3Colonne -= 1;
                        }
                        if (bouton.equals("d")) {
                            Fonction.bougeDroite(plateau, joueur3Ligne, joueur3Colonne, joueur3, couleur3);
                            joueur3Colonne += 1;
                        }
                        Fonction.afficherPlateau(plateau);
                        Scanner tourX = new Scanner(System.in);
                        System.out.println("Quelle case détruire (Abscisse)");
                        String caseToDestructXstring = tourX.next();
                        System.out.println("Quelle case détruire (Ordonnée)");
                        Scanner tourY = new Scanner(System.in);
                        String caseToDestructYstring = tourX.next();
                        boolean numberX = Fonction.isNumber(caseToDestructXstring);
                        boolean numberY = Fonction.isNumber(caseToDestructYstring);
                        if(numberX && numberY){
                            caseToDestructX = Integer.parseInt(caseToDestructXstring);
                            caseToDestructY = Integer.parseInt(caseToDestructYstring);
                        }
                        if ((plateau[joueur1Ligne][joueur1Colonne] != plateau[caseToDestructY][caseToDestructX])
                                && (plateau[joueur2Ligne][joueur2Colonne] != plateau[caseToDestructY][caseToDestructX])
                                && (plateau[joueur3Ligne][joueur3Colonne] != plateau[caseToDestructY][caseToDestructX])
                                && (plateau[joueur4Ligne][joueur4Colonne] != plateau[caseToDestructY][caseToDestructX])
                                && ("X" != plateau[caseToDestructY][caseToDestructX])) {
                            plateau[caseToDestructY][caseToDestructX] = "X";
                        }
                        Fonction.afficherPlateau(plateau);
                        tourJoueur += 1;
                    } else if (tourJoueur % nombreJoueur == 3){
                        System.out.print("C'est à " + joueur4 +  " (" + couleur4 + ") de jouer, utilise z,q,s,d pour te déplacer (si tu te trompe de touche ou que tu choisi une direction impossible ca passe ton tour !) : ");
                        bouton = sc.next();
                        if (bouton.equals("z") && joueur4Ligne > 1) {
                            Fonction.bougeHaut(plateau, joueur4Ligne, joueur4Colonne, joueur4, couleur4);
                            joueur4Ligne -= 1;
                        }
                        if (bouton.equals("s")) {
                            Fonction.bougeBas(plateau, joueur4Ligne, joueur4Colonne, joueur4, couleur4);
                            joueur4Ligne += 1;
                        }
                        if (bouton.equals("q")) {
                            Fonction.bougeGauche(plateau, joueur4Ligne, joueur4Colonne, joueur4, couleur4);
                            joueur4Colonne -= 1;
                        }
                        if (bouton.equals("d")) {
                            Fonction.bougeDroite(plateau, joueur4Ligne, joueur4Colonne, joueur4, couleur4);
                            joueur4Colonne += 1;
                        }
                        Fonction.afficherPlateau(plateau);
                        Scanner tourX = new Scanner(System.in);
                        System.out.println("Quelle case détruire (Abscisse)");
                        String caseToDestructXstring = tourX.next();
                        System.out.println("Quelle case détruire (Ordonnée)");
                        Scanner tourY = new Scanner(System.in);
                        String caseToDestructYstring = tourX.next();
                        boolean numberX = Fonction.isNumber(caseToDestructXstring);
                        boolean numberY = Fonction.isNumber(caseToDestructYstring);
                        if(numberX && numberY){
                            caseToDestructX = Integer.parseInt(caseToDestructXstring);
                            caseToDestructY = Integer.parseInt(caseToDestructYstring);
                        }

                        if ((plateau[joueur1Ligne][joueur1Colonne] != plateau[caseToDestructY][caseToDestructX])
                                && (plateau[joueur2Ligne][joueur2Colonne] != plateau[caseToDestructY][caseToDestructX])
                                && (plateau[joueur3Ligne][joueur3Colonne] != plateau[caseToDestructY][caseToDestructX])
                                && (plateau[joueur4Ligne][joueur4Colonne] != plateau[caseToDestructY][caseToDestructX])
                                && ("X" != plateau[caseToDestructY][caseToDestructX])) {
                            plateau[caseToDestructY][caseToDestructX] = "X";
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
