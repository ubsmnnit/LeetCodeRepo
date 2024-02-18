class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] suffle_arr = new int[2 * n];

        int j = 0;

        for (int i = 0; i < n; i ++){


            suffle_arr[j] = nums[i];
            suffle_arr[j+1] = nums[n+i];
            j = j+ 2;

        }

     return  suffle_arr; 
        
    }
}