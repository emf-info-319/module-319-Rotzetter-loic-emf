package devoirs.devoir03;

public class devoir03 {
    public static void main(String[] args) {
        int Annee = 2024;
        int Mois = 9;
        int Jours = 20;
        int JoursDeLan = 0;
        
        // Calcul du jour de l'année
        int[] JoursParMois = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // année bissextile
        if ((Annee % 4 == 0 && Annee % 100 != 0) || (Annee % 400 == 0)) {
            JoursParMois[1] = 29;

            // calcul du jours de l'an
            for (int i = 0; i < JoursParMois.length; i++) {
                JoursDeLan += JoursParMois[1];
            }
            System.out.println("Le " + Jours + "/" + Mois + "/" + Annee + " est le jour " + JoursDeLan + " de l'An.");
        }
    }
}
