class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int account_num = accounts[0].length;

        int[] wealth = new int[accounts.length]; 

        for (int i = 0; i < accounts.length; i++){

            wealth[i] = 0;

            for(int j = 0; j < account_num; j++){

                wealth[i] += accounts[i][j];
            }

        }

       // System.out.println(Arrays.toString(wealth));

       int richwealth = findMax(wealth);

        return richwealth;

    }

    public static int findMax(int[] array){

        int temp = Integer.MIN_VALUE;

        for( int i =0 ; i < array.length; i++) {

            if(array[i] > temp) temp = array[i] ;

        }

        return temp;
    }


}