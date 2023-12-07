public class FloydTriangle {
    public static void floydTriangle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++)
            {
                System.out.print(counter+ " ");
                counter++;
            }
            System.err.println();
        }
    }

    //0-1 Triangle pattern
    public static void Zero_One_Triangle(int n){
        for(int i=1;i<=n;i++){
            //inner loop

            for(int j=1;j<=i;j++){
if ((i+j)%2==0){//even
    System.err.print("1");

}else{
    System.out.print("0");
}
            }
            System.err.println();
        }


    }
    public static void main(String arg[]){
      floydTriangle(5);
      Zero_One_Triangle(5);
    }
}
