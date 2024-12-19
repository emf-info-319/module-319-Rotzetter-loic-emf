
public class CeR {

    public static final String[] ELEVES = {"Jean", "Paul", "Hadi", "Nolhan", "Loïc"};

    public static void main(String[] args) {
        String[] groupe = creerGroupe(4);
        for (int index = 0; index < groupe.length; index++) {
            System.out.println(groupe[index]);
        }
    }

    public static String choisirEleve() {
        int numRandom = (int) (Math.random() * (ELEVES.length - 1)) + 0;
        return ELEVES[numRandom];
    }

    public static boolean controleDoublon(String nom, String[] groupe) {
        boolean estla = false;
        for (String eleve : groupe) {
            if (eleve == (nom)) {
                estla = true;
            }
        }
        return estla;
    }

    public static String[] creerGroupe(int nombre) {
        int compteur = 0;
        String[] groupe = new String[nombre];

        while (compteur < groupe.length) {
            String eleve = choisirEleve();
            boolean estDedans = controleDoublon(eleve, groupe);
            if (estDedans == false) {
                groupe[compteur] = eleve;
            } else {
                while (estDedans) {
                    eleve = choisirEleve();
                    estDedans = controleDoublon(eleve, groupe);
                    if (!estDedans) {
                        groupe[compteur] = eleve;
                        compteur++;
                    }
                }
            }
        }
        return groupe;
    }
}
