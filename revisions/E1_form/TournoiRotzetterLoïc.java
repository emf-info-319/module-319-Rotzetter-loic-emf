package revisions.E1_form;

public class TournoiRotzetterLoïc {
    public static final String[] EQUIPES = {"FC Richemont", "FC Central", "FC Schoenberg", "FC Beauregard", "Team AFF", "Etoile Sport"};
    public static final int MAX_GOAL = 10;
    public static void main(String[] args) {
        int pointsEquipes = 0;

        
    }
    public static void[] (index1; index2){
        scoreEquipe1 = ( int ) ( Math.random() * ( MAX_GOAL - 0 + 1 ) ) + 0;
        scoreEquipe2 = ( int ) ( Math.random() * ( MAX_GOAL - 0 + 1 ) ) + 0;

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
        pointsEquipes = 0;
        
    }
}
