import java.util.*;

public class functPrime {
    public static boolean isPrime(int n){
        boolean isPrime=true;
      for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i ==0){
            isPrime=false;
            break;
        }
      }
      return isPrime;
    }

    public static void primeisRange(int n){
        for(int i=2;i<=n;i++)
        {
            if (isPrime(i)){
                System.out.print(i +" ");
            }
        }
        System.out.println();

    }
    public static void main(String arg[])
    {
System.out.println(isPrime(6));
primeisRange(100);
    }
}
