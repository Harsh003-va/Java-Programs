import java.util.*;

public class printsumNum {
    public static void main(String arg[])
{
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int i=1;
    int sum=0;
    
    while(i <= n)
    {
        sum +=i;
        i++;
    }
    System.out.println("sum is : " +sum);
}
}
