public class Methodes {
    public final static int MAX = 20;
    public final static int MIN = 1;
    public final static int VALEUR = 50;

    public static void main(String[] args) {
        direBonjour();
        dire(args);
        math();
        int[] tab = creeTableau(8);
        int[] tabRempli = tableau_a_remplir(8); // Appel de la méthode tableau_a_remplir
        int[] tabAlea = valeurAleatoire(5);

    }

    public static void direBonjour() {
        System.out.println("Bonjour");
    }

    public static void dire(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void math() {
        int min = Math.min(8, 1);
        System.out.println(min);
        int max = Math.max(7, 8);
        System.out.println(max);
        double pow = Math.pow(71.3, 125.5);
        System.out.println(pow);
        double sqrt = Math.sqrt(15.3);
        System.out.println(sqrt);
        int abs = Math.abs(5);
        System.out.println(abs);
    }

    public static int[] creeTableau(int taille) {
        int[] tab = new int[taille];
        return tab;
    }

    public static int[] tableau_a_remplir(int taille) {
        int[] tab = new int[taille];
        for (int i = 0; i < taille; i++) {
            tab[i] = VALEUR;
        }
        return tab;
    }

    public static int[] valeurAleatoire(int taille) {
        int[] tab = new int[taille];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        }
        return tab;
    }

    public static int tailleTab(int[] tab) {
        int taille = 0;
        for (int i = 0; i < tab.length; i++) {
            taille++;
        }
        return taille;
    }
}

