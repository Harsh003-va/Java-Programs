
import java.util.*;

public class functq1 {

    public static void calculateSum(int num1, int num2) {

        int sum = num1 + num2;
        System.out.println("Sum is : " + sum);

    }

    public static void main(String arg[]) {
        System.out.print("Enter num a : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter num b : ");
        int b = sc.nextInt();
        calculateSum(a, b);
    }

}
