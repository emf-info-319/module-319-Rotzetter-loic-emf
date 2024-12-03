import java.util.Scanner;

public class Application {
    public static final int NOMBRE_BATONNETS = 21; // Le nombre initial de bâtonnets
    public static final int MIN = 1; // Le nombre minimal de bâtonnet que l'IA peut retirer
    public static final int MAX = 3; // Le nombre maximal de bâtonnet que l'IA peut retirer

    public static void main(String[] args) {
        int[] batonnets = new int[NOMBRE_BATONNETS];
        Scanner scanner = new Scanner(System.in);

        // Initialisation du tableau avec des bâtonnets
        for (int i = 0; i < NOMBRE_BATONNETS; i++) {
            batonnets[i] = 1;
        }

        System.out.println("Bienvenue dans le jeu de Nim !");
        System.out.println("Règles : Vous et l'IA retirez tour à tour entre 1 et 3 bâtonnets.");
        System.out.println("Le joueur qui retire le dernier bâtonnet perd.");

        boolean tourJoueur = true; // true : tour du joueur, false : tour de l'IA

        while (nbBatonnetsRestants(batonnets) > 0) {
            afficherBatonnets(batonnets);
            tourJoueur = !tourJoueur;
            if (tourJoueur) {
                int nbEnleve = demanderNombre(scanner);
                batonnets = enleverBatonnets(batonnets, nbEnleve);
            } else {
                int nbEnleveIA = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
                System.out.println("L'IA enlève " + nbEnleveIA + " bâtonnet(s).");
                batonnets = enleverBatonnets(batonnets, nbEnleveIA);
            }

        }

        // Le joueur actuel a perdu puisque c'est son tour de jouer et il ne reste plus
        // de bâtonnets.
        if (tourJoueur) {
            System.out.println("Vous avez retiré le dernier bâtonnet. L'IA gagne !");
        } else {
            System.out.println("L'IA a retiré le dernier bâtonnet. Vous gagnez !");
        }

        scanner.close();
    }

    public static void afficherBatonnets(int[] batonnets) {
        for (int batonnet : batonnets) {
            if (batonnet == 1) {
                System.out.print("| ");
            } else {
                System.out.print("- ");
            }
        }
        System.out.println(); // Nouvelle ligne pour afficher le résultat sur plusieurs lignes.
    }

    public static int nbBatonnetsRestants(int[] batonnets) {
        int nbRestants = 0;
        for (int batonnet : batonnets) {
            if (batonnet == 1) {
                nbRestants++;
            }
        }
        return nbRestants;
    }

    public static int[] enleverBatonnets(int[] batonnets, int nbEnleve) {
        int nbRestants = nbBatonnetsRestants(batonnets);
        int nbEnleveMax = Math.min(nbEnleve, nbRestants);
        for (int i = batonnets.length - 1; i >= 0 && nbEnleveMax > 0; i--) {
            if (batonnets[i] == 1) {
                batonnets[i] = 0;
                nbEnleveMax--;
            }
        }
        return batonnets;
    }

    public static int demanderNombre(Scanner scanner) {
        int nbEnleve;

        do {
            System.out.print("Combien de bâtonnets voulez-vous enlever (1, 2 ou 3) ? ");
            nbEnleve = scanner.nextInt();
        } while (nbEnleve < 1 || nbEnleve > 3);

        return nbEnleve;
    }

}
