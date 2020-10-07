package com.company;

import java.util.Scanner;
public class Fonction {
    //Fonction pour sauter de ligne
    public static void flush(int a){
        for (int i = 0; i < a; i = i + 1) {
            System.out.println(" ");
        }
    }

    public static void menu(){
        //Introduction
        System.out.println("Bienvenue dans Block-Breaker :");
        flush(1);
        System.out.print("   - Lancer le jeu [1] \n");
        System.out.print("   - Règles [2]\n ");
        System.out.print("  - Scores [3] \n");
        System.out.print("   - Quitter le jeu [4]\n");
        Scanner scanner = new Scanner(System.in);
        char choix = scanner.next().charAt(0);
        //Lancer le jeu
        if( choix == '1'){
           // System.out.println("Ecriver le nombres de joueurs participants");
        }
        // Les règles du jeu :
        else if(choix == '2'){
            System.out.println("Block Breaker est un jeu qui peut se jouer de 2 à 4 joueurs.\n");
            System.out.print("- Pendant son tour un joueur peut déplacer son pion d’une case verticalement ou\n");
            System.out.print("horizontalement\n");
            System.out.print("- Après s'être déplacé, le joueur détruit une case du plateau.\n");
            System.out.print("- Si le joueur ne peut plus bouger, il a perdu\n \n");
            System.out.print( "Contraintes :\n");
            System.out.print( "- Un joueur ne peut pas détruire une case occupée.\n");
            System.out.print("- Un joueur ne peut pas occuper une case détruite ou une case déjà occupée.\n \n \n \n");
            System.out.print("GUIDE :\n");
            System.out.print("\n Menu :\n");
            System.out.print("- Lancer le jeu : Permet de démarrer une partie\n");
            System.out.print("- Scores : Permet de voir l'historique des scores\n");
            System.out.print("- Règles : Permet d’avoir un rappel des règles\n");
            System.out.print("- Quitter le jeu\n \n \n");
            System.out.print("Ecran principal du jeu :\n");
            System.out.print("- Il y a 11 colonnes et 10 lignes (matrice de 11 x 10)\n");
            System.out.print("- Dans ce tableau 2 joueurs sont positionné au centre\n");
            System.out.print("(Position C5;L6 et C6;L6) en début de partie\n");
            System.out.print("- Chaque joueur déplace horizontalement ou\n");
            System.out.print("verticalement son pion dans la matrice, puis\n");
            System.out.print("sélectionne une case à détruire.\n");
            // Retour au menu
            Scanner exit = new Scanner(System.in);
            System.out.println("Retour au menu [o]");
            char Exit = scanner.next().charAt(0);
            if(Exit == 'o') {
                flush(15);
                menu();
            }
        }
        //Quitter le jeu
        else if(choix=='3'){
            Main.close();
        }
        else{
            flush(10);
            System.out.println("Veuillez indiquer un caractère valide");
            flush(2);
            menu();
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
