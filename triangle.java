import java.util.Scanner;
public class triangle {
    public static void main (String[] args)
    {
        Scanner r = new Scanner(System.in);
        System.out.println("enter the value of angle 1 = ");
        int a1 = r.nextInt();
        System.out.println("enter the value of angle 2 = ");
        int a2 = r.nextInt();
        System.out.println("enter the value of angle 3 = ");
        int a3 = r.nextInt();
        int sum = a1+a2+a3;

        if(sum==180 && a1>0 && a2>0 && a3>0)
        {
            System.out.println("the triangle is valid");
        }
        else
        {
            System.out.println("triangle is invalid");
        }


    }
}
