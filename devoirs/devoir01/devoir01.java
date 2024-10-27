package devoirs.devoir01;

public class devoir01 {
    public static void main(String[] args) {
        int age = 17;
        boolean estMajeur;
        String nom = "Loïc Rotzetter ";
        System.out.println("Je m'appelle " + nom);
        System.out.println("Mon âge est de " + age + "ans .");
        if (age >= 20) {
            estMajeur = true;
        } else {
            estMajeur = false;
        }
        if (estMajeur) {
            System.out.println("Je suis majeur");
        } else {
            System.out.println("Je ne suis pas encore majeur");
        } 
    }
}
