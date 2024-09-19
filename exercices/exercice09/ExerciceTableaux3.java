public class ExerciceTableaux3 {

    public static void main(String[] args) {
        int[] montableau = new int[10];
        int moyenne = 0;

        for (int i = 0; i < montableau.length; i++) {
            montableau[i] = (int) (Math.random() * 6) + 1;
        }



        int valeurCellule = 0;
        for (int i = 0 ; i < montableau.length ; i++){
            valeurCellule = valeurCellule + montableau[i];
            System.out.println("Note élèves : " + ( i + 1 ) + " : " + montableau[i]);
        }







        moyenne = ( valeurCellule/10);
        System.out.println( " Moyenne de classe : " + moyenne);
    }
}