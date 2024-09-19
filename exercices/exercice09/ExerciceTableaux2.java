public class ExerciceTableaux2 {

    public static void main(String[] args) {
        int[] montableau = new int[10];
        
        for (int i = 0; i < montableau.length; i++) {
            montableau[i] = (int) (Math.random() * 6) + 1;
            System.out.println("Cellule " + i +" : " +montableau[i]);
        }
    }
}