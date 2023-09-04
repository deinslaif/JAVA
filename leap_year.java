import java.util.Scanner;
public class leap_year {
    public static void main (String[] arg) {
        Scanner r = new Scanner(System.in);
        System.out.println("enter a year = ");
        long y = r.nextLong();
        if (y != 0) {
            if (y % 400 == 0) {
                System.out.println(y + "year is a leap year.");
            } else if (y % 100 == 0) {
                System.out.println(y + "year is not a leap year.");
            } else if (y % 4 == 0) {
                System.out.println(y + "year is a leap year.");
            } else {
                System.out.println(y + "year is not a laep year.");
            }

        } else {
            System.out.println("year zero doesn't exist");
        }
    }

    }