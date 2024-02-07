public class Solution
{
    public static int[] printNos(int x) {
        // Write Your Code Here

        int[] arr = new int[x];


        next_num(x,x,arr);


        return arr;

    
}
    public static void next_num(int max, int n, int[] arr_){


    if (n == 0) return ;


    arr_[max-n] = n;

    next_num(max,n-1,arr_);



    }

}

