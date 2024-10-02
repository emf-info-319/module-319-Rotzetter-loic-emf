package exercices.exercice09;

public class ExerciceTableaux32 {
    public static final int[] tableau32 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    public static void main(String[] args) {

        int moyenneclasse = 0;

        for (int i = 0; i < tableau32.length; i++) {
            System.out.println("Cellule " + i + " : " + tableau32[i]);
        }
        moyenneclasse = (tableau32[0] + tableau32[1] + tableau32[2] + tableau32[3] + tableau32[4] + tableau32[5] + tableau32[6] + tableau32[7] + tableau32[8]) / 9;
        System.out.println("La moyenne de classe est égale à " + moyenneclasse);
    }
}
