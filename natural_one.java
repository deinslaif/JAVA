import java.util.Scanner;
public class natural_one {
    public static void main (String [] arg)
    {
        Scanner r = new Scanner(System.in);
        System.out.println("enter any number = ");
        int i = 1;
        int n = r.nextInt();
        while (n>=i)
        {
            System.out.println(n);
            n--;
        }

    }
}