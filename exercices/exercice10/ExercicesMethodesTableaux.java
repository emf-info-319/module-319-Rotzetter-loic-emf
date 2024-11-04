public class ExercicesMethodesTableaux {
    public static void main(String[] args) {
        tab(5);
        tab2(8);
        remplirTableauAleatoire(10);
        int taille = tailleTableau(5);
        afficherTableau();
        int[] tableau6 = {5, 3, 8, 1, 4};
    }

    public static int[] tab(int taille) {
        int[] tabok = new int[taille];
        System.out.println("ok");
        return tabok;

    }

    public static void tab2(int aperol) {
        int[] tabvr = new int[] { aperol };
        System.out.println(tabvr[0]);
    }

    public static int remplirTableauAleatoire(int taille) {
        int[] remplirTableauAleatoire = new int[taille];
        for (int i = 0; i < remplirTableauAleatoire.length; i++) {
            int nombre = (int) (Math.random() * (10 - 1 + 1)) + 1;
            System.out.println(i + remplirTableauAleatoire[i]);
        }
        return taille;
    }
}

public static int[] tailleTableau(int taille) {
    int[] tatab = new int[5];
    return tableau.length;
}

public static void afficherTableau(int[] tableau) {
    System.out.print("Contenu du tableau : ");
    for (int val : tableau) {
        System.out.print(val + " ");
    }
    System.out.println();  // Ajoute une nouvelle ligne après l'affichage
}

public class AffichageTableau {

    private static int[] tableau = {1, 2, 3, 4, 5}; 

    public static void afficherTableau() {
        int[] tableau1 = {1, 2, 3, 4, 5};
        }
    }

    public class ExercicesMethodesTableaux {

    public static void main(String[] args) {
        int[] tableau = {5, 3, 8, 1, 4}; // Déclaration du tableau dans main
        System.out.println("La valeur minimale est : " + trouverMinimum(tableau)); // Appel direct de la méthode
    }

    public static int trouverMinimum(int[] tableau) {
        int min = tableau[0]; // Initialise min avec le premier élément du tableau
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < min) {
                min = tableau[i]; // Met à jour min si un élément plus petit est trouvé
            }
        }
        return min;
    }
}

public static int trouverMinimum(int[] tableau) {
    int min = tableau[0]; // Initialise min avec le premier élément du tableau
    for (int i = 1; i < tableau.length; i++) {
        if (tableau[i] < min) {
            min = tableau[i]; // Met à jour min si un élément plus petit est trouvé
        }
    }
    return min;
}