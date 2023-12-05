public class binomialCoef {
public static int fact(int n){
    int f=1;
    for (int i=1;i<=n;i++){
        f*=i;
    }
    return f;
}
    public static int binCoeff(int n,int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);
        int binCoeff = fact_n/(fact_r * fact_nmr);
        return binCoeff;
    }
  // fun to calculate sum of 2 number
    public static int sum(int a,int b){
       return a+b;
    }

    public static float sum(float a,float b){
       return a+b;
    }

    // fun to calculate sum of 3 number
     public static int sum(int a,int b,int c){
       return a+b+c;
    }

    public static void main(String arg[])
    {
       System.out.println(binCoeff(6, 2));
       System.out.println(sum(3,5));
       System.out.println(sum(5, 7, 5));
       System.out.println(sum(3.5f,1.5f));
    }
}
