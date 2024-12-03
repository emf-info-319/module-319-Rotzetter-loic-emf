public class devoir6 {
    public static final int TAILLE_TABLEAU = 20;
    public static final int VALEUR_MIN = 0;
    public static final int VALEUR_MAX = 50;
    public static final int VALEUR_RECHERCHEE = 7;

    public static void main(String[] args) {
        int[] tableau = VALEUR_RECHERCHEE(TAILLE_TABLEAU, VALEUR_MIN, VALEUR_MAX);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Tableau["+ i + "] = [" + tableau[i] + "]");
        }


        int valeurmin = rechercheMin(tableau);
        System.out.println("La plus petite valeur trouvée est : " + valeurmin);

        int valeurMaximale = rechercheMax(tableau);
        System.out.println("La plus grande valeur trouvée est : " + valeurMaximale);

        int position = rechercheValeur(tableau, VALEUR_RECHERCHEE);
        System.out.println("Le nombre [" + VALEUR_RECHERCHEE + "] est à la position [" + position + "] du tableau.");
    }

    public static int[] VALEUR_RECHERCHEE(int taille, int min, int max) {
        int[] tableau = new int[taille];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return tableau;
    }

    public static int rechercheMin(int[] tableau){
        int valeurMinimale = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] > valeurMinimale) {
                valeurMinimale = tableau[i];
            }
        }
        return valeurMinimale;
    }

    public static int rechercheMax(int[] tableau){
        int valeurMaximale = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] > valeurMaximale) {
                valeurMaximale = tableau[i];
            }
        }
        return valeurMaximale;
    }

    public static int rechercheValeur(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1;
    }
}