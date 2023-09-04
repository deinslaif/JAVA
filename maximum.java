import java.util.Scanner;
public class maximum {
    public static void main (String[] args)
    {
        Scanner r = new Scanner(System.in);
        System.out.println("enter number 1 = ");
        int a = r.nextInt();
        System.out.println("enter number 2 = ");
        int b = r.nextInt();
        System.out.println("enter number 3 = ");
        int c = r.nextInt();

        if (a>b)
        {
           if (a>c)
               System.out.println(a);
           else
               System.out.println(c);
        }
            else
            {
                if(b>c)
                    System.out.println(b);
                else
                    System.out.println(c);
                System.out.println("the maximum number is = ");
        }
}
}