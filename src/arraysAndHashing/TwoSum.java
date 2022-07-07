package arraysAndHashing;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int [] ans;
        HashMap<Integer, Integer> umap = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(umap.containsKey(nums[i])){
                ans = new int[2];
                ans[0] = umap.get(nums[i]);
                ans[1] = i;
                return ans;
            }else{
                umap.put(target - nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int [] v = {2, 7, 11, 15};
        int [] ans = twoSum(v, 9);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
