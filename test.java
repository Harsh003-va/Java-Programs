import java.util.*;

public class test {
//hollow rectangle
    public static void hollow_rectangle(int totRows, int totCols){
     
        //outer loop
for(int i=1;i<=totRows;i++)
{
    //inner loop

    for(int j=1;j<=totCols;j++){
        //cell - (i,j)
        if(i==1||i==totRows||j==1 || j==totCols){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }
    System.out.println();
}

    }
//inverted half pyramid
    public static void inverted_halfPyramid(int n)
    {
  
  for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++){
        // spaces print
     System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
  }
    }
    public static void main(String arg[])
    {
       
     
hollow_rectangle(4, 5);
        inverted_halfPyramid(10);
       
    }
}
