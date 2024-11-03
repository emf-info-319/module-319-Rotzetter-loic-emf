public class ExercicesMethodesTableaux {
    public static void main(String[] args) {
        tab(5);
        tab2(8);
        remplirTableauAleatoire(10);
        int taille = tailleTableau(5);
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

public static int[] tailleTableau(int[] taille) {
    int[] tatab = new int[taille];
    return tableau.length;
}