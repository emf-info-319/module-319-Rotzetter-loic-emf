package revisions.E1_2020_2021;

public class E1_Rotzetter {
    public static final int LIBRE = 0;
    public static final int OCCUPEE = 1;
    public static final int TOUCHEE = 2;

    public static final int TAILLE_GRILLE[] = new int[20];

    public static final int NBRE_BATEAUX[] = new int[5];

    public static void main(String[] args) {

    }

    public static int choisirIndexAleatoire(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static int[] genererGrille(int taille) {
        int nbreBateauxPlaces = 0;
        int[] grille = new int[taille];
        while (nbreBateauxPlaces < NBRE_BATEAUX) {

            int index = choisirIndexAleatoire(0, taille - 1);

            if (grille[index] == LIBRE) {
                grille[index] = OCCUPEE;
                nbreBateauxPlaces++;
            }
        }
        return grille;
    }
}