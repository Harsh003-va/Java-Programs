/*public class reversenum {
    public static void main(String arg[])
    {
        int n=30801;
        

        while (n>0){
            int lastdigit= n%10;
            System.out.print(lastdigit + " ");
            n= n/10;

        }
    System.out.println();
    }
}
*/


//Reverse given number

public class reversenum {
    public static void main(String arg[])
    {
       int rev=0;
       int n=10899;
       while (n>0){
        int lastdigit= n%10;
       
        rev =(rev*10) +lastdigit;
         n/=10;

       }
 System.out.println(rev);
        }
   
    }
