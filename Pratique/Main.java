import java.util.Random;

public class Main {

    // 2. Déclarer les constantes MIN et MAX
    public static final int MIN = 2;
    public static final int MAX = 14;

    // 4. Déterminer l'index gagnant
    public static int determinerIndexGagnant(int[] scores) {
        int indexGagnant = -1;
        int maxProcheDe21 = Integer.MIN_VALUE;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] <= 21 && scores[i] > maxProcheDe21) {
                maxProcheDe21 = scores[i];
                indexGagnant = i;
            }
        }

        return indexGagnant;
    }

    // 3. Tirer une carte aléatoire
    public static int tirerUneCarte() {
        Random random = new Random();
        return random.nextInt(MAX - MIN + 1) + MIN;
    }

    // 5. Donner le nom d'une carte
    public static String donnerNomCarte(int valeurCarte) {
        switch (valeurCarte) {
            case 11:
                return "valet";
            case 12:
                return "dame";
            case 13:
                return "roi";
            case 14:
                return "as";
            default:
                if (valeurCarte >= 2 && valeurCarte <= 10) {
                    return String.valueOf(valeurCarte);
                } else {
                    return "indéterminé";
                }
        }
    }

    public static void main(String[] args) {
        // 6.1 Déclarez et créez un tableau de String pour les joueurs
        String[] joueurs = {"Jacques", "Pierre", "Paul"};

        // 6.2 Déclarez et créez un tableau de scores
        int[] scores = new int[joueurs.length];

        // 6.3 Déclarez la variable booléenne jeuTermine
        boolean jeuTermine = false;

        // 6.4 Tant que le jeu n'est pas terminé
        while (!jeuTermine) {
            for (int i = 0; i < joueurs.length; i++) {
                // 6.4.1.1 Tirer une carte
                int carte = tirerUneCarte();

                // 6.4.1.2 Ajouter au score en fonction de la valeur de la carte
                if (carte > 10) {
                    scores[i] += 11;
                } else {
                    scores[i] += carte;
                }

                // 6.4.1.4 Obtenir le nom de la carte
                String nomCarte = donnerNomCarte(carte);

                // 6.4.1.5 Afficher le joueur et la carte tirée
                System.out.println(joueurs[i] + " a tiré la carte " + nomCarte);

                // 6.4.1.6 Afficher le nouveau score du joueur
                System.out.println("   Nouveau score : " + scores[i]);

                // 6.4.1.7 Vérifier si le joueur a gagné
                if (scores[i] == 21) {
                    System.out.println(joueurs[i] + " a gagné !");
                    jeuTermine = true;
                    break;
                }

                // 6.4.1.8 Vérifier si le joueur a dépassé 21
                if (scores[i] > 21) {
                    System.out.println(joueurs[i] + " a dépassé 21 !");
                    int indexGagnant = determinerIndexGagnant(scores);
                    if (indexGagnant != -1) {
                        System.out.println(joueurs[indexGagnant] + " a gagné avec un score de " + scores[indexGagnant] + " !");
                    } else {
                        System.out.println("Aucun joueur n'a un score valide.");
                    }
                    jeuTermine = true;
                    break;
                }
            }
        }
    }
}
