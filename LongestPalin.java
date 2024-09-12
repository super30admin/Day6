import java.util.*;

public class LongestPalin {
    public int longestPalin(String s) {
        HashSet<Character> hS = new HashSet<>();
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);

            if (!hS.contains(sc)) {
                hS.add(sc);
            } else {
                hS.remove(sc);
                length += 2;
            }
        }
        if (!hS.isEmpty()) {
            length++;
        }
        return length;
    }
}
