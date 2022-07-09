package arraysAndHashing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        left.add(1);
        right.add(1);
        for (int i = 0; i < n; i++) {
            left.add(nums[i]*left.get(left.size()-1));
            right.add(nums[n-i-1]*right.get(right.size()-1));
        }
        left.add(1);
        right.add(1);
        Collections.reverse(right);
        int [] ans = new int[n];
        for(int i = 0; i<n; i++){
            ans[i] = left.get(i) * right.get(i+2);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] v = {1,2,3,4};
        int[] ans = productExceptSelf(v);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
