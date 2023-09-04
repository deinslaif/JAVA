import java.util.Scanner;
public class alphanumsymbol {
    public static void main(String[] args)
    {
        System.out.println("enter any character = ");
        Scanner r = new Scanner(System.in);
        char ch = r.next().charAt(0);
        System.out.println(ch>='a' && ch<='z'?"small alphabet"
                            :ch>='A' && ch<='Z'?"big alphabet"
                                                :ch>='0' && ch<='9'?"digit"
                                                                    :"symbol");
    }
}
