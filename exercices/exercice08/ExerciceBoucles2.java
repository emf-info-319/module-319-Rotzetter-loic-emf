package exercices.exercice08;

public class ExerciceBoucles2 {
        public static void main(String[] args) {
            for (int iteration = 5; iteration >= 1; iteration--) {
                System.out.println("boucle for : " + iteration);
            }
            int iteration = 5;
            while (iteration >= 1) {
                System.out.println("boucle while " + iteration);
                iteration--;
            }
            int iiteration = 5;
            do {
                System.out.println("boucle do-while : " + iiteration);
                iiteration--;   
            } while (iiteration >= 1);
        }
}
