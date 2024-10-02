package exercices;

public class révision {
    public static final int MA_CONSTANTE = 100; //Toujours en majuscule et dans publique classe
    public static final int[] tableau22 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };//aussi possible sur les tableaux
    public static void main(String[] args) {
        char charVar = 'a'; //dans des apostrophe et uniquement un caractère
        byte byteVar = 100; //uniquement jusqu'à 8 bits
        short shortVar = 10000; //uniquement jusqu'à 16 bits
        int intVar = 100000; //uniquement jusqu'à 32 bits
        long longVar = 10000000000; //uniquement jusqu'à 64 bits
        float floatVar = 3.14f; //Utilisé lorsque la mémoire est une contrainte et que la précision n’est pas critique
        double doubleVar = 3.141592653589793; //Plus présise qu'une float mais prends plus de place
        boolean isJavaFun = true;//pour une condition oui ou non
        String nomEquipe1 = "Barcelone";// ne pas oublier les "" pour le txt

        int[] montableau = new int[]{1,3,4,5,6,7,8,9};//pour importer un tableau avec des valeures, montableau est le nom

        String[] tab3  = new String[2];//pour entrer un tableau avec du txt, le tableau s'appelle tab3 et à 2 cases de txt

        tab3[0] = "salut";//dans la première case il y à coucou
        tab3[1] = "coucou";
        
        for (int i = 0; i < tab3.length; i++) {//sert à parcourir toutes les cases du tableau
            System.out.println(tab3[i]);//dit qu'il faut écrire dans l'invite la case actuelle du tab3
        }

        System.out.println("Cellule 0 : " + tableau22[0]); //pour sout uniquement la case 0 du tableau22

        int sum = 5 + 3; // sum vaut 8
        int difference = 5 - 3; // difference vaut 2
        int product = 5 * 3; // product vaut 15
        int quotient = 6 / 3 ;
        int remainder = 5 % 3; // remainder vaut 2

        int a = 5; // a vaut 5
        a += 3; // a vaut maintenant 8
        a -= 2; // a vaut maintenant 6
        a *= 2; // a vaut maintenant 12
        a /= 3; // a vaut maintenant 4
        int b = 5; b++; // b vaut maintenant 6

        (==) : boolean isEqual = (5 == 3); // isEqual vaut false
        (<) : boolean isLess = (5 < 3); // isLess vaut false
        (>) : boolean isGreater = (5 > 3); // isGreater vaut true
        (<=) : boolean isLessOrEqual = (5 <= 5); // isLessOrEqual vaut true
        (>=) : boolean isGreaterOrEqual = (5 >= 3); // isGreaterOrEqual vaut true
        (!=) : boolean isNotEqual = (5 != 3); // isNotEqual vaut true

        (||) : boolean orResult = (true || false); // orResult vaut true
        (&&) : boolean andResult = (true && false); // andResult vaut false
        (!) : boolean notResult = !true; // notResult vaut false
        (^) : boolean xorResult = (true ^ false); // xorResult vaut true

        if (scoreEquipe1 > scoreEquipe2) {
            nombrePointEquipe1 += NOMBRE_PTS_VICTOIRE;
            System.out.println(nomEquipe1 + " a gagné");
        }else if (scoreEquipe1 < scoreEquipe2) {
            nombrePointEquipe2 += NOMBRE_PTS_VICTOIRE;
            System.out.println(nomEquipe2 + " a gagné");
        }

        int age = 11;
            switch (age) {
                case 7://si 7 est = a lâge alors sout Poussin
                    System.out.println("Poussin");
                    break;
                case 8:
                case 9:
                System.out.println("Pupille");
                    break;
                case 10:
                case 11:
                    System.out.println("Minime");
                    break;
                default:
                    System.out.println("Inconnu");
                    break;
}

        int iiteration = 5;
        while (iiteration < 10) {//tant que iiteration est plus petit que 10 sout "..." et ajouter 1 a iiteration puis recommencer
            ++iiteration;
            System.out.println("Boucle while, iteration" + iiteration);//fait jusqua que iiteration est < 10 l'arrêt
}

        int iiiteration = 11;
        do {
            System.out.println("Boucle do-while, iteration " + iiiteration);
            ++iiiteration;
        } while (iiiteration <= 15);//jusqua que iiteration <= 15 true, le code continu jusqua 16 sauf que c'est faux donc pas de sout

        for (int i = 0; i < 10; i++) {//vérifie la condition avant chaque itération
            int scoreEquipe1 = ( int ) ( Math.random() * ( 10 - 1 + 1 ) ) + 1;
            int scoreEquipe2 = ( int ) ( Math.random() * ( 10 - 1 + 1 ) ) + 1;
            System.out.println(nomEquipe1 + " joue contre " + nomEquipe2 + " et le résultat est :" + scoreEquipe1 + " : " + scoreEquipe2);
}

    }
}
