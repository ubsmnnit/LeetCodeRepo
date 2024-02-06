public class Solution {
    public static int[] printNos(int x) {
        // Write Your Code Here
       
       int[] num_arr = new int[x];
       pre_num(x,num_arr);
       return num_arr;



    }

    public static int pre_num(int num, int[] arr){

        if (num == 1) {
            arr[0] = 1;
        return 1; 
        }
        arr[num-1] = num;
        pre_num(num-1,arr);

        return 1;
        
    }

    
}
