import java.util.Scanner;
public class power {
    public static void main (String [] args)
    {
        int result=1;
        System.out.println("enter any number = ");
        Scanner p = new Scanner(System.in);
        int a = p.nextInt();
        System.out.println("enter power = ");
        int b = p.nextInt();
        for (int i=1; i<=b; i++ )
        {
            result= a*result;

        }
        System.out.println("power = " +result);
        }
}

