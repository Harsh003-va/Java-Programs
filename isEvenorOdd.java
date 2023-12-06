import java.util.*;


public class isEvenorOdd {
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num = sc.nextInt();
        if(isEven(num))
        {
        System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }
}
