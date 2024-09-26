package exercices.Suplémentaires_1;

public class Ordre_croissant {
    public static void main(String[] args) {

        int valeur1 = ( int ) ( Math.random() * ( 100 - 0 + 1 ) ) + 0;
        int valeur2 = ( int ) ( Math.random() * ( 100 - 0 + 1 ) ) + 0;
        if (valeur1 > valeur2) {
            System.out.println("La valeur la plus grande est: "+valeur1+ " et la valeur la moin grande est: "+valeur2+".");
        }
        else if (valeur2 < valeur1) {
            System.out.println("La valeur la plus grande est: "+valeur2+ " et la valeur la moin grande est: "+valeur1+".");
        }
        }
}
