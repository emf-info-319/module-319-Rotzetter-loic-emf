package exercices.exercice06;

public class ExerciceSwitch3 {
        public static void main(String[] args) {
            int age = 22;
                switch (age) {
                    case 7:
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
        }
}
