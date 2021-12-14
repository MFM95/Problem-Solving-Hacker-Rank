import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String [] args) {

    }
}

class Solution {
    public static char find(String s, String t) {
        char c = ' ';
        String firstS = St
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length() ; i++) {
            if (map1.containsKey(s)) {
                map1[s[i]]++;
            } else {
                map1.put(s[i], 1) [s[i]] = 1;
            }
        }

        return c;
    }
}
