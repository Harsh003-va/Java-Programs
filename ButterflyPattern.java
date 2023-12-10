public class ButterflyPattern {

public static void butterflyPattern(int n){
    for (int i=1;i<=n; i++){

        //Stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //Sapces 
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //Stars
      for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
}
//2nd half 
for(int i=n;i>=1;i--){
     for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //Sapces 
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //Stars
      for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void solidRhombus(int n){
    for (int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){

            System.out.print(" ");
        }
        //Stars

        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}


//Hollow Rhombus
public static void hollowRhombus(int n){
    for(int i=1;i<=n;i++){
        //spaces
        for (int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        //hollow rectangle
         for (int j=1;j<=n;j++){
            if (i==1||i==n || j==1 || j==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
           
         }
          System.out.println();
    }
}

public static void diamond(int n)
{
   for (int i=1; i<=n;i++)
{
    //spaces

    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    //stars
    for(int j=1;j<=(2*i-1) ;j++){
        System.out.print("*");

    }
    System.out.println();
}
//2nd half
for(int i=n;i>=1;i--){
     //spaces

    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    //stars
    for(int j=1;j<=(2*i-1) ;j++){
        System.out.print("*");

    }
    System.out.println();
}

}

    public static void main(String arg[])
    {
System.out.println("Pattern for Butterfly !");
butterflyPattern(4);

System.out.println();
System.out.println("Pattern for Rhombus !");
solidRhombus(4);

System.out.println();
System.out.println("Pattern for hollow Rhombus !");
hollowRhombus(4);
System.out.println("Pattern for Diamond !");
System.out.println();
diamond(4);
    }
}
