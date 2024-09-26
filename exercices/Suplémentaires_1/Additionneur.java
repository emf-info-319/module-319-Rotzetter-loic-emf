package exercices.Suplémentaires_1;

public class Additionneur {
    public static void main(String[] args) {
        int valeur = ( int ) ( Math.random() * ( 10 - 0 + 1 ) ) + 0;
        int resultat = 0;

        for (int i = 0; i < valeur; i++) {
            {
                resultat += i;
            }
        }
        System.out.println(resultat);
    }
}
