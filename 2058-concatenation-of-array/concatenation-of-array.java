class Solution {
    public int[] getConcatenation(int[] nums) {

        
        
        int[] arr = new int[2 * nums.length];

        System.arraycopy(nums, 0, arr, 0, nums.length);
        System.arraycopy(nums, 0, arr, nums.length, nums.length);

        return arr;
        
    }
}


class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        
        int[] arr = new int[2 * n];

        for(int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[n+i] = nums[i];

        }

        return arr;
        
    }
}
