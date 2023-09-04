import java.util.Scanner;
public class N_P_0 {
    public static void main(String[] arg)
    {
        System.out.println("enter any number = ");
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        if(n>0)
        {
            System.out.println(n+ " is a positive number");
        }
        else if(n<0)
        {
            System.out.println(n+ " is a negative number");
        }
        else
        {
            System.out.println(n+ " is a zero value");
        }
    }
}
