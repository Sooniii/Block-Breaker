package com.company;

import java.util.Scanner;

public class menu {
    public static void menu(){
        //Introduction
        Fonction.flush(1);
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
            System.out.print("- Un joueur ne peut pas occuper une case détruite ou une case déjà occupée. \n \n");
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
                Fonction.flush(15);
                menu();
            }
        }




        //Quitter le jeu
        else if(choix=='4'){
            Main.close();
        }
        //Si le caractère indiqué n'est pas valide
        else{
            Fonction.flush(10);
            System.out.println("Veuillez indiquer un caractère valide");
            Fonction.flush(2);
            menu();
        }
        return;
    }
}
