
//practice question 1

/*import java.util.*;



public class practice1 {
    public static void main(String arg[])
    {
Scanner sc = new Scanner(System.in);

System.out.println("Enter a number: ");
int number =sc.nextInt();
if(number > 0)
{
    System.out.println("number is positive");
}else {
    System.out.println("number is negative");
}


    }
}


//  practice question 2

import java.util.*;
public class practice1 {
    public static void main(String arg[])
    {
Scanner sc = new Scanner(System.in);

System.out.println("Enter a temp: ");
double temp =sc.nextDouble();
if(temp >= 100)
{
    System.out.println("You have a Fever");
}else {
    System.out.println("You dont have a fever");
}
    }
}



//Practice question 3

import java.util.*;

public class practice1 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter a week number : ");
        int week = sc.nextInt();

        switch (week) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

                default :System.out.println("Enter a wrong number");
        }

    }
}
*/

// Practice question 4

/* answer 
  x=false & y = 63
 */

//practice Question 5
import java.util.*;
public class practice1{

    /**
     * @param arg
     */
    public static void main(String arg[])
    {
     Scanner sc = new Scanner (System.in);

     System.out.println("Enter a year : ");
     int year= sc.nextInt();
     
     boolean x = (year%4)==0;
     boolean y = (year % 100) !=0;
     boolean z = ((year%100==0)  && (year % 400 ==0));

     if(x && (y || z))
     {
        System.out.println(year + "is a leap year");

     }else{
        System.out.println(year + "is not a leap year");
     }

    }

}