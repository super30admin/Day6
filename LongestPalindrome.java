import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Time Complexity: O(N)
 * Space Complexity : O(1)
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int counter = 0;
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hashSet.contains(c)) {
                counter = counter + 2;
                hashSet.remove(c);
            } else {
                hashSet.add(c);
            }
        }
        if (hashSet.size() > 0) {
            counter += 1;
        }
        return counter;
    }

    // Using HashMap
    public int longestPalindrome(String s) {
        int count = 0;
        Map<Character, Integer> hashMap = new HashMap<>();
        // Storing key value in the hashMap
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                int value = hashMap.get(s.charAt(i));
                if (value % 2 == 0) {
                    count += hashMap.get(s.charAt(i));
                    hashMap.remove(s.charAt(i));
                } else {
                    count += hashMap.get(s.charAt(i)) - 1;
                    hashMap.put(s.charAt(i), 1);
                }
            }
        }

        if (hashMap.size() > 0) {
            count++;
        }

        return count;
    }
}
