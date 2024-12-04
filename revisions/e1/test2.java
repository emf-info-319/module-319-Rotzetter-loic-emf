public class test2 {
    public static String[] EQUIPES = { "FC Richemont", "FC Central", "FC Schoenberg", "FC Beauregard", "Team AFF",
            "Etoile Sport" };
    public static int MAX_GOAL = 10;
    public static int[] pointsEquipes;

    public static void main(String[] args) {
        pointsEquipes = new int[EQUIPES.length];

        for (int i = 0; i < EQUIPES.length; i++) {
            if (i < EQUIPES.length - 1) {
                simuleMatch(i, i + 1);
            } else {
                simuleMatch(i, 0);
            }
        }

        System.out.println("-----------------------------");

        for (int i = 0; i < EQUIPES.length; i++) {
            System.out.println("L'équipe " + EQUIPES[i] + " a " + pointsEquipes[i] + " points.");
        }
        System.out.println("-----------------------------");

        int[] gagnants = trouveGagnants();
        for (int i = 0; i < gagnants.length; i++) {
            System.out.println("L'équipe " + EQUIPES[gagnants[i]] + " a gagné.");
        }
    }

    public static void simuleMatch(int index1, int index2) {
        int scoreEquipe1 = (int) (Math.random() * (MAX_GOAL - 0 + 1)) + 0;
        int scoreEquipe2 = (int) (Math.random() * (MAX_GOAL - 0 + 1)) + 0;

        if (scoreEquipe1 > scoreEquipe2) {
            pointsEquipes[index1] = pointsEquipes[index1] + 3;
            System.out.println(" L'équipe " + EQUIPES[index1] + " a gagné contre l'équipe " + EQUIPES[index2]);
        } else if (scoreEquipe1 < scoreEquipe2) {
            pointsEquipes[index2] = pointsEquipes[index2] + 3;
            System.out.println(" L'équipe " + EQUIPES[index2] + " a gagné contre l'équipe " + EQUIPES[index1]);
        } else if (scoreEquipe1 == scoreEquipe2) {
            pointsEquipes[index1] = pointsEquipes[index1] + 1;
            pointsEquipes[index2] = pointsEquipes[index2] + 1;
            System.out.println(" Match nul entre " + EQUIPES[index1] + " et " + EQUIPES[index2]);
        }
    }

    public static int[] trouveGagnants() {
        int maxPts = rechercheMaxPts();
        int compteurDesGagnants = 0;
        int[] equipeGagnante;
        for (int i = 0; i < EQUIPES.length; i++) {
            if (pointsEquipes[i] == maxPts) {
                compteurDesGagnants++;
            }
        }
        int compteur = 0;
        equipeGagnante = new int[compteurDesGagnants];
        for (int i = 0; i < EQUIPES.length; i++) {
            if (pointsEquipes[i] == maxPts) {
                equipeGagnante[compteur++] = i;
            }
        }
        return equipeGagnante;
    }

    public static int rechercheMaxPts() {
        int pointMax = 0;
        for (int i = 0; i < EQUIPES.length; i++) {
            if (pointsEquipes[i] > pointMax) {
                pointMax = pointsEquipes[i];
            }
        }
        return pointMax;
    }
}
