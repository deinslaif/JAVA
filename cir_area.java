import java.util.Scanner;
public class cir_area {
    public static void main (String[] arg)
    {
        Scanner area = new Scanner(System.in);
        System.out.println("enter the radius = ");
        double pai = 3.1416d;
        float r = area.nextFloat();
        double a = pai*r*r;
        System.out.println("the area of "+r+" is = " +a);
    }

}
