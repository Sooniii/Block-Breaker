package com.company;

public class Main {
    //fonction pour éteindre le jeu
    public static void close(){
        System.exit(0);
    }

    public static void main(String[] args) throws InterruptedException {
        Fonction.menu();
        System.out.println(" ");

        //Déclaration des variables
        String pseudoJoueur1;
        String pseudoJoueur2;


        System.out.println("Le joueur 1 choisi son pseudo");
        pseudoJoueur1 = Fonction.choisirPseudo();
        System.out.println("Le joueur 2 choisi son pseudo");
        pseudoJoueur2 = Fonction.choisirPseudo();
    }
}
