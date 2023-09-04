import java.util.Scanner;
public class month_number {
    public static void main (String[] arg)
    {
        System.out.println("enter any number = ");
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();

        switch (n)

        {
            case 1 :
                System.out.println("january = 30 ");
                break;
            case 2 :
                System.out.println("february = 29 ");
                break;
            case 3 :
                System.out.println("march = 31 ");
                break;
            case 4 :
                System.out.println("april = 30 ");
                break;
            case 5 :
                System.out.println("may = 31 ");
                break;
            case 6 :
                System.out.println("june = 30 ");
                break;
            case 7 :
                System.out.println("july = 31 ");
                break;
            case 8 :
                System.out.println("august = 31 ");
                break;
            case 9 :
                System.out.println("september = 30 ");
                break;
            case 10 :
                System.out.println("october = 31 ");
                break;
            case 11 :
                System.out.println("november = 30 ");
                break;
            case 12 :
                System.out.println("december = 31 ");
                break;
            default :
                System.out.println( n+ " is invalid number ");
                break;

        }
    }
}
