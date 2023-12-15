


// star pattern

public class pattern {
    public static void main(String arg[]){
        for(int line =1; line<=4;line++)
        {
           for(int j=1;j<=line;j++)
           {
            System.out.print("*");
           }
           System.out.println();
        }
    }
}


// inverted star pattern
/* 
import java.util.Scanner;

public class pattern {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

*/

//half pyramid pattern

// public class pattern{
//     public static void main(String arg[])
//     {
//         int n=5;
//         for (int i=1;i<=n;i++){
//             for (int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


//Character pattern

// public class pattern{
//     public static void main(String arg[]){
//         int n=5;
//         char ch='A';
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print(ch);
//                 ch++;

//             }
//             System.out.println();
//         }

//     }
// }