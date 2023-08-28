import java.util.Scanner;
public class perimeter
{
    public static void main (String[] args)
    {
        Scanner peri = new Scanner(System.in);
        System.out.println("enter length and breadth = ");
        float a = peri.nextFloat();
        float b = peri.nextFloat();
        float p = 2*(a+b);
        System.out.println("the length of "+a+" and breadth of "+b+" is" +p);

    }

}
