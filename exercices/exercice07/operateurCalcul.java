package exercices.exercice07;

public class operateurCalcul {
    public static void main(String[] args) {
        int age = 14;
        int année = 2024;
        int annéedenaissance = année - age;
        System.out.println("Je suis né en " + annéedenaissance + ".");
        if (age >= 4 && age <= 12) {
            System.out.println("Et je suis à l'école primaire.");
        } else if (age > 12 && age <= 16) {
            System.out.println("Et je suis au cycle d'orientation.");
        } else if (age > 16 && age < 65 ) {
            System.out.println("Et j'ai fini le cycle d'orientation.");
        } else if (age < 4) {
            System.out.println("Je n'ai pas encore commencé l'école.");
        } else if (age >= 65 && age <= 114) {
            System.out.println("Et je suis à la retraite");
        } else if (age > 114) {
            System.out.println("Menteur, c'est pas possible. T'es pas l'homme le plus agé du monde.");
        }
    }
}