import java.util.Scanner;
public class weekend {
    public static void main (String[] arg)
    {
        System.out.println("enter any number = ");
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        switch(n)
        {
            case 0 : System.out.println("Friday");
            break;
            case 1 : System.out.println("Saturday");
                break;

            case 2 : System.out.println("Sunday");
                break;

            case 3 : System.out.println("Monday");
                break;

            case 4 : System.out.println("Tuesday");
                break;

            case 5 : System.out.println("wednesday");
                break;
            case 6 : System.out.println("Thursday");
                break;
            default: System.out.println("invalid number");
                break;
        }
    }
}
