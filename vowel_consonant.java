import java.util.Scanner;
public class vowel_consonant {
    public static void main(String[] args)
    {
        System.out.println("enter any alphabet = ");
        Scanner r = new Scanner(System.in);
        char ch = r.next().charAt(0);
        if ( ch='a' || ch='e' || ch='i' || ch='o' || ch='u') {
            System.out.println("vowel");
        } else
        {
            System.out.println("consonant");
        }
    }
}
