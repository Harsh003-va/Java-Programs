public class ContainsDuplicate {
    public static boolean duplicate(int number[]){
     for(int i=0;i<number.length-1;i++){
        for(int j=i+1;j<number.length;j++){
            if(number[i]==number[j]){
                return true;
            }
        }
     }
     return false;
    }

    public static void main(String arg[]){
        int number[]={1,2,3,5};
     System.out.println(duplicate(number));
    }    
}
