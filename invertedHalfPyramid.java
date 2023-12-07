public class invertedHalfPyramid {

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
 
    public static void inverted_halfPyramidNumber(int n){
     for (int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j+ 
            " ");
        }
        System.out.println();
     }
    }


    public static void main(String arg[])
    {
inverted_halfPyramid(5);
inverted_halfPyramidNumber(5);
    }
}
