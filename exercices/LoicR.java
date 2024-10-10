package exercices;

public class LoicR {
    public static final int NOTE_MIN = 1;
    public static final int NOTE_MAX = 6;
    public static final int NBRE_NOTES = 5;

    public static void main(String[] args) {
        int[] notesObtenues = new int[NBRE_NOTES];
        double totalNote = 0;
        for (int i = 0; i < notesObtenues.length; i++) {
            notesObtenues[i] = (int) (Math.random() * (NOTE_MAX - NOTE_MIN + 1)) + NOTE_MIN;
            totalNote = totalNote + notesObtenues[i];

            switch (notesObtenues[i]) {
                case 4:
                    System.out.println("La note obtenue est " + notesObtenues[i] + " : suffisant");
                    break;
                case 5:
                    System.out.println("La note obtenue est " + notesObtenues[i] + " : bien");
                    break;
                case 6:
                    System.out.println("La note obtenue est " + notesObtenues[i] + " : très bien");
                    break;
                default:
                    System.out.println("La note obtenue est " + notesObtenues[i] + " : insuffisant");
                    break;
            }
        }
        double moyenne = totalNote / NBRE_NOTES;
        System.out.println("La moyenne est de : " + moyenne);
        if (moyenne > 4) {
            System.out.println(" L'élève est promu ! ");
        } else if (moyenne < 4) {
            System.out.println("L'élève est non promu!");
        }
    }
}
