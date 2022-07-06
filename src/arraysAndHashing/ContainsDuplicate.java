package arraysAndHashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(s.contains(nums[i])){
                return true;
            }
            else {
                s.add(nums[i]);
            }
        }
        return false;
    }
}
