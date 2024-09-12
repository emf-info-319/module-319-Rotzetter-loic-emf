package exercices.exercice08;

public class ExerciceBoucles1 {
    public static void main(String[] args) {
        for (int iteration = 1; iteration <= 5; iteration++) {
            if (iteration == 2) {
                continue;
            }
            System.out.println("boucle for : " + iteration);
        }
        int iteration = 6;
        while (iteration <= 10) {
            System.out.println("boucle while " + iteration);
            iteration++;
        }
        int iiteration = 11;
        do {
            System.out.println("boucle do-while : " + iiteration);
            iiteration++;   
        } while (iiteration <= 15);
    }
}