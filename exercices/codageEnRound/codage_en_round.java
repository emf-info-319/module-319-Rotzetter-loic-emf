package exercices.codageEnRound;

public class codage_en_round {
    double PI = 3.14;

    public static void main(String[] args) {
        int[] rayon = new int[10];
        for (int i = 0; i < rayon.length; i++) {
            rayon [i] = generenombre(1, 10);
        }

        for (int i = rayon.length; i <0 ; i--) {
            if (rayon[i] > 50) {
                double aire = 3.14*rayon[i]*rayon[i];
                System.out.println(aire);
            }
        }
    }

}

 public static int generenombre(int min, int max){
    int generenombre = ( int ) ( Math.random() * ( max - min + 1 ) ) + min;
    return generenombre;
 }
