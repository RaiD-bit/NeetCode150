package arraysAndHashing;

public class Controller {
    public static void main(String[] args) {
        ContainsDuplicate obj = new ContainsDuplicate();
        int[] nums = {1,2,3,1};
        Boolean ans = obj.containsDuplicate(nums);
        System.out.println(ans);
    }
}
