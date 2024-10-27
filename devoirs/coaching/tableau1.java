package devoirs.Coaching;

public class tableau1 {
    public static void main(String[] args) {
        int tableau1[] = { 4, 8, 7, 9, 1, 5, 4, 3 }; // créer un tableau avec des valeurs
        int tableau2[] = { 7, 6, 5, 2, 1, 3, 7, 4 };

        int resultats[] = new int[8]; // créer un tableau avec sa tailler

        for (int i = 0; i < tableau1.length; i++) {
            resultats[i] = tableau1[i] + tableau2[i]; // comment remplire la case
            System.out.println(resultats[i]);
        }
    }
}
//g