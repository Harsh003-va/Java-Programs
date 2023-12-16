import java.util.*;

public class printSubarray {
 
    public static void subarray(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                   System.out.print(numbers[k]+" ");
                }
                  System.out.println();
            }
            System.out.println();
        }
    }


    //print maxSum of Subarray using Prefix method
    public static void Prefix(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];

        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1] + numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum= start==0 ? prefix[end] :prefix[end]- prefix[start-1];
                System.out.println("Currsum = "+ currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            
            }

        }
        System.out.println("max sum = "+maxSum);
    }

    public static void main(String arg[]){
        int numbers[]={2,4,6,8,10};
    //    subarray(numbers);
    // MaxsubarraySum(numbers);
    Prefix(numbers);
    }

 // Print max sum of Subarray using brute force
    
     public static void MaxsubarraySum(int numbers[])
     {
         int currSum=0;
        int maxSum=Integer.MIN_VALUE;
      
       for(int i=0;i<numbers.length;i++){
        int start = i;
        for(int j=i;j<numbers.length;j++){
            int end=j;
           currSum=0;
           for(int k=start;k<=end;k++){
           currSum+=numbers[k];
             
           }
           System.out.println(currSum);
           if(maxSum<currSum){
            maxSum=currSum;
           }
          
       }
        
      } 
    System.out.println("max sum = "+maxSum);
    }
    }