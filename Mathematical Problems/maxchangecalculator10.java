package mathamaticalproblem;
import java.util.Arrays;

public class Maxchangecalculator10 {
    public static int calcMaxPossibleChange(int[] values) 
    { 
        Arrays.sort(values); 
        int n = values.length; 
        int[] dp = new int[values[n - 1] + 1]; 
        dp[0] = 0; 
        for (int i = 1; i <= values[n - 1]; i++) 
        { 
            dp[i] = Integer.MAX_VALUE; 
            for (int j = 0; j < n; j++) 
            { 
                if (values[j] <= i) 
                { 
                    int sub_res = dp[i - values[j]]; 
                    if (sub_res != Integer.MAX_VALUE && sub_res + 1 < dp[i]) 
                        dp[i] = sub_res + 1; 
                } 
            } 
        } 
        return dp[values[n - 1]]; 
    } 
    public static void main(String[] args) 
    { 
        int[] values = { 1, 5, 10, 20, 50 }; 
        System.out.println(calcMaxPossibleChange(values)); 
    } 
}