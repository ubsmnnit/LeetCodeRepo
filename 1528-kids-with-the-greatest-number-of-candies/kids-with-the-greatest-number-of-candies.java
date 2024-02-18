class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {


         List<Boolean> result = new ArrayList<>();

        int MaxCandies = findMax(candies);

        for (int i = 0; i< candies.length ; i++){

            if (candies[i] + extraCandies >= MaxCandies) result.add(true);
            else  result.add(false);

        }

        return result;
        
    }

public static int findMax(int[] arr){

    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++ ){
        
        if(arr[i] > max) max = arr[i];
    }
    return max;

}
    
}