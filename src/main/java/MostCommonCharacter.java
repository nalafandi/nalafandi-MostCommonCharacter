
import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap <Character, Integer> hm = new HashMap<>(); 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)) {
                int old = hm.get(ch);
                int now = old + 1;
                hm.put(ch, now);
            } else {  
                hm.put(ch, 1);
            }
        }

        char max = str.charAt(0);
        
        for (Character key : hm.keySet()) {
            if (hm.get(key) > hm.get(max))
            max = key;
        }
        return max;
    }
}
