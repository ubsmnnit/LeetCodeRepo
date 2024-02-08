
import java.util.List;
import java.util.ArrayList;
public class Solution {
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here

        List<Long> fact_num = new ArrayList<>();

        for( long i =1 ; fact(i) <= n; i++){

            fact_num.add(fact(i));

        }

    return fact_num;

    }

public static long fact(long num){

    if (num == 1) return 1; 

    return num * fact(num -1);
}

}
