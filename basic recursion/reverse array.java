
public class Solution {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.

        reverse(0, n, nums);

        return nums;

    }


    public static void reverse(int i, int n, int [] nums){

        if (i == n/2) return;

        int temp = nums[i];

        nums[i] = nums[n-1-i];
        nums[n-1-i] = temp;

        reverse(i + 1, n, nums);

        return;
        
        

    }

    
}
