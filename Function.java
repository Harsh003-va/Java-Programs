import java.util.*;

public class Function {
    public static void printHelloWorld(){
        System.out.println("Factorial Number");

    }
    public static int factorial(int number){
        Scanner sc = new Scanner(System.in);
        int num;// To hold number
        int fact=1;// To hold factorial
        System.out.print("Enter any positive integer:");
        num=sc.nextInt();
        for(int i=1;i<=num;i++) 
         {
            fact*=i;
        }
        System.out.println("Factorial: "+fact);
        return 3;
    }
    public static void main(String arg[])
    {
        printHelloWorld();
      factorial(0);
    }
}
