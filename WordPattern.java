import java.util.*;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {

        HashMap<String, Integer> h = new HashMap<>();
        HashMap<String, Integer> h1 = new HashMap<>();

        String[] sp = s.split(" ");

        if (pattern.length() != sp.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {

            char c = pattern.charAt(i);
            String sPattern = String.valueOf(c);
            String sWord = sp[i];

            if (!h.containsKey(sPattern)) {
                h.put(sPattern, i);
            }
            if (!h1.containsKey(sWord)) {
                h1.put(sWord, i);
            }
            if (h.get(sPattern) != h1.get(sWord)) {
                return false;
            }
        }
        return true;
    }
}
