public class revisions {
    public static void main(String[] args) {
        direBonjour();
        dire(null);
        math();
    }
    public static void direBonjour (){
        System.out.println("bonjours");
    }
    public static void dire(String args){
    }
    public static void math(){
        int min = Math.min(7, 8);
        System.out.println(min);
        int max = Math.max(7, 10);
        System.out.println(max);
        double pow = Math.pow(71, 81);
        System.out.println(pow);
        double sqrt = Math.sqrt(80);
        System.out.println(sqrt);
        int abs = Math.abs(80);
        System.out.println(abs);
    }
}
