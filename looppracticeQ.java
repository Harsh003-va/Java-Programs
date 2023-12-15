/*import java.util.*;

public class looppracticeQ {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("Enter the number ");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.print("Do you want to comtinue ? Press 1 for yes or 0 for no : ");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum of even number " + evenSum);
        System.out.println("Sum of odd number  " + oddSum);

    }

} */

// Factorial of a number


import java.util.*;
public class looppracticeQ{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num;// To hold number
        int fact=1;// To hold factorial
        System.out.print("Enter any positive integer:");
        num=sc.nextInt();
        for(int i=1;i<=num;i++) 
         {
            fact*=i;
        }
        System.out.println("Factorial: "+fact);
    }
}


// import java.util.*;
// public class looppracticeQ{


//     public static void printMultiplicationTable(int number)
//     {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter number:");
//         int n = sc.nextInt();
//         for(int i=1;i<=10;i++)
//         {
//             System.out.println(n + "*" + i + "=" + n*i);
//         }
//     }
//     public static void main(String arg[]){
//         printMultiplicationTable(5);
//     }
// }

