
import java.util.*;
public class PrintNum1n {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int counter =1;
        while(counter <=n)
        {
            System.out.println(counter + " ");
            counter++;
        }
        System.out.println();
    }
}
