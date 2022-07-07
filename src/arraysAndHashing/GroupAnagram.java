package arraysAndHashing;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> umap = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String temp1 = new String(temp);
            if(umap.containsKey(temp1)) {
                umap.get(temp1).add(strs[i]);
            }else{
//                List<String> z = new ArrayList<>();
                umap.put(temp1, new ArrayList<>());
                umap.get(temp1).add(strs[i]);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for (Map.Entry item: umap.entrySet()){
            ans.add((List<String>) item.getValue());
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] s = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupAnagrams(s);
        System.out.println(ans.toString());
    }
}
