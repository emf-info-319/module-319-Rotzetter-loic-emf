public class methodesRevisions {
    public static void main(String[] args) {
        int reponse1 = additionne(3, 3);
        System.out.println("La reponse est : " + reponse1);
        int reponse2 = additionne(5, 5);
        System.out.println("La reponse est : " + reponse2);

        String[] tab = new String[10];
        tab = replietableau(tab);
    }

    public static int additionne(int nbr1, int nbr2) {
        int resultat = nbr1 + nbr2;
        return resultat;
    }

    public static String[] replietableau(String[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = "Bonjours";
        }
        return tab;
    }

}

