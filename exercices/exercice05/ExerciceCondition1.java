package exercices.exercice05;

public class ExerciceCondition1 {
    public static void main(String[] args) {
        int valeurATester = -1;
        System.out.println(valeurATester);
        if (valeurATester > 0) {
            System.out.println("La valeur est positive");
        } else if (valeurATester < 0) {// instructions pas obligatoire
            System.out.println("La valeur est négative");
        }
    }
}
