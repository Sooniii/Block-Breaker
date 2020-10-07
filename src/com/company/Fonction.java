package com.company;

import java.util.Scanner;
public class Fonction {
    public static void menu(){
        System.out.println("Bienvenue dans Block-Breaker :");
        System.out.println("-Pour lancer le jeu taper 1 \n" + "-Pour afficher les règles taper 2 ");
        Scanner scanner = new Scanner(System.in);
        char choix = scanner.next().charAt(0);
        if( choix == '1'){
            System.out.println("Ecriver le nombres de joueurs participants");
        }
        else if(choix == '2'){
            System.out.println("Block Breaker est un jeu qui peut se jouer de 2 à 4 joueurs.\n" +
                    "- Pendant son tour un joueur peut déplacer son pion d’une case verticalement ou\n" +
                    "horizontalement\n" + "- Après s'être déplacé, le joueur détruit une case du plateau.\n" + "- Si le joueur ne peut plus bouger, il a perdu\n" + "\n"
                    + "Contraintes :\n" + "- Un joueur ne peut pas détruire une case occupée.\n" + "- Un joueur ne peut pas occuper une case détruite ou une case déjà occupée.\n" + "\n" + "\n" + "\n" + "GUIDE :\n"
                    + "\n" + "Menu :\n" +
                    "- Lancer le jeu : Permet de démarrer une partie\n" + "- Scores : Permet de voir l'historique des scores\n" + "- Règles : Permet d’avoir un rappel des règles\n" + "- Quitter le jeu\n" +
                    "\n" +
                    "\n" +
                    "Ecran principal du jeu :\n" + "- Il y a 11 colonnes et 10 lignes (matrice de 11 x 10)\n" + "- Dans ce tableau 2 joueurs sont positionné au centre\n" + "(Position C5;L6 et C6;L6) en début de partie\n" +
                    "- Chaque joueur déplace horizontalement ou\n" +
                    "verticalement son pion dans la matrice, puis\n" +
                    "sélectionne une case à détruire.");
            Scanner exit = new Scanner(System.in);
            System.out.println("Retour au menu [o]");
            char Exit = scanner.next().charAt(0);
            if(Exit == 'o') {
                for (int i = 0; i < 10; i = i + 1) {
                    System.out.println(" ");
                }
            }
            menu();
        }
    }

    /**
     * Cette fonction sert à choisir le pseudo
     * @return Le pseudo choisi au format String
     */
    public static String choisirPseudo() {
            Scanner sc = new Scanner(System.in);
            String pseudo = sc.next();
            return pseudo;
    }

    public static void LancerPartie(String joueur1, String joueur2) {

    }
}
