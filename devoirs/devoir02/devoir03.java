package devoirs.devoir02;

public class devoir03 {
    public final static int CAPACITE_RESERVOIR_A = 3;
    public final static int CAPACITE_RESERVOIR_B = 5;

    public static void main(String[] args) {
        int reservoirA = 0;
        int reservoirB = 0;
        int remplissage = (int) (Math.random() * (8 - 1 + 1)) + 1;
        System.out.println("Il y a " + remplissage + " litres à remplir");

        while (reservoirA + reservoirB < remplissage) {
            if (reservoirA < CAPACITE_RESERVOIR_A) {
                System.out.println("Remplissage du réservoir A...");
                reservoirA++;
            } else if (reservoirB < CAPACITE_RESERVOIR_B) {
                System.out.println("Remplissage du réservoir B...");
                reservoirB++;
            }
            System.out.println("Le réservoir A : " + reservoirA + " ,le réservoir B : " + reservoirB);
        }

        System.out.println("Niveau final du réservoir A : " + reservoirA);
        System.out.println("Niveau final du réservoir B : " + reservoirB);
        System.out.println("Remplissage terminé!");
    }
}
