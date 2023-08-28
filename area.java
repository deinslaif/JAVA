import java.util.Scanner;
public class area
{
    public static void main (String[] args)
    {
        Scanner area = new Scanner(System.in);
        System.out.println("enter four length of a rectangle = ");
        float a = area.nextFloat();
        float b = area.nextFloat();
        float c = area.nextFloat();
        float d = area.nextFloat();
        float r = (a+b+c+d);
        System.out.println("the area of "+a+" and "+b+" and "+c+" and "+d+" is = " +r);

    }

}