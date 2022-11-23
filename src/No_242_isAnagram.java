import java.util.HashMap;
import java.util.Map;

public class No_242_isAnagram {
    public boolean No_242_isAnagram(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        if (slen != tlen) {
            return false;
        }
        Map<Character, Integer> dict1 = new HashMap<>();
        Map<Character, Integer> dict2 = new HashMap<>();
        for (int i = 0; i < slen; i++) {
            char st = s.charAt(i);
            char tt = t.charAt(i);
            dict1.put(st, dict1.containsKey(st) ? dict1.get(st).intValue() + 1: 1);
            dict2.put(tt, dict2.containsKey(tt) ? dict2.get(tt).intValue() + 1: 1);
        }

        for (char key : dict1.keySet()) {
            if (dict2.containsKey(key) && dict2.get(key).equals(dict1.get(key))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "rat", t = "car";
        No_242_isAnagram N242 = new No_242_isAnagram();
        Boolean res = N242.No_242_isAnagram(s, t);
        System.out.println(res);
    }
}
