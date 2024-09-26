package exercices.Evaluation_00;

public class Rotzetter_E00 {
    final int NOMBRE_PTS_VICTOIRE = 3;

    public static void main(String[] args) {
        String nomEquipe1 = "Barcelone";
        String nomEquipe2 = "Madride";
        int nombrePointEquipe1 = 0;
        int nombrePointEquipe2 = 0;

        for (int i = 0; i < 10; i++) {
            int scoreEquipe1 = (int) (Math.random() * (10 - 1 + 1)) + 1;
            int scoreEquipe2 = (int) (Math.random() * (10 - 1 + 1)) + 1;
            System.out.println(nomEquipe1 + "joue contre " + nomEquipe2 + " et le résultat est : " + scoreEquipe1+ " à " + scoreEquipe2 + ".");
            
            if (scoreEquipe1 > scoreEquipe2) {
                nombrePointEquipe1 += 3;
                System.out.println("nomEquipe1 a gagné");
            } else if (scoreEquipe2 > scoreEquipe1) {
                nombrePointEquipe2 += 3;
                System.out.println("nomEquipe2 a gagné");
            } else if (scoreEquipe1 == scoreEquipe2) {
                System.out.println("Match nul !");
                nombrePointEquipe2 += 1;
                nombrePointEquipe1 += 1;
            }
        }
        System.out.println("Barcelone à " + nombrePointEquipe1 + " points.");
        System.out.println("Madride à " + nombrePointEquipe2 + " points.");
    }
}
