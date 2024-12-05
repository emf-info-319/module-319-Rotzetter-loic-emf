public class test {
    public static String[] EQUIPES = { "FC Richemont", "FC Central", "FC Schoenberg", "FC Beauregard", "Team AFF",
            "Etoile Sport" };
    public static int MAX_GOAL = 10;
    public static int[] pointsEquipes;

    public static void main(String[] args) {
        pointsEquipes = new int[EQUIPES.length];
    }

    public static void simuleMatch(int index1, int index2) {
        int scoreEquipe1 = (int) (Math.random() * (MAX_GOAL - 0 + 1)) + 0;
        int scoreEquipe2 = (int) (Math.random() * (MAX_GOAL - 0 + 1)) + 0;
        
        if (scoreEquipe1 > scoreEquipe2) {
            pointsEquipes[equipe1] = pointsEquipes[equipe1] + 3;
            System.out.println(EQUIPES[equipe1] + " a gagné contre " + EQUIPES[equipe2]);
        } else if (scoreEquipe1 < scoreEquipe2) {
            pointsEquipes[equipe2] = pointsEquipes[equipe2] + 3;
            System.out.println(EQUIPES[equipe2] + " a gagné contre " + EQUIPES[equipe1]);
        } else {
            pointsEquipes[equipe1] = pointsEquipes[equipe1] + 1;
            pointsEquipes[equipe2] = pointsEquipes[equipe2] + 1;
            System.out.println("Match nul entre " + EQUIPES[equipe1] + " et " + EQUIPES[equipe2]);
        }
    }

    public static int rechercheMaxPts(){
        int maxPts = 0;
        for (int i = 0; i < pointsEquipes.length; i++) {
            if (pointsEquipes[i] > maxPts) {
                maxPts = pointsEquipes[i];
            }
        }
        return maxPts;
    }

    public static int[] trouveGagnants(){
        int maxPts = rechercheMaxPts();
        int compteurDesGagnants = 0;
        for (int i = 0; i < EQUIPES.length; i++) {
            if (pointsEquipes[i] == maxPts) {
            compteurDesGagnants++;
            }
        }
        int equipeGagnante = new int [compteurDesGagnants];

        for (int i = 0; i < pointsEquipes; i++) {
            if () {
                
            }
        }
    }
}
