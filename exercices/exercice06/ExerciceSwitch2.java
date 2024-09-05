package exercices.exercice06;

public class ExerciceSwitch2 {
    public static void main(String[] args) {
        int age = 13;
        if (age == 7) {
            System.err.println("Poussin");
        }if (age == 8 || age == 9) {
            System.out.println("Pupille");
        }if (age == 10 || age == 11) {
            System.out.println("Minime");
        }if (age < 7 || age > 11) {
            System.out.println("Inconnu");
        }
    }
}
