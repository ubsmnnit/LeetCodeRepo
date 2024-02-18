
import java.util.ArrayList;
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        int n = nums.length; 
        int[] result = new int[n];

        for(int i = 0; i < n; i++){

            shiftinsert(nums[i], index[i], result);
        }


        return result;
    }

    public static void shiftinsert(int value, int ind, int[] arr){

        for (int i = arr.length -1; i > ind ; i--){
            
             arr[i] = arr[i-1];
            

        }
        arr[ind] = value;

        return ;

    }

    
}