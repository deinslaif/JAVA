import java.util.Scanner;
public class divisible {
    public static void main(String[]args)
    {
        System.out.println("enter any number = ");
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        if(n%5==0)
        {
            System.out.println("the number is divisible by 5 ");
        }
        else
        {
            System.out.println("the number is not divisible by 5");
        }
    }
}
