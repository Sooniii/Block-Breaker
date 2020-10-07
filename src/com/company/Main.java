package com.company;

import java.util.Scanner;

public class Main {
    //fonction pour éteindre le jeu
    public static void close(){
        System.exit(0);
    }

    public static void main(String[] args) {
        System.out.println("Bienvenue dans Block-Breaker :");
        Fonction.menu();
        //Déclaration des variables
        String joueur1;
        String joueur2;
        String[][] plateau;

        System.out.println("Le joueur 1 choisi son pseudo : ");
        joueur1 = Fonction.choisirPseudo();
        System.out.println("Le joueur 2 choisi son pseudo : ");
        joueur2 = Fonction.choisirPseudo();

        plateau = Fonction.lancerPartie(joueur1, joueur2);



        System.out.println("Relancer une partie ? [o] [n]");
        Scanner newGame = new Scanner(System.in);
        char newgame = newGame.next().charAt(0);
        if (newgame == 'o'){
            Fonction.lancerPartie(joueur1, joueur2);
        }
        else if(newgame == 'n') {
            Fonction.menu();
        }
    }
}
