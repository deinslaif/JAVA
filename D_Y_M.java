import java.util.Scanner;
public class D_Y_M {
    public static void main (String [] args)
    {
        System.out.println("enter days = ");
        Scanner d = new Scanner(System.in);
        int a = d.nextInt();
        int year = a/365;
        int week = (a-(year*365)) / 7;
        int month = (a%365)/30;
        System.out.println("the year is = " +year);
        System.out.println("the week is  = " +week);
        System.out.println("the month is = " +month);
    }
}
