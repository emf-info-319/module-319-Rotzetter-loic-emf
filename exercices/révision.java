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

        int[] montableau = new int[]{1,3,4,5,6,7,8,9};//pour importer un tableau avec des valeures, montableau est le nom

        String[] tab3  = new String[2];//pour entrer un tableau avec du txt, le tableau s'appelle tab3 et à 2 cases de txt
        tab3[0] = "salut";//dans la première case il y à coucou
        tab3[1] = "coucou";
        
        for (int i = 0; i < tab3.length; i++) {//sert à parcourir toutes les cases du tableau
            System.out.println(tab3[i]);//dit qu'il faut écrire dans l'invite la case actuelle du tab3
        }

        System.out.println("Cellule 0 : " + tableau22[0]); //pour sout uniquement la case 0 du tableau22

        

    }
}
