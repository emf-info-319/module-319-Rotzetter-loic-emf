package exercices.exercice12;

public class ExercicesString {
    public static void main(String[] args) {
        String maChaineDeCaractere = "Voici du contenu stocké dans un String.";
        System.out.print("La position de 'contenu' est :  ");
        System.out.println(maChaineDeCaractere.length());
        System.out.print("La position de 'contenu' est : ");
        System.out.println(maChaineDeCaractere.indexOf("contenu"));
        System.out.print("La position 17 contient la lettre : ");
        System.out.println(maChaineDeCaractere.charAt(17));

        String monNom = "Loïc";
        for (int i = 0; i < monNom.length(); i++) {
            System.out.println("La lettre à la position " + i + " est : " + monNom.charAt(i));
        }
        if (monNom.indexOf("test") == -1) {
            System.out.println("La chaîne de caractère" + monNom + " ne contient pas le texte test.");
        } else
            System.out.println("La chaîne de caractère" + monNom + " contient le texte test.");
    }
}
