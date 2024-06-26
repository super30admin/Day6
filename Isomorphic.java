import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> charMappingMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if (!charMappingMap.containsKey(original)) {
                if (!charMappingMap.containsValue(replacement)) {
                    charMappingMap.put(original, replacement);
                } else {
                    return false;
                }
            } else {
                char mappedCharacter = charMappingMap.get(original);
                if (mappedCharacter != replacement) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "badc";
        String t1 = "kikp";
        System.out.println("Isomorphic: " + solution.isIsomorphic(s1, t1)); // Output: false

        String s2 = "egg";
        String t2 = "add";
        System.out.println("Isomorphic: " + solution.isIsomorphic(s2, t2)); // Output: true
    }
}
