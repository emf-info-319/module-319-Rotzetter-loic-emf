public class methodes {
    public static void main(String[] args) {
        direBonjour();
        dire(args);
        math();
    }
    public static void direBonjour() {
        System.out.println("Bonjour");
    }
    public static void  dire(String[] args) {
        
    }
    public static void math() {
        int min = Math.min(8, 1);
        System.out.println(min);
        int max = Math.max(7, 8);
        System.out.println(max);
        double pow = Math.pow(71.3, 125.5);
        System.out.println(pow);
        double sqrt = Math.sqrt(15.3);
        System.out.println(sqrt);
        int abs = Math.abs(5);
        System.out.println(abs);
    }
}
