import java.util.Scanner;
public class even_odd {
    public static void main (String[] arg)
    {
        Scanner r = new Scanner(System.in);
        System.out.println("enter any number = ");
        int num = r.nextInt();
        if(num%2==0)
        {
            System.out.println(num+ " = is even");

        }
        else
            System.out.println(num+ " = is odd");
    }

}
