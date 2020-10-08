package com.company;

import java.util.Scanner;
import java.util.SortedMap;

public class menu {
    //Fonction retour au menu
    public static void returntomenu() throws InterruptedException {
        Scanner exit = new Scanner(System.in);
        System.out.println("\n Retour au menu [o]");
        String Exit = exit.next();
        if(Exit.equals("o")) {
            Fonction.flush(15);
            menu();
        }
        else{
            System.out.println("ERREUR");
            returntomenu();
        }
    }
    public static void afficherScore(){
    }
    public static void menu() throws InterruptedException {
        //Introduction
        Fonction.flush(1);
        System.out.print("   - Lancer le jeu [1] \n");
        System.out.print("   - Règles [2]\n ");
        System.out.print("  - Scores [3] \n");
        System.out.print("   - Quitter le jeu [4]\n");
        Scanner scanner = new Scanner(System.in);
        String choix = scanner.next();

        //Lancer le jeu
        if( choix.equals("1")){
            // System.out.println("Ecriver le nombres de joueurs participants");
        }
        // Les règles du jeu :
        else if(choix.equals("2")){
            System.out.println("####################################################################");
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
            // Retour au menu ?
            returntomenu();
        }
//         Afficher les scores des dernieres parties
        else if(choix.equals("3")){
            System.out.println("Les 10 derniers gagnants sont :");
            for(int i = 0; i < Main.score.length;i++){
                System.out.println(Main.score[i]);
            }

            returntomenu();
            }
        //Quitter le jeu
        else if(choix.equals("4")){
            Fonction.flush(20);
            System.out.println("Merci d'avoir jouer");
            for(int i = 0; i < 3; i=i+1){
                Thread.sleep(300);
                System.out.println("<3");
            }
            Thread.sleep(500);
            Main.close();
        }

        //Easter egg
        else if(choix.equals("easterEgg")){
            System.out.println("\n" +
                    " ▄▄▄▄▄▄▄▄▄▄▄  ▄            ▄▄▄▄▄▄▄▄▄▄▄  ▄▄       ▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄        ▄  ▄▄▄▄▄▄▄▄▄▄▄       ▄          ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄        ▄ \n" +
                    "▐░░░░░░░░░░░▌▐░▌          ▐░░░░░░░░░░░▌▐░░▌     ▐░░▌▐░░░░░░░░░░░▌▐░░▌      ▐░▌▐░░░░░░░░░░░▌     ▐░▌        ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░▌      ▐░▌\n" +
                    "▐░█▀▀▀▀▀▀▀▀▀ ▐░▌          ▐░█▀▀▀▀▀▀▀▀▀ ▐░▌░▌   ▐░▐░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░▌░▌     ▐░▌ ▀▀▀▀█░█▀▀▀▀       ▐░▌       ▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌▀▀▀▀█░█▀▀▀▀ ▐░▌░▌     ▐░▌\n" +
                    "▐░▌          ▐░▌          ▐░▌          ▐░▌▐░▌ ▐░▌▐░▌▐░▌          ▐░▌▐░▌    ▐░▌     ▐░▌            ▐░▌      ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌    ▐░▌     ▐░▌▐░▌    ▐░▌\n" +
                    "▐░▌          ▐░▌          ▐░█▄▄▄▄▄▄▄▄▄ ▐░▌ ▐░▐░▌ ▐░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░▌ ▐░▌   ▐░▌     ▐░▌             ▐░▌     ▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄█░▌    ▐░▌     ▐░▌ ▐░▌   ▐░▌\n" +
                    "▐░▌          ▐░▌          ▐░░░░░░░░░░░▌▐░▌  ▐░▌  ▐░▌▐░░░░░░░░░░░▌▐░▌  ▐░▌  ▐░▌     ▐░▌             ▐░▌     ▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░▌     ▐░▌     ▐░▌  ▐░▌  ▐░▌\n" +
                    "▐░▌          ▐░▌          ▐░█▀▀▀▀▀▀▀▀▀ ▐░▌   ▀   ▐░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░▌   ▐░▌ ▐░▌     ▐░▌             ▐░▌     ▐░█▀▀▀▀█░█▀▀ ▐░▌       ▐░▌▐░█▀▀▀▀▀▀▀█░▌    ▐░▌     ▐░▌   ▐░▌ ▐░▌\n" +
                    "▐░▌          ▐░▌          ▐░▌          ▐░▌       ▐░▌▐░▌          ▐░▌    ▐░▌▐░▌     ▐░▌            ▐░▌      ▐░▌     ▐░▌  ▐░▌       ▐░▌▐░▌       ▐░▌    ▐░▌     ▐░▌    ▐░▌▐░▌\n" +
                    "▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄▄▄ ▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░▌     ▐░▐░▌     ▐░▌           ▐░▌       ▐░▌      ▐░▌ ▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌▄▄▄▄█░█▄▄▄▄ ▐░▌     ▐░▐░▌\n" +
                    "▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░▌      ▐░░▌     ▐░▌          ▐░▌        ▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌      ▐░░▌\n" +
                    " ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀        ▀▀       ▀            ▀          ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀        ▀▀ \n" +
                    "                                                                                                                                                                           \n");
            menu();
        }

        else if(choix.equals("ViveWejdene")){
            System.out.println("\n" +
                    "$$\\    $$\\ $$\\                            $$\\      $$\\                           $$\\                               \n" +
                    "$$ |   $$ |\\__|                           $$ | $\\  $$ |                          $$ |                              \n" +
                    "$$ |   $$ |$$\\ $$\\    $$\\  $$$$$$\\        $$ |$$$\\ $$ | $$$$$$\\        $$\\  $$$$$$$ | $$$$$$\\  $$$$$$$\\   $$$$$$\\  \n" +
                    "\\$$\\  $$  |$$ |\\$$\\  $$  |$$  __$$\\       $$ $$ $$\\$$ |$$  __$$\\       \\__|$$  __$$ |$$  __$$\\ $$  __$$\\ $$  __$$\\ \n" +
                    " \\$$\\$$  / $$ | \\$$\\$$  / $$$$$$$$ |      $$$$  _$$$$ |$$$$$$$$ |      $$\\ $$ /  $$ |$$$$$$$$ |$$ |  $$ |$$$$$$$$ |\n" +
                    "  \\$$$  /  $$ |  \\$$$  /  $$   ____|      $$$  / \\$$$ |$$   ____|      $$ |$$ |  $$ |$$   ____|$$ |  $$ |$$   ____|\n" +
                    "   \\$  /   $$ |   \\$  /   \\$$$$$$$\\       $$  /   \\$$ |\\$$$$$$$\\       $$ |\\$$$$$$$ |\\$$$$$$$\\ $$ |  $$ |\\$$$$$$$\\ \n" +
                    "    \\_/    \\__|    \\_/     \\_______|      \\__/     \\__| \\_______|      $$ | \\_______| \\_______|\\__|  \\__| \\_______|\n" +
                    "                                                                 $$\\   $$ |                                        \n" +
                    "                                                                 \\$$$$$$  |                                        \n" +
                    "                                                                  \\______/                                         \n");
            menu();
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
