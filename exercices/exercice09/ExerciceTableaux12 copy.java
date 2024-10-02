package exercices.exercice09;

public class ExerciceTableaux12 {
    public static void main(String[] args) {
        int[] montableau = new int[]{1, 3, 4, 5,6,7,8,9};

        for (int i = 0; i < montableau.length; i++) {
            System.out.println(montableau[i]);
        }

        String[] tab3  = new String[5];
        tab3[0] = "salut";
        tab3[1] = "coucou";
        tab3[2] = "comment ca va?";
        tab3[4] = "j'aime manger";
        for (int i = 0; i < tab3.length; i++) {
            System.out.println(tab3[i]);
        }
    }
}
