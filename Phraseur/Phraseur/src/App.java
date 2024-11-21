public class App {

    public static void main(String[] args) throws Exception {
        String[] sujets = new String[] { "Le chien ", "Le chat ", "Ma soeur", "Ta mère" };
        String[] verbes = new String[] { "joue", "regarde", "mange", "utilise", };
        String[] choses = new String[] { "le pc.", "la voiture.", "le pain.", "le voisin" };
        for (int i = 0; i < 10; i++) {
            String sujet = choisirMot(sujets);
            String verbe = choisirMot(verbes);
            String chose = choisirMot(choses);

            System.out.println(sujet + " " + verbe + " " + chose);
        }
    }

    public static int nbreAleatoire(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static String choisirMot(String[] tableau) {
        int index = nbreAleatoire(0, tableau.length - 1);
        return tableau[index];
    }
}
