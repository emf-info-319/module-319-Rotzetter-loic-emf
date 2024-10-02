public class ExerciceTableaux42 {
    public static void main(String[] args) {
        int tabbleau42[] = new int[5];


        tabbleau42[0] = ( int ) ( Math.random() * ( 100 - 1 + 1 ) ) + 1;
        tabbleau42[1] = tabbleau42[0]+1;
        tabbleau42[2] = tabbleau42[1]+1;
        tabbleau42[3] = tabbleau42[2]+1;
        tabbleau42[4] = tabbleau42[3]+1;
        
        System.out.println(tabbleau42[0]+" "+tabbleau42[1]+" "+tabbleau42[2]+" "+tabbleau42[3]+" "+tabbleau42[4]);
    }
}
