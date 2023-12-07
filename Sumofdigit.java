import java.util.*;

public class Sumofdigit {

    public static int sumDigit(int n){
int sumOfdigit=0;
while(n>0){
    int lastDigits = n % 10;
    sumOfdigit = sumOfdigit + lastDigits;
    n/=10;
   
}
 return sumOfdigit;
    }
    public static void main (String arg[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the digit : ");
    int digits = sc.nextInt();
    System.out.println("The sum is "+ sumDigit(digits));
    }
    
}
