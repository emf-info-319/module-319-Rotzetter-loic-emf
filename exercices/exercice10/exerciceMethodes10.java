public class exerciceMethodes10 {

    public class ExercicesMethodesTableaux {
        public final static int MAX = 20;
        public final static int MIN = 1;
        public final static int VALEUR = 50;

        public static void main(String[] args) {
            System.out.println("Le tableau a un taille de 50 cellules.\n");
            System.out.println("\nContenu du tableau aléatoire : ");
            int[] tableau = creeTableau(VALEUR);
            int[] tabRandom = valeurAléatoir(tableau);
            for (int i = 0; i < tabRandom.length; i++) {
                System.out.println("tab [" + i + "] = " + tabRandom[i]);
            }
            int min = tabMin(tabRandom);
            int max = tabMax(tabRandom);
            System.out.println("La valeur min trouvée = " + min);
            System.out.println("La valeur max trouvée = " + max + "\n");
            System.out.println("\nAprès remplacement de la valeur 12 par la valeur 5 voici le contenu du tableau : ");
            tabRandom = remplaceVal(tabRandom, 12, 5);
            for (int i = 0; i < tabRandom.length; i++) {
                System.out.println("tab [" + i + "] = " + tabRandom[i]);
            }
            int somme = sommeTab(tabRandom);
            double moyenne = moyenneTab(tabRandom);
            int positionDeb = occurenceDeb(tabRandom, 13);
            int positionFin = occurenceFin(tabRandom, 13);
            System.out.println("\nLa somme des cellules du tableau = " + somme);
            System.out.println("La moyenne des cellules du tableau = " + moyenne);
            System.out.println("La valeur 13 a été trouvée à la 1ère position N°" + positionDeb);
            System.out.println("La valeur 13 a été trouvée à la dernière position N°" + positionFin);

        }

        public static int[] creeTableau(int taille) {
            int[] tableau = new int[taille];
            return tableau;
        }

        public static int[] valeurTableau(int[] tableauARemplir, int valeurADonner) {
            for (int i = 0; i < tableauARemplir.length; i++) {
                tableauARemplir[i] = valeurADonner;
            }
            return tableauARemplir;
        }

        public static int[] valeurAléatoir(int[] tableauARemplir) {
            for (int i = 0; i < tableauARemplir.length; i++) {
                tableauARemplir[i] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            }
            return tableauARemplir;
        }

        public static int taille(int[] tableauMesure) {
            int taille = 0;
            for (int i = 0; i < tableauMesure.length; i++) {
                taille++;
            }
            return taille;
        }

        public static void tabContenu(int[] tableauAfficher) {
            for (int i = 0; i < tableauAfficher.length; i++) {
                System.out.println(tableauAfficher[i]);
            }
        }

        public static int tabMin(int[] tableauRecherche) {// pour trouver une valeur minimal dans un tableaux
            int min = tableauRecherche[0];
            for (int i = 1; i < tableauRecherche.length; i++) {
                if (tableauRecherche[i] < min) {
                    min = tableauRecherche[i];
                }
            }
            return min;
        }

        public static int tabMax(int[] tableauRecherche) {// pour trouver une valeur maximal dans un tableaux
            int max = tableauRecherche[0];
            for (int i = 1; i < tableauRecherche.length; i++) {
                if (tableauRecherche[i] > max) {
                    max = tableauRecherche[i];
                }
            }
            return max;
        }

        public static int nbrFrequence(int[] tableauRecherche, int valeurChercher) {
            int compteur = 0;
            for (int i = 0; i < tableauRecherche.length; i++) {
                if (tableauRecherche[i] == valeurChercher) {
                    compteur++;
                }
            }
            return compteur;
        }

        public static int sommeTab(int[] tableauCalcule) {
            int somme = 0;
            for (int i = 0; i < tableauCalcule.length; i++) {
                somme = somme + tableauCalcule[i];
            }
            return somme;
        }

        public static double moyenneTab(int[] tableauCalcule) {
            double moyenne = 0;
            for (int i = 0; i < tableauCalcule.length; i++) {
                moyenne = moyenne + tableauCalcule[i];
            }
            moyenne = moyenne / VALEUR;
            return moyenne;
        }

        public static int[] remplaceVal(int[] tableau, int valeurAChercher, int valeurRemplacement) {
            for (int i = 0; i < tableau.length; i++) {
                if (tableau[i] == valeurAChercher) {
                    tableau[i] = valeurRemplacement;
                }
            }
            return tableau;
        }

        public static int occurenceDeb(int[] tableauRecherche, int valeurAChercher) {                //pour eval
            int indexTrouver = -1;
            for (int i = 0; i < tableauRecherche.length; i++) {
                if (tableauRecherche[i] == valeurAChercher) {
                    indexTrouver = i;
                    break;
                }
            }
            return indexTrouver;
        }

        public static int occurenceFin(int[] tableauRecherche, int valeurAChercher) {
            int indexTrouver = -1;
            for (int i = 0; i < tableauRecherche.length; i++) {
                if (tableauRecherche[i] == valeurAChercher) {
                    indexTrouver = i;
                }
            }
            return indexTrouver;
        }
    }
}
