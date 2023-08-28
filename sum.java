import java.util.Scanner;
public class sum {
    public static void main (String[] arg)
    {
        Scanner add= new Scanner(System.in);
        System.out.println("Enter two numbers= ");
        int a = add.nextInt();
        int b = add.nextInt();
        int s = a+b;
        System.out.println("sum of "+a+" and "+b+" is " +s);
    }
}
