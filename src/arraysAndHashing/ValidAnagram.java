package arraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        // the first simple approach is to just sort the
        // strings if the strings are equal then it is a
        // anagram otherwise not
        char[] ts = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ts);
        Arrays.sort(tt);
//        System.out.println(ts+ "     " + tt);
        String s1 = new String(ts);
        String t1 = new String(tt);
        return s1.equals(t1);
    }

    public static boolean isAnagram1(String s, String t) {
        /*  in this Solution we store the frequency count of each char of one string
         * then we iterate over the other string if find that the current element
         * exitst in the map we decrement its frequency and if the frequency is 0
         * we remove it from the map this ensures that is all the char of one type
         * are encountered in string t we should not encounter the same char again.
         * so if we dont find the char in the map it means that it is extra in second
         * string.
         */
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> umap = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(umap.containsKey(s.charAt(i))){
                umap.put(s.charAt(i), umap.get(s.charAt(i)) + 1);
            }else {
                umap.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i<t.length(); i++){
            if(umap.containsKey(t.charAt(i))){
                if(umap.get(t.charAt(i))-1 != 0){
                    umap.put(t.charAt(i), umap.get(t.charAt(i)) - 1);
                }
                else{
                    umap.remove(t.charAt(i));
                }
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        Boolean ans = isAnagram1(s, t);
        System.out.println(ans);
    }
}
