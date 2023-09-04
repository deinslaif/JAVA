import java.util.Scanner;
public class temperature {
    public static void main (String[] arg )
    {
        System.out.println("enter the celcius = ");
        Scanner cel = new Scanner(System.in);
        int a = cel.nextInt();
        double F = ((double) (9/5)*(a+32));
        System.out.println("the farenhite is = " +a);
    }
}
