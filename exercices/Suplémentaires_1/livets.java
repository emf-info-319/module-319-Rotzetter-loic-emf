public class livets {
    public static final int MAX = 20;
    public static final int MIN = 5;

    public static void main(String[] args) {
        int nbr1 = choisirUnNombre();
        int nbr2 = choisirUnNombre();

        System.out.println("Les deux nombres choisis sont : " + nbr1 + " : " + nbr2);

        String[] table1 = construireTableMultiplication(nbr1, nbr2);

        // SOUT CHAQUE LIGNE DE TABLE1
        for (int i = 0; i < table1.length; i++) {
            System.out.println(table1[i]);
        }

    }
}

public static int choisirUnNombre() {
    int numRandom = (int) (Math.random() * (20 - 5 + 1)) + 5;
    return numRandom;
}

public static String[] construireTableMultiplication(int entier1, int entier2) {
    String[] tableauMultiplication = new String[entier1 * entier2];
    int a = 1;
    int b = 1;
    for (int i = 0; i < tableauMultiplication.length; i++) {
        if (b < entier1) {
            b++;
        } else {
            b = 1;
            if (a < entier2) {
                a++;
            } else {
                a = 1;
            }
            tableauMultiplication[i] = a + " x " + b + " = " + a * b;
        }
        // System.out.println(a + " x " + b + " = " + a * b);
        // mettre dans tableauMultiplication[i] le texte

    }
    return tableauMultiplication;

}