import java.util.Scanner;

public class rep {
    public static final int NOMBRE_BATONNETS = 21;
    public static final int MIN = 1;
    public static final int MAX = 3;

    public static void main(String[] args) {
        int[] batonnets = new int[NOMBRE_BATONNETS];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < batonnets.length; i++) {
            batonnets[i] = 1;
        }
            System.out.println("Bienvenue dans le jeu de Nim !");
            System.out.println(" Règles : Vous et l'IA retirez tour à tour entre 1 et 3 \r\n" + "bâtonnets.");
            System.out.println("Le joueur qui retire le dernier bâtonnet perd.");
            boolean tourJoueur = true;

            while (nbBatonnetRestants(batonnets) > 0) {
                afficherBatonnets(batonnets);
                tourJoueur = !tourJoueur;
            if (tourJoueur) {
                int nbEnleve = demanderNombre(scanner);
                batonnets = enleverBatonnets(batonnets, nbEnleve);
            } else {
                int nbEnleveIA = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
                System.out.println("L'IA a enlevée " + nbEnleveIA + " bâtonnets");
                batonnets = enleverBatonnets(batonnets, nbEnleveIA);
            }
        }
            if (tourJoueur) {
                System.out.println("Vous avez retiré le dernier bâtonnet. L'IA \r\n" + "gagne ! ");
            } else {
                System.out.println("L'IA a retiré le dernier bâtonnet. Vous gagnez !");
            }
        scanner.close();
    }

    public static void afficherBatonnets(int[] batonnets) {
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                System.out.print("| ");
            } else {
                System.out.print("- ");
            }
        }
    }

    public static int nbBatonnetRestants(int[] batonnet) {
        int nbRestants = 0;
        for (int i = 0; i < batonnet.length; i++) {
            if (batonnet[i] == 1) {
                nbRestants++;
            }
        }
        return nbRestants;
    }

    public static int[] enleverBatonnets(int[] batonnet, int nbEnleve) {
        int nbRestants = nbBatonnetRestants(batonnet);
        int nbEnleveMax = Math.min(nbEnleve, nbRestants);
        
        for (int i = batonnet.length -1; i >= 0 && nbEnleveMax > 0; i--) {
            if (batonnet[i] == 1) {
                batonnet[i] = 0;
                nbEnleveMax--;
            }
        }
        return batonnet;
    }

    public static int demanderNombre(Scanner scanner) {
        System.out.print("Entre un nombre entre 1 et 3 : ");
        int valeur = scanner.nextInt();
        while (valeur > MAX || valeur < MIN) {
            System.out.println("Nombre invalide. Veuillez entrer une nombre entre 1 et 3");
            valeur = scanner.nextInt();
        }
        return valeur;
    }
}