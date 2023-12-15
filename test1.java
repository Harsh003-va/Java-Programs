// import java.io.*;

// import java.util.*;

// public class test1{

// 	static int fun(int n){
//        // write code here
//         for(int i=1;i<=n;i++){
//             n++;   
//         }
//         return n;
//     }
	
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n;
//         n = sc.nextInt();
//         int result = fun(n);
//         System.out.print((int)result);
//     }
// }
import java.util.*;

public class test1{

	static int FrequencyofDigits(long n, int d) {
        // write code here
        String numberString= Long.toString(n);
        int frequency =0;
        for(char digitChar : numberString.toCharArray()){
            int digit = Character.getNumericValue(digitChar);

            if(digit==d){
                frequency++;
            }
        }
        return frequency;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int d = sc.nextInt();
        System.out.println(FrequencyofDigits(n, d));
    }
}