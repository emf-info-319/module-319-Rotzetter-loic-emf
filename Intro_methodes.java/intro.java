package Intro_methodes.java;

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        debut();

        int nbre1 = demandenombre();
        int nbre2 = demandenombre();
        int nbre3 = demandenombre();

        int somme = nbre1 + nbre2 + nbre3;
        System.out.println("La somme est : " + somme);

        fin();
    }

    public static void debut() {
        System.out.println("Bonjour et bienvenu sur le premier programme");
        System.out.println("On va voir les méthodes dans ce cours");
    }

    public static void fin() {
        System.out.println("Programe terminé");
    }

    public static int demandenombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();
        System.out.println("Merci j'enregistre " + nombre);
        return nombre;

    }

}

// Scanner scanner = new Scanner(System.in);
// System.out.print("Entrez un nombre : ");
// int nombre1 = scanner.nextInt();
// System.out.println("Merci j'enregistre " + scanner);

// Scanner scanner2 = new Scanner(System.in);
// System.out.print("Entrez un nombre : ");
// int nombre2 = scanner.nextInt();
// System.out.println("Merci j'enregistre " + scanner2);

// Scanner scanner3 = new Scanner(System.in);
// System.out.print("Entrez un nombre : ");
// int nombre3 = scanner.nextInt();
// System.out.println("Merci j'enregistre " + scanner3);