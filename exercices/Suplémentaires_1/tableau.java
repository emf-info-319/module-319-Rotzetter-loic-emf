package exercices.Suplémentaires_1;

public class tableau {
    public static void main(String[] args) {
        int[] notes = new int[5]; //int un tableau "notes" et lui donne une taille de 5
        //notes[4] = 5; sert à remplacer la valeur de la case 4 par 5s
        for (int i = 0; i < notes.length; i++) { //va a cahques fois a la case suivante
            notes[i] = 5;// La case actuel est remplacé par 5
            System.out.println("note " + i + " : " + notes[i]); //i pour sout l'index et le note[i] pour la notes dans la case
        }
    }
}
