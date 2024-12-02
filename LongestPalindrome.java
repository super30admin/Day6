// TIME: O(n);
// SPACE: O(n);
// SUCCESS on LeetCode

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            // if (frequencyMap.containsKey(s.charAt(i))) {
            //     int count = frequencyMap.get(s.charAt(i)) + 1;
            // } else {
            //     frequencyMap
            // }
            frequencyMap.put(s.charAt(i), frequencyMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        
        int count = 0;
        int oddLetters = 0;
        for (char c : frequencyMap.keySet()) {
            if (frequencyMap.get(c) % 2 == 0) {
                count += frequencyMap.get(c);
            } else {
                count += frequencyMap.get(c) - 1;
                oddLetters = 1;
            }
        }
        
        return count + oddLetters;
    }
}
