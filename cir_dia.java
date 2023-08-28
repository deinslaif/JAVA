import java.util.Scanner;
public class cir_dia
    {
        public static void main(String[] arg)
        {
            Scanner dia = new Scanner(System.in);
            System.out.println("enter radius of the circle = ");
            int r = dia.nextInt();
            int a = 2*r;
            System.out.println("the diameter of "+r+" is = " +a);
        }
    }
