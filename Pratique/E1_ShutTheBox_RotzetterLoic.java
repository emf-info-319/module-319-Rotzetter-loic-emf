package Pratique;

import java.util.Scanner;

public class E1_ShutTheBox_RotzetterLoic {
    public static final int DES_MIN = 1;
    public static final int DES_MAX = 6;
    public static final int NOMBRE_TUILES = 12;
    public static final Scanner Scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] tuiles = new int[NOMBRE_TUILES];
        boolean enJeu = true;

        System.out.println("**********************************");
        System.out.println("*        'Shut The Box'          *");
        System.out.println("**********************************");

        for (int i = 0; i < tuiles.length; i++) {
            tuiles[i] = 1;
        }

        while (enJeu) {
            afficheTuiles(tuiles);

            int totalDes = tireLesDes();

            System.out.println("Donnez le(s) nombre(s) à enlever :");

            tuiles = enleveTuiles(tuiles, totalDes);

            boolean encore = contientEncoreDesTuilesABaisser(tuiles);

            if (encore == false) {
                System.out.println("Jeu terminé");
                Scanner.close();
                enJeu = false;
            }
        }

    }

    public static void afficheTuiles(int[] tab) {
        for (int i = 1; i < tab.length - 1; i++) {
            if (i <= 9) {
                System.out.print("|0" + i);
            } else if (i == 0) {
                System.out.print("|__" + i);
            } else if (i == 10) {
                System.out.print("|" + i + "|");
            }
        }
    }

    public static int tireLesDes() {
        int nombre1 = (int) (Math.random() * (DES_MAX - DES_MIN + 1)) + DES_MIN;
        int nombre2 = (int) (Math.random() * (DES_MAX - DES_MIN + 1)) + DES_MIN;
        int valeurTotal = nombre1 + nombre2;
        System.out.println();
        System.out.println(
                "Les nombres tirés sont : " + nombre1 + " et " + nombre2 + " qui font un total de " + valeurTotal);
        return valeurTotal;
    }

    public static int[] enleveTuiles(int[] tuiles, int totalDes) {
        int[] tuilesTemp = copieTableau(tuiles);
        int totalEnleve = 0;
        boolean demandeEncore = true;

        do {
            int valeur = Scanner.nextInt();
            totalEnleve = valeur + totalEnleve;

            if (valeur == 0) {
                System.out.println("« Abandon… »");

                for (int i = 0; i < tuilesTemp.length; i++) {
                    tuilesTemp[i] = 0;
                }

                tuiles = copieTableau(tuilesTemp);

                demandeEncore = false;
            } else if (valeur < 1 || valeur > tuilesTemp.length) {
                System.out.println("Hors limites !");
                totalEnleve = 0;
            } else if (tuilesTemp[valeur - 1] == 0) {
                System.out.println("Vous avez déjà baissé la tuile à la position " + valeur);

                totalEnleve = totalEnleve - valeur;
            } else {
                if (totalEnleve < totalDes) {
                    tuilesTemp[valeur - 1] = 0;

                    System.out.println("Ce n'est pas suffisant, merci d'enlever encore");
                } else if (totalEnleve > totalDes) {
                    System.out.println(" Le total est dépassez, choisissez d'autres nombres");

                    tuilesTemp = copieTableau(tuiles);
                    totalEnleve = 0;
                    afficheTuiles(tuiles);
                } else {
                    tuilesTemp[valeur - 1] = 0;
                    System.out.println(" Parfait !");
                    tuiles = copieTableau(tuilesTemp);
                    demandeEncore = true;
                }
            }

        } while (demandeEncore);

        return tuiles;

    }

    public static int[] copieTableau(int[] tab) {
        int[] copie = new int[tab.length];
        copie = tab;
        return copie;
    }

    public static boolean contientEncoreDesTuilesABaisser(int[] tab) {

        boolean ret = false;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != 0) {
                ret = true;
            }
        }
        return ret;

    }
}
