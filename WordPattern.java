import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> charToWordMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (!charToWordMap.containsKey(c)) {
                // Make sure no other key maps to this word
                if (charToWordMap.containsValue(word)) {
                    return false;
                }
                charToWordMap.put(c, word);
            } else {
                String mappedWord = charToWordMap.get(c);
                if (!mappedWord.equals(word)) {
                    return false;
                }
            }
        }

        return true;
    }
}
