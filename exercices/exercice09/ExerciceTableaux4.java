package exercices.exercice09;

public class ExerciceTableaux4 {
    public final static int Min = 1;
    public final static int Max = 100;

    public static void main(String[] args) {
        int nombre = (int) (Math.random() * (Max - Min + 1)) + Min;

        int[] tab = new int[5];
        for (int i = 0; i < tab.length; i++) {
            nombre++;
            System.out.println("La cellule " + i + " : " + nombre);
        }

    }
}
