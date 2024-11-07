package exercices.exercice11;

public class ExercicesInversionTableau {
    public static final int MAX = 100;
    public static final int MIN = 0;
    public static void main(String[] args) {
        System.out.println("Contenu du tableau initial :");
        int[] tableauInitial = new int[4];
        for (int i = 0; i <= 4; i++) {
            tableauInitial[i] = ( int ) ( Math.random() * ( MAX - MIN + 1 ) ) + MIN;
            System.out.println("->" + tableauInitial[i]);
        }
        int[] tableauFinal = new int[4];
        inverseLeTableau(tableauInitial);
        for (int i = 0; i < tableauFinal.length; i++) {
            tableauFinal[i] = inverseLeTableau[i];
            System.out.println("test"+tableauFinal[i]);
        }
        
    }
    public static int[] inverseLeTableau(int[] tableauInitial){
        int taille = tableauInitial.length;
        int[] tableauInverse = new int[taille];

        for (int i = 0; i < tableauInverse.length; i++) {
            tableauInverse[i] = tableauInitial[taille - 1 - i];
        }

        return tableauInverse;
}
}
