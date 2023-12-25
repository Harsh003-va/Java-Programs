import java.util.*;

public class Arrayquestion {

    public static int search(int number[],int target){
        int min=minSearch(number);
        if(number[min]<=target && target <=number[number.length-1]){
            return search(number,min,number.length-1,target);
        }
        else{
            {
                return search(number,0,min,target);
            }
        }
    }

    // binary search to find target in left to right boundary
    public static int search(int number[], int left, int right, int target) {
        int l = left;
        int r = right;

        while (l <= r) {
            int mid = 1 + (r - 1) / 2;
            if (number[mid] == target) {
                return mid;
            } else if (number[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;

    }

    // smallest elment index
  
    public static int minSearch(int number[]) {
        int left = 0;
        int right = number.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid > 0 && number[mid - 1] > number[mid]) {
                return mid;
            }

            else if (number[left] <= number[mid] && number[mid] > number[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    

    }

    public static void main(String arg[]) {
        int number[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int target = 0;
        System.out.println(search(number, target, target, target));
        
    }

}
