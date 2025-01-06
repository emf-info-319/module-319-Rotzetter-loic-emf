public class test {
    public static final int MIN = 2;
    public static final int MAX = 14;

    public static int tirerUneCarte() {
        int nombre = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        return nombre;
    }
    public static int determinerIndexGagnant(int[] scores){

    }
    public static String donnerNomCarte(int carte) {
        if (carte >= 2 && carte <= 10) {
            return String.valueOf(carte);
        } else {
            switch (carte) {
                case 11:
                    return "valet";
                case 12:
                    return "dame";
                case 13:
                    return "roi";
                case 14:
                    return "as";
                default:
                    return "indéterminé";
            }
        }
    }
}
