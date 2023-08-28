import java.util.Scanner;
public class arithmetic {
    public static void  main (String[] arg)
    {
        Scanner arith = new Scanner(System.in);
        System.out.println("enter two numbers=");
        int a = arith.nextInt();
        int b = arith.nextInt();


        int sum = (a+b);
        int sub = (a-b);
        int mul = (a*b);
        int div = (a/b);
        int mod = (a%b);


        System.out.println("the sum is = " +sum);
        System.out.println("the subs is = " +sub);
        System.out.println("the multiplication is = " +mul);
        System.out.println("the division is = " +div);
        System.out.println("the module is = " +mod);

    }

}
