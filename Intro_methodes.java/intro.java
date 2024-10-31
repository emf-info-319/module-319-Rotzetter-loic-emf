package Intro_methodes.java;

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        debut();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre1 = scanner.nextInt();
        System.out.println("Merci j'enregistre " + scanner);

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre2 = scanner.nextInt();
        System.out.println("Merci j'enregistre " + scanner2);

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre3 = scanner.nextInt();
        System.out.println("Merci j'enregistre " + scanner3);

        int somme = nombre1 + nombre2 + nombre3;
        System.out.println("La somme est : " + somme);

        fin();
    }
    public static void debut(String[] args) {
        System.out.println("Bonjour et bienvenu sur le premier programme");
        System.out.println("On va voir les méthodes dans ce cours");
    }
    public static void fin(String[] args) {
        System.out.println("Programe terminé");
    }
}
