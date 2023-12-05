/*import java.util.Scanner;

public class multipleof10 {
  public static void main(String arg[])
  {
    Scanner sc = new Scanner (System.in);
    do{
        System.out.print("Enter num : ");
        int n =sc.nextInt();
        if(n % 10 ==0){
           break;
        }
        System.out.println(n);

    }while(true);
  }  
}
*/
//when you enter multiple of 10 loop will break


import java.util.Scanner;

public class multipleof10 {
  public static void main(String arg[])
  {
    Scanner sc = new Scanner (System.in);
    do{
        System.out.print("Enter num : ");
        int n =sc.nextInt();
        if(n % 10 ==0){
            continue;
        }
        System.out.println(n);

    }while(true);
  }  
}








