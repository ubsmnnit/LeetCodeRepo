class Solution {
    public int numIdenticalPairs(int[] nums) {

        Map<Integer,Integer> frequency = new HashMap<>(); 

        int n = nums.length;

        for(int i = 0; i < n; i++){
            if (frequency.containsKey(nums[i])) frequency.put(nums[i],frequency.get(nums[i])+1);
            else frequency.put(nums[i],1);
        }

        int pair = 0;

        for(Map.Entry<Integer,Integer> element : frequency.entrySet()){



            int temp = element.getValue();

            int ind_pair = temp * (temp - 1) / 2 ;

            pair += ind_pair;
        }

       

    return pair;
        
    }
}
