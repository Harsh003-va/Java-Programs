public class Trappingrainwater{

    public static int TrappingRain(int height[]){
        int n=height.length;
        //Calculate left max boundary -array
        int leftMax[]=new int [n];
        leftMax[0]= height[0];
        for(int i=1; i<n;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);

        }
        //Calculate right max boundary -array
        int rightMax[]=new int[n];
            rightMax[n-1]=height[n-1];
     for(int i=n-2;i>=0;i--){
        rightMax[i] = Math.max(height[i], leftMax[i+1]);


     }
     int trapedWater =0;
        //loop
        for(int i=0;i<n; i++){
            //WaterLevel = min(leftmax bound, rightmax bound
           int waterLevel = Math.min(leftMax[i], rightMax[i]);

          //trapped water = waterLevel - height[i])
           trapedWater+=waterLevel - height[i];

        }
        return trapedWater;
        
        



    }
    public static void main(String arg[]){
        int height[]={4,2,0,6,3,2,5};
       System.out.println(TrappingRain(height));
     
    }
}