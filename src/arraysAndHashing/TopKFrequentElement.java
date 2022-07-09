package arraysAndHashing;

import java.util.HashMap;
import java.util.PriorityQueue;

class Pair{
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class TopKFrequentElement {
    public static int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if(a.first > b.first){
                return -1;
            }else if(a.first < b.first){
                return 1;
            } else{
                return 0;
            }
        });
        HashMap<Integer, Integer> umap = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(umap.containsKey(nums[i])){
                umap.put(nums[i],umap.get(nums[i])+1);
            }else{
                umap.put(nums[i],1);
            }
        }
        umap.forEach((key, val) -> {
            pq.add(new Pair(val, key));
        });
        int[] ans = new int[k];
        int i = 0;
        while (k>0){
            ans[i++] =  pq.poll().second;
            k--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] ans = topKFrequent(nums, k);
        System.out.println(ans.toString());
    }
}
