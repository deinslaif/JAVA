import java.util.Scanner;
public class print_alphabet {
    public static void main (String [] arg)
    {
        char c ;
        for (c='A'; c<='Z'; c++)
        {
            System.out.print(c+ " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------------");
        for (c='a'; c<='z'; c++)
        {
            System.out.print(c+ " ");
        }
    }
}
