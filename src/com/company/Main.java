package com.company;

public class Main {

    public static void main(String[] args) {

        //Déclaration des variables
        String joueur1;
        String joueur2;
        String[][] plateau;

        System.out.println("Le joueur 1 choisi son pseudo : ");
        joueur1 = Fonction.choisirPseudo();
        System.out.println("Le joueur 2 choisi son pseudo : ");
        joueur2 = Fonction.choisirPseudo();

        plateau = Fonction.lancerPartie(joueur1, joueur2);

    }
}
