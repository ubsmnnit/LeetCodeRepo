
import java.util.ArrayList;
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        int n = nums.length;
        
        List<Integer> targetlist = new ArrayList <> ();
        int[] result = new int[n];

        for(int i = 0; i < n; i++){

            targetlist.add(index[i],nums[i]);
        }

        for(int i =0; i < n; i++) result[i] = targetlist.get(i);

        return result;
    }
    
}
