import java.util.Scanner;
public class cir_circum {
    public static void main (String[] arg)
    {
        Scanner circumference = new Scanner(System.in);
        System.out.println("enter the radius = ");
        double pai = 3.1416d;
        float r = circumference.nextFloat();
        double c = 2*pai*r;
        System.out.println("the circumference of "+r+" is = " +c);
    }

}
