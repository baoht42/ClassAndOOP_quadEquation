import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        double a = sc.nextDouble();
        System.out.println("Enter B:");
        double b = sc.nextDouble();
        System.out.println("Enter C:");
        double c = sc.nextDouble();
        QuadEquation quad1 = new QuadEquation(a,b,c);
        if (quad1.getDiscriminant()>0){
            System.out.println("The equation has two root: \n" +
                    "Root 1: \n"+ quad1.getRoot1()+ "\n"+
                    "Root 2: \n"+ quad1.getRoot2());

            quad1.getRoot1();
            quad1.getRoot2();
        }else if (quad1.getDiscriminant()==0){
            System.out.println("Roo1 = Root2 = "+quad1.getRoot1());
        }else {
            System.out.println("Has no root");
        }
    }
}