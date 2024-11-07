public class test {
    public static final int MAX = 100;
    public static final int MIN = 0;

    public static void main(String[] args) {
        System.out.println("Contenu du tableau initial :");
        int[] tableauInitial = new int[4];
        for (int i = 0; i < 4; i++) {
            tableauInitial[i] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.println("Tableau initial " + tableauInitial[i]);
        }
        System.out.println("Contenu du tableau final :");
        int[] tableauFinal = inverseLeTableau(tableauInitial);
        for (int i = 0; i < tableauFinal.length; i++) {
            System.out.println("tableauFinal " + tableauFinal[i]);
        }

    }

    public static int[] inverseLeTableau(int[] tableauInitial) {
        int taille = tableauInitial.length;
        int[] tableauInverse = new int[taille];

        for (int i = 0; i < taille; i++) {
            tableauInverse[i] = tableauInitial[taille - 1 - i];
        }

        return tableauInverse;
    }
}
