import java.util.Arrays;
import java.util.HashMap;

/**
 * 思路1：将字符串排序，然后对比是否相等
 * 思路2：利用哈希表，HashMap，统计每个字母出现的次数
 * @author 地铁林黛玉
 */
public class LearnAna {
    String s = "anagram";
    String t = "nagaram";

    public boolean isAnagram1(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            return true;
        }else{
            return false;
        }

    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        LearnAna learnAna = new LearnAna();
        //方法一
        //System.out.println(learnAna.isAnagram1(learnAna.s,learnAna.t));
        //方法二
        System.out.println(learnAna.isAnagram2(learnAna.s,learnAna.t));

    }
}
